/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: VERSION
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1Backoff;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1TLSConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IoArgoprojEventsV1alpha1EmitterEventSource
 */

public class IoArgoprojEventsV1alpha1EmitterEventSource {
  public static final String SERIALIZED_NAME_BROKER = "broker";
  @SerializedName(SERIALIZED_NAME_BROKER)
  private String broker;

  public static final String SERIALIZED_NAME_CHANNEL_KEY = "channelKey";
  @SerializedName(SERIALIZED_NAME_CHANNEL_KEY)
  private String channelKey;

  public static final String SERIALIZED_NAME_CHANNEL_NAME = "channelName";
  @SerializedName(SERIALIZED_NAME_CHANNEL_NAME)
  private String channelName;

  public static final String SERIALIZED_NAME_CONNECTION_BACKOFF = "connectionBackoff";
  @SerializedName(SERIALIZED_NAME_CONNECTION_BACKOFF)
  private IoArgoprojEventsV1alpha1Backoff connectionBackoff;

  public static final String SERIALIZED_NAME_JSON_BODY = "jsonBody";
  @SerializedName(SERIALIZED_NAME_JSON_BODY)
  private Boolean jsonBody;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector password;

  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  private IoArgoprojEventsV1alpha1TLSConfig tls;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector username;


  public IoArgoprojEventsV1alpha1EmitterEventSource broker(String broker) {
    
    this.broker = broker;
    return this;
  }

   /**
   * Broker URI to connect to.
   * @return broker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Broker URI to connect to.")

  public String getBroker() {
    return broker;
  }


  public void setBroker(String broker) {
    this.broker = broker;
  }


  public IoArgoprojEventsV1alpha1EmitterEventSource channelKey(String channelKey) {
    
    this.channelKey = channelKey;
    return this;
  }

   /**
   * Get channelKey
   * @return channelKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChannelKey() {
    return channelKey;
  }


  public void setChannelKey(String channelKey) {
    this.channelKey = channelKey;
  }


  public IoArgoprojEventsV1alpha1EmitterEventSource channelName(String channelName) {
    
    this.channelName = channelName;
    return this;
  }

   /**
   * Get channelName
   * @return channelName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChannelName() {
    return channelName;
  }


  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }


  public IoArgoprojEventsV1alpha1EmitterEventSource connectionBackoff(IoArgoprojEventsV1alpha1Backoff connectionBackoff) {
    
    this.connectionBackoff = connectionBackoff;
    return this;
  }

   /**
   * Get connectionBackoff
   * @return connectionBackoff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1Backoff getConnectionBackoff() {
    return connectionBackoff;
  }


  public void setConnectionBackoff(IoArgoprojEventsV1alpha1Backoff connectionBackoff) {
    this.connectionBackoff = connectionBackoff;
  }


  public IoArgoprojEventsV1alpha1EmitterEventSource jsonBody(Boolean jsonBody) {
    
    this.jsonBody = jsonBody;
    return this;
  }

   /**
   * Get jsonBody
   * @return jsonBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getJsonBody() {
    return jsonBody;
  }


  public void setJsonBody(Boolean jsonBody) {
    this.jsonBody = jsonBody;
  }


  public IoArgoprojEventsV1alpha1EmitterEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public IoArgoprojEventsV1alpha1EmitterEventSource putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public IoArgoprojEventsV1alpha1EmitterEventSource password(io.kubernetes.client.openapi.models.V1SecretKeySelector password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getPassword() {
    return password;
  }


  public void setPassword(io.kubernetes.client.openapi.models.V1SecretKeySelector password) {
    this.password = password;
  }


  public IoArgoprojEventsV1alpha1EmitterEventSource tls(IoArgoprojEventsV1alpha1TLSConfig tls) {
    
    this.tls = tls;
    return this;
  }

   /**
   * Get tls
   * @return tls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1TLSConfig getTls() {
    return tls;
  }


  public void setTls(IoArgoprojEventsV1alpha1TLSConfig tls) {
    this.tls = tls;
  }


  public IoArgoprojEventsV1alpha1EmitterEventSource username(io.kubernetes.client.openapi.models.V1SecretKeySelector username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getUsername() {
    return username;
  }


  public void setUsername(io.kubernetes.client.openapi.models.V1SecretKeySelector username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1EmitterEventSource ioArgoprojEventsV1alpha1EmitterEventSource = (IoArgoprojEventsV1alpha1EmitterEventSource) o;
    return Objects.equals(this.broker, ioArgoprojEventsV1alpha1EmitterEventSource.broker) &&
        Objects.equals(this.channelKey, ioArgoprojEventsV1alpha1EmitterEventSource.channelKey) &&
        Objects.equals(this.channelName, ioArgoprojEventsV1alpha1EmitterEventSource.channelName) &&
        Objects.equals(this.connectionBackoff, ioArgoprojEventsV1alpha1EmitterEventSource.connectionBackoff) &&
        Objects.equals(this.jsonBody, ioArgoprojEventsV1alpha1EmitterEventSource.jsonBody) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1EmitterEventSource.metadata) &&
        Objects.equals(this.password, ioArgoprojEventsV1alpha1EmitterEventSource.password) &&
        Objects.equals(this.tls, ioArgoprojEventsV1alpha1EmitterEventSource.tls) &&
        Objects.equals(this.username, ioArgoprojEventsV1alpha1EmitterEventSource.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(broker, channelKey, channelName, connectionBackoff, jsonBody, metadata, password, tls, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1EmitterEventSource {\n");
    sb.append("    broker: ").append(toIndentedString(broker)).append("\n");
    sb.append("    channelKey: ").append(toIndentedString(channelKey)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
    sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
