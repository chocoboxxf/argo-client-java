/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.12.7
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
import io.argoproj.workflow.models.Header;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HTTPArtifact allows an file served on HTTP to be placed as an input artifact in a container
 */
@ApiModel(description = "HTTPArtifact allows an file served on HTTP to be placed as an input artifact in a container")

public class HTTPArtifact {
  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private List<Header> headers = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public HTTPArtifact headers(List<Header> headers) {
    
    this.headers = headers;
    return this;
  }

  public HTTPArtifact addHeadersItem(Header headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<Header>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Headers are an optional list of headers to send with HTTP requests for artifacts
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Headers are an optional list of headers to send with HTTP requests for artifacts")

  public List<Header> getHeaders() {
    return headers;
  }


  public void setHeaders(List<Header> headers) {
    this.headers = headers;
  }


  public HTTPArtifact url(String url) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPArtifact htTPArtifact = (HTTPArtifact) o;
    return Objects.equals(this.headers, htTPArtifact.headers) &&
        Objects.equals(this.url, htTPArtifact.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPArtifact {\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

