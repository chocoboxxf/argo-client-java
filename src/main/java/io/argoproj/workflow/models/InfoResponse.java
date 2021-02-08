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
import io.argoproj.workflow.models.Link;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InfoResponse
 */

public class InfoResponse {
  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;

  public static final String SERIALIZED_NAME_MANAGED_NAMESPACE = "managedNamespace";
  @SerializedName(SERIALIZED_NAME_MANAGED_NAMESPACE)
  private String managedNamespace;


  public InfoResponse links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public InfoResponse addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Link>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Link> getLinks() {
    return links;
  }


  public void setLinks(List<Link> links) {
    this.links = links;
  }


  public InfoResponse managedNamespace(String managedNamespace) {
    
    this.managedNamespace = managedNamespace;
    return this;
  }

   /**
   * Get managedNamespace
   * @return managedNamespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagedNamespace() {
    return managedNamespace;
  }


  public void setManagedNamespace(String managedNamespace) {
    this.managedNamespace = managedNamespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoResponse infoResponse = (InfoResponse) o;
    return Objects.equals(this.links, infoResponse.links) &&
        Objects.equals(this.managedNamespace, infoResponse.managedNamespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, managedNamespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoResponse {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    managedNamespace: ").append(toIndentedString(managedNamespace)).append("\n");
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

