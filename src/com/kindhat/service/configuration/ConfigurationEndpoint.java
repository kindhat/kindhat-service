package com.kindhat.service.configuration;

import com.kindhat.service.common.PMF;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.datanucleus.query.JDOCursorHelper;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@Api(name = "configurationendpoint", 
	namespace = @ApiNamespace(ownerDomain = "kindhat.com",
						      ownerName = "kindhat.com", 
						      packagePath = "service.configuration"))
public class ConfigurationEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listConfiguration")
	public CollectionResponse<Configuration> listConfiguration(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<Configuration> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(Configuration.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<Configuration>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Configuration obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Configuration> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}
	
	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities persisted
	 */
	@SuppressWarnings({ "unchecked" })
	@ApiMethod(name = "getAllConfiguration")
	public Configuration[] getAllConfiguration() {

		PersistenceManager mgr = null;
		List<Configuration> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(Configuration.class);
			execute = (List<Configuration>) query.execute();
		} finally {
			mgr.close();
		}

		return execute.toArray(new Configuration[execute.size()]);
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getConfiguration")
	public Configuration getConfiguration(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Configuration configuration = null;
		try {
			configuration = mgr.getObjectById(Configuration.class, id);
		} finally {
			mgr.close();
		}
		return configuration;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param configuration the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertConfiguration")
	public Configuration insertConfiguration(Configuration configuration) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			if(configuration.getId() != null) {				
				if (containsConfiguration(configuration)) {
					throw new EntityExistsException("Object already exists");
				}
			}
			mgr.makePersistent(configuration);
		} finally {
			mgr.close();
		}
		return configuration;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param configuration the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateConfiguration")
	public Configuration updateConfiguration(Configuration configuration) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			if (!containsConfiguration(configuration)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.makePersistent(configuration);
		} finally {
			mgr.close();
		}
		return configuration;
	}

	private boolean containsConfiguration(Configuration configuration) {
		PersistenceManager mgr = getPersistenceManager();
		boolean contains = true;
		try {
			mgr.getObjectById(Configuration.class, configuration.getId());
		} catch (javax.jdo.JDOObjectNotFoundException ex) {
			contains = false;
		} finally {
			mgr.close();
		}
		return contains;
	}

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}

}
