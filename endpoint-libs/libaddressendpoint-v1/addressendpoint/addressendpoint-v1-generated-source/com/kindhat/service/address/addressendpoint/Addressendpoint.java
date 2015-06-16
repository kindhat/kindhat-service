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
 * (build: 2015-03-26 20:30:19 UTC)
 * on 2015-04-27 at 21:57:08 UTC 
 * Modify at your own risk.
 */

package com.kindhat.service.address.addressendpoint;

/**
 * Service definition for Addressendpoint (v1).
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
 * This service uses {@link AddressendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Addressendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the addressendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
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
  public static final String DEFAULT_SERVICE_PATH = "addressendpoint/v1/verifyAddress/";

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
  public Addressendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Addressendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "verifyAddress".
   *
   * This request holds the parameters needed by the addressendpoint server.  After setting any
   * optional parameters, call the {@link VerifyAddress#execute()} method to invoke the remote
   * operation.
   *
   * @param street
   * @param postalCode
   * @return the request
   */
  public VerifyAddress verifyAddress(java.lang.String street, java.lang.String postalCode) throws java.io.IOException {
    VerifyAddress result = new VerifyAddress(street, postalCode);
    initialize(result);
    return result;
  }

  public class VerifyAddress extends AddressendpointRequest<com.kindhat.service.address.addressendpoint.model.AddressCollection> {

    private static final String REST_PATH = "{street}/{postalCode}";

    /**
     * Create a request for the method "verifyAddress".
     *
     * This request holds the parameters needed by the the addressendpoint server.  After setting any
     * optional parameters, call the {@link VerifyAddress#execute()} method to invoke the remote
     * operation. <p> {@link VerifyAddress#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param street
     * @param postalCode
     * @since 1.13
     */
    protected VerifyAddress(java.lang.String street, java.lang.String postalCode) {
      super(Addressendpoint.this, "GET", REST_PATH, null, com.kindhat.service.address.addressendpoint.model.AddressCollection.class);
      this.street = com.google.api.client.util.Preconditions.checkNotNull(street, "Required parameter street must be specified.");
      this.postalCode = com.google.api.client.util.Preconditions.checkNotNull(postalCode, "Required parameter postalCode must be specified.");
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
    public VerifyAddress setAlt(java.lang.String alt) {
      return (VerifyAddress) super.setAlt(alt);
    }

    @Override
    public VerifyAddress setFields(java.lang.String fields) {
      return (VerifyAddress) super.setFields(fields);
    }

    @Override
    public VerifyAddress setKey(java.lang.String key) {
      return (VerifyAddress) super.setKey(key);
    }

    @Override
    public VerifyAddress setOauthToken(java.lang.String oauthToken) {
      return (VerifyAddress) super.setOauthToken(oauthToken);
    }

    @Override
    public VerifyAddress setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (VerifyAddress) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public VerifyAddress setQuotaUser(java.lang.String quotaUser) {
      return (VerifyAddress) super.setQuotaUser(quotaUser);
    }

    @Override
    public VerifyAddress setUserIp(java.lang.String userIp) {
      return (VerifyAddress) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String street;

    /**

     */
    public java.lang.String getStreet() {
      return street;
    }

    public VerifyAddress setStreet(java.lang.String street) {
      this.street = street;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String postalCode;

    /**

     */
    public java.lang.String getPostalCode() {
      return postalCode;
    }

    public VerifyAddress setPostalCode(java.lang.String postalCode) {
      this.postalCode = postalCode;
      return this;
    }

    @Override
    public VerifyAddress set(String parameterName, Object value) {
      return (VerifyAddress) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Addressendpoint}.
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

    /** Builds a new instance of {@link Addressendpoint}. */
    @Override
    public Addressendpoint build() {
      return new Addressendpoint(this);
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
     * Set the {@link AddressendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setAddressendpointRequestInitializer(
        AddressendpointRequestInitializer addressendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(addressendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
