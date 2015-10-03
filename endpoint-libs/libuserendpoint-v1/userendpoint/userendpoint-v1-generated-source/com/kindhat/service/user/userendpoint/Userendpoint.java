/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-08-03 17:34:38 UTC)
 * on 2015-10-03 at 00:51:52 UTC 
 * Modify at your own risk.
 */

package com.kindhat.service.user.userendpoint;

/**
 * Service definition for Userendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link UserendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Userendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the userendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://kindhat-service.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "userendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Userendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Userendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getUser".
   *
   * This request holds the parameters needed by the userendpoint server.  After setting any optional
   * parameters, call the {@link GetUser#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetUser getUser(java.lang.Long id) throws java.io.IOException {
    GetUser result = new GetUser(id);
    initialize(result);
    return result;
  }

  public class GetUser extends UserendpointRequest<com.kindhat.service.user.userendpoint.model.User> {

    private static final String REST_PATH = "user/{id}";

    /**
     * Create a request for the method "getUser".
     *
     * This request holds the parameters needed by the the userendpoint server.  After setting any
     * optional parameters, call the {@link GetUser#execute()} method to invoke the remote operation.
     * <p> {@link
     * GetUser#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetUser(java.lang.Long id) {
      super(Userendpoint.this, "GET", REST_PATH, null, com.kindhat.service.user.userendpoint.model.User.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetUser setAlt(java.lang.String alt) {
      return (GetUser) super.setAlt(alt);
    }

    @Override
    public GetUser setFields(java.lang.String fields) {
      return (GetUser) super.setFields(fields);
    }

    @Override
    public GetUser setKey(java.lang.String key) {
      return (GetUser) super.setKey(key);
    }

    @Override
    public GetUser setOauthToken(java.lang.String oauthToken) {
      return (GetUser) super.setOauthToken(oauthToken);
    }

    @Override
    public GetUser setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetUser) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetUser setQuotaUser(java.lang.String quotaUser) {
      return (GetUser) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetUser setUserIp(java.lang.String userIp) {
      return (GetUser) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetUser setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetUser set(String parameterName, Object value) {
      return (GetUser) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getUserByExternalId".
   *
   * This request holds the parameters needed by the userendpoint server.  After setting any optional
   * parameters, call the {@link GetUserByExternalId#execute()} method to invoke the remote operation.
   *
   * @param externalId
   * @param externalIdType
   * @return the request
   */
  public GetUserByExternalId getUserByExternalId(java.lang.String externalId, java.lang.String externalIdType) throws java.io.IOException {
    GetUserByExternalId result = new GetUserByExternalId(externalId, externalIdType);
    initialize(result);
    return result;
  }

  public class GetUserByExternalId extends UserendpointRequest<com.kindhat.service.user.userendpoint.model.User> {

    private static final String REST_PATH = "user/{externalId}/{externalIdType}";

    /**
     * Create a request for the method "getUserByExternalId".
     *
     * This request holds the parameters needed by the the userendpoint server.  After setting any
     * optional parameters, call the {@link GetUserByExternalId#execute()} method to invoke the remote
     * operation. <p> {@link GetUserByExternalId#initialize(com.google.api.client.googleapis.services.
     * AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param externalId
     * @param externalIdType
     * @since 1.13
     */
    protected GetUserByExternalId(java.lang.String externalId, java.lang.String externalIdType) {
      super(Userendpoint.this, "GET", REST_PATH, null, com.kindhat.service.user.userendpoint.model.User.class);
      this.externalId = com.google.api.client.util.Preconditions.checkNotNull(externalId, "Required parameter externalId must be specified.");
      this.externalIdType = com.google.api.client.util.Preconditions.checkNotNull(externalIdType, "Required parameter externalIdType must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetUserByExternalId setAlt(java.lang.String alt) {
      return (GetUserByExternalId) super.setAlt(alt);
    }

    @Override
    public GetUserByExternalId setFields(java.lang.String fields) {
      return (GetUserByExternalId) super.setFields(fields);
    }

    @Override
    public GetUserByExternalId setKey(java.lang.String key) {
      return (GetUserByExternalId) super.setKey(key);
    }

    @Override
    public GetUserByExternalId setOauthToken(java.lang.String oauthToken) {
      return (GetUserByExternalId) super.setOauthToken(oauthToken);
    }

    @Override
    public GetUserByExternalId setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetUserByExternalId) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetUserByExternalId setQuotaUser(java.lang.String quotaUser) {
      return (GetUserByExternalId) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetUserByExternalId setUserIp(java.lang.String userIp) {
      return (GetUserByExternalId) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String externalId;

    /**

     */
    public java.lang.String getExternalId() {
      return externalId;
    }

    public GetUserByExternalId setExternalId(java.lang.String externalId) {
      this.externalId = externalId;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String externalIdType;

    /**

     */
    public java.lang.String getExternalIdType() {
      return externalIdType;
    }

    public GetUserByExternalId setExternalIdType(java.lang.String externalIdType) {
      this.externalIdType = externalIdType;
      return this;
    }

    @Override
    public GetUserByExternalId set(String parameterName, Object value) {
      return (GetUserByExternalId) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertUser".
   *
   * This request holds the parameters needed by the userendpoint server.  After setting any optional
   * parameters, call the {@link InsertUser#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.kindhat.service.user.userendpoint.model.User}
   * @return the request
   */
  public InsertUser insertUser(com.kindhat.service.user.userendpoint.model.User content) throws java.io.IOException {
    InsertUser result = new InsertUser(content);
    initialize(result);
    return result;
  }

  public class InsertUser extends UserendpointRequest<com.kindhat.service.user.userendpoint.model.User> {

    private static final String REST_PATH = "user";

    /**
     * Create a request for the method "insertUser".
     *
     * This request holds the parameters needed by the the userendpoint server.  After setting any
     * optional parameters, call the {@link InsertUser#execute()} method to invoke the remote
     * operation. <p> {@link
     * InsertUser#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.kindhat.service.user.userendpoint.model.User}
     * @since 1.13
     */
    protected InsertUser(com.kindhat.service.user.userendpoint.model.User content) {
      super(Userendpoint.this, "POST", REST_PATH, content, com.kindhat.service.user.userendpoint.model.User.class);
    }

    @Override
    public InsertUser setAlt(java.lang.String alt) {
      return (InsertUser) super.setAlt(alt);
    }

    @Override
    public InsertUser setFields(java.lang.String fields) {
      return (InsertUser) super.setFields(fields);
    }

    @Override
    public InsertUser setKey(java.lang.String key) {
      return (InsertUser) super.setKey(key);
    }

    @Override
    public InsertUser setOauthToken(java.lang.String oauthToken) {
      return (InsertUser) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertUser setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertUser) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertUser setQuotaUser(java.lang.String quotaUser) {
      return (InsertUser) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertUser setUserIp(java.lang.String userIp) {
      return (InsertUser) super.setUserIp(userIp);
    }

    @Override
    public InsertUser set(String parameterName, Object value) {
      return (InsertUser) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateUser".
   *
   * This request holds the parameters needed by the userendpoint server.  After setting any optional
   * parameters, call the {@link UpdateUser#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.kindhat.service.user.userendpoint.model.User}
   * @return the request
   */
  public UpdateUser updateUser(com.kindhat.service.user.userendpoint.model.User content) throws java.io.IOException {
    UpdateUser result = new UpdateUser(content);
    initialize(result);
    return result;
  }

  public class UpdateUser extends UserendpointRequest<com.kindhat.service.user.userendpoint.model.User> {

    private static final String REST_PATH = "user";

    /**
     * Create a request for the method "updateUser".
     *
     * This request holds the parameters needed by the the userendpoint server.  After setting any
     * optional parameters, call the {@link UpdateUser#execute()} method to invoke the remote
     * operation. <p> {@link
     * UpdateUser#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.kindhat.service.user.userendpoint.model.User}
     * @since 1.13
     */
    protected UpdateUser(com.kindhat.service.user.userendpoint.model.User content) {
      super(Userendpoint.this, "PUT", REST_PATH, content, com.kindhat.service.user.userendpoint.model.User.class);
    }

    @Override
    public UpdateUser setAlt(java.lang.String alt) {
      return (UpdateUser) super.setAlt(alt);
    }

    @Override
    public UpdateUser setFields(java.lang.String fields) {
      return (UpdateUser) super.setFields(fields);
    }

    @Override
    public UpdateUser setKey(java.lang.String key) {
      return (UpdateUser) super.setKey(key);
    }

    @Override
    public UpdateUser setOauthToken(java.lang.String oauthToken) {
      return (UpdateUser) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateUser setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateUser) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateUser setQuotaUser(java.lang.String quotaUser) {
      return (UpdateUser) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateUser setUserIp(java.lang.String userIp) {
      return (UpdateUser) super.setUserIp(userIp);
    }

    @Override
    public UpdateUser set(String parameterName, Object value) {
      return (UpdateUser) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Userendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Userendpoint}. */
    @Override
    public Userendpoint build() {
      return new Userendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link UserendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setUserendpointRequestInitializer(
        UserendpointRequestInitializer userendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(userendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
