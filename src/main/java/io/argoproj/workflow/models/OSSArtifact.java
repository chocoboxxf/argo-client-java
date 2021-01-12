/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.12.4
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OSSArtifact is the location of an Alibaba Cloud OSS artifact
 */
@ApiModel(description = "OSSArtifact is the location of an Alibaba Cloud OSS artifact")

public class OSSArtifact {
  public static final String SERIALIZED_NAME_ACCESS_KEY_SECRET = "accessKeySecret";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY_SECRET)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector accessKeySecret;

  public static final String SERIALIZED_NAME_BUCKET = "bucket";
  @SerializedName(SERIALIZED_NAME_BUCKET)
  private String bucket;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_SECRET_KEY_SECRET = "secretKeySecret";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY_SECRET)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector secretKeySecret;


  public OSSArtifact accessKeySecret(io.kubernetes.client.openapi.models.V1SecretKeySelector accessKeySecret) {
    
    this.accessKeySecret = accessKeySecret;
    return this;
  }

   /**
   * Get accessKeySecret
   * @return accessKeySecret
  **/
  @ApiModelProperty(required = true, value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getAccessKeySecret() {
    return accessKeySecret;
  }


  public void setAccessKeySecret(io.kubernetes.client.openapi.models.V1SecretKeySelector accessKeySecret) {
    this.accessKeySecret = accessKeySecret;
  }


  public OSSArtifact bucket(String bucket) {
    
    this.bucket = bucket;
    return this;
  }

   /**
   * Bucket is the name of the bucket
   * @return bucket
  **/
  @ApiModelProperty(required = true, value = "Bucket is the name of the bucket")

  public String getBucket() {
    return bucket;
  }


  public void setBucket(String bucket) {
    this.bucket = bucket;
  }


  public OSSArtifact endpoint(String endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Endpoint is the hostname of the bucket endpoint
   * @return endpoint
  **/
  @ApiModelProperty(required = true, value = "Endpoint is the hostname of the bucket endpoint")

  public String getEndpoint() {
    return endpoint;
  }


  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  public OSSArtifact key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Key is the path in the bucket where the artifact resides
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Key is the path in the bucket where the artifact resides")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public OSSArtifact secretKeySecret(io.kubernetes.client.openapi.models.V1SecretKeySelector secretKeySecret) {
    
    this.secretKeySecret = secretKeySecret;
    return this;
  }

   /**
   * Get secretKeySecret
   * @return secretKeySecret
  **/
  @ApiModelProperty(required = true, value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getSecretKeySecret() {
    return secretKeySecret;
  }


  public void setSecretKeySecret(io.kubernetes.client.openapi.models.V1SecretKeySelector secretKeySecret) {
    this.secretKeySecret = secretKeySecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSSArtifact osSArtifact = (OSSArtifact) o;
    return Objects.equals(this.accessKeySecret, osSArtifact.accessKeySecret) &&
        Objects.equals(this.bucket, osSArtifact.bucket) &&
        Objects.equals(this.endpoint, osSArtifact.endpoint) &&
        Objects.equals(this.key, osSArtifact.key) &&
        Objects.equals(this.secretKeySecret, osSArtifact.secretKeySecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeySecret, bucket, endpoint, key, secretKeySecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSSArtifact {\n");
    sb.append("    accessKeySecret: ").append(toIndentedString(accessKeySecret)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    secretKeySecret: ").append(toIndentedString(secretKeySecret)).append("\n");
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

