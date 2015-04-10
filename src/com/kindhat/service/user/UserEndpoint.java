package com.kindhat.service.user;

import java.util.List;

import com.kindhat.service.common.PMF;
import com.kindhat.service.common.EnumExternalIdType;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@Api(name = "userendpoint", 
	namespace = @ApiNamespace(ownerDomain = "kindhat.com", 
							  ownerName = "kindhat.com", 
							  packagePath = "service.user"))
public class UserEndpoint {

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getUser")
	public User getUser(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		User user = null;
		try {
			user = mgr.getObjectById(User.class, id);
		} finally {
			mgr.close();
		}
		return user;
	}
	
	/**
	 * This method gets the entity having the external id and external id type passed. 
	 * It uses HTTP GET method.
	 *
	 * @param externalId is the identifier that identifies the entity.
	 * @param externalIdType is the identifier type that identifies what authority the id comes from.
	 * @return The entity with primary key id.
	 */
	@SuppressWarnings("unchecked")
	@ApiMethod(name = "getUserByExternalId")
	public User getUserByExternalId(@Named("externalId") String externalId,
									@Named("externalIdType") EnumExternalIdType externalIdType) {
		PersistenceManager mgr = getPersistenceManager();	
		List<User> users = null;
		User user = null;
		try {
			Query query = mgr.newQuery(User.class);
			query.setFilter("externalId == externaldIdParam && externalIdType == externalIdTypeParam");
			query.declareParameters("String externalIdParam, int externalIdTypeParam");
			users = (List<User>) query.execute(externalId.toUpperCase(), externalIdType);
			if(users.isEmpty()) {
				user = new User(); //return an empty object
			}
			else {
				user = users.get(0);
			}
		} finally {
			mgr.close();
		}
		return user;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param user the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertUser")
	public User insertUser(User user) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			if(user.getId() != null) {
				if (containsUser(user)) {
					throw new EntityExistsException("Object already exists");
				}
			}
			mgr.makePersistent(user);
		} finally {
			mgr.close();
		}
		return user;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param user the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateUser")
	public User updateUser(User user) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			if (!containsUser(user)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.makePersistent(user);
		} finally {
			mgr.close();
		}
		return user;
	}	

	private boolean containsUser(User user) {
		PersistenceManager mgr = getPersistenceManager();
		boolean contains = true;
		try {
			mgr.getObjectById(User.class, user.getId());
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
