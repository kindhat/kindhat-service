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
 * (build: 2014-07-22 21:53:01 UTC)
 * on 2014-10-07 at 14:37:44 UTC 
 * Modify at your own risk.
 */

package com.kindhat.service.request.item.requestitemendpoint.model;

/**
 * Model definition for Item.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the requestitemendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Item extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime borrowDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String category;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer duration;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String durationType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String item;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key key;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Key> responses;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String use;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key userId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime when;

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getBorrowDate() {
    return borrowDate;
  }

  /**
   * @param borrowDate borrowDate or {@code null} for none
   */
  public Item setBorrowDate(com.google.api.client.util.DateTime borrowDate) {
    this.borrowDate = borrowDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCategory() {
    return category;
  }

  /**
   * @param category category or {@code null} for none
   */
  public Item setCategory(java.lang.String category) {
    this.category = category;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDuration() {
    return duration;
  }

  /**
   * @param duration duration or {@code null} for none
   */
  public Item setDuration(java.lang.Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDurationType() {
    return durationType;
  }

  /**
   * @param durationType durationType or {@code null} for none
   */
  public Item setDurationType(java.lang.String durationType) {
    this.durationType = durationType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getItem() {
    return item;
  }

  /**
   * @param item item or {@code null} for none
   */
  public Item setItem(java.lang.String item) {
    this.item = item;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Key getKey() {
    return key;
  }

  /**
   * @param key key or {@code null} for none
   */
  public Item setKey(Key key) {
    this.key = key;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * @param message message or {@code null} for none
   */
  public Item setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Key> getResponses() {
    return responses;
  }

  /**
   * @param responses responses or {@code null} for none
   */
  public Item setResponses(java.util.List<Key> responses) {
    this.responses = responses;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUse() {
    return use;
  }

  /**
   * @param use use or {@code null} for none
   */
  public Item setUse(java.lang.String use) {
    this.use = use;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Key getUserId() {
    return userId;
  }

  /**
   * @param userId userId or {@code null} for none
   */
  public Item setUserId(Key userId) {
    this.userId = userId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getWhen() {
    return when;
  }

  /**
   * @param when when or {@code null} for none
   */
  public Item setWhen(com.google.api.client.util.DateTime when) {
    this.when = when;
    return this;
  }

  @Override
  public Item set(String fieldName, Object value) {
    return (Item) super.set(fieldName, value);
  }

  @Override
  public Item clone() {
    return (Item) super.clone();
  }

}