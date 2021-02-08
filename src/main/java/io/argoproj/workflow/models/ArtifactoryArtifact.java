/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.12.8
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
 * ArtifactoryArtifact is the location of an artifactory artifact
 */
@ApiModel(description = "ArtifactoryArtifact is the location of an artifactory artifact")

public class ArtifactoryArtifact {
  public static final String SERIALIZED_NAME_PASSWORD_SECRET = "passwordSecret";
  @SerializedName(SERIALIZED_NAME_PASSWORD_SECRET)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector passwordSecret;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_USERNAME_SECRET = "usernameSecret";
  @SerializedName(SERIALIZED_NAME_USERNAME_SECRET)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector usernameSecret;


  public ArtifactoryArtifact passwordSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector passwordSecret) {
    
    this.passwordSecret = passwordSecret;
    return this;
  }

   /**
   * Get passwordSecret
   * @return passwordSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getPasswordSecret() {
    return passwordSecret;
  }


  public void setPasswordSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector passwordSecret) {
    this.passwordSecret = passwordSecret;
  }


  public ArtifactoryArtifact url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL of the artifact
   * @return url
  **/
  @ApiModelProperty(required = true, value = "URL of the artifact")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public ArtifactoryArtifact usernameSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector usernameSecret) {
    
    this.usernameSecret = usernameSecret;
    return this;
  }

   /**
   * Get usernameSecret
   * @return usernameSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getUsernameSecret() {
    return usernameSecret;
  }


  public void setUsernameSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector usernameSecret) {
    this.usernameSecret = usernameSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactoryArtifact artifactoryArtifact = (ArtifactoryArtifact) o;
    return Objects.equals(this.passwordSecret, artifactoryArtifact.passwordSecret) &&
        Objects.equals(this.url, artifactoryArtifact.url) &&
        Objects.equals(this.usernameSecret, artifactoryArtifact.usernameSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwordSecret, url, usernameSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactoryArtifact {\n");
    sb.append("    passwordSecret: ").append(toIndentedString(passwordSecret)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    usernameSecret: ").append(toIndentedString(usernameSecret)).append("\n");
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

