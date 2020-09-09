/*
 * Argo
 * Argo
 *
 * The version of the OpenAPI document: v2.10.1
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
import io.argoproj.workflow.models.IoK8sApiCoreV1NodeSelectorTerm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it&#39;s a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
 */
@ApiModel(description = "An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).")

public class IoK8sApiCoreV1PreferredSchedulingTerm {
  public static final String SERIALIZED_NAME_PREFERENCE = "preference";
  @SerializedName(SERIALIZED_NAME_PREFERENCE)
  private IoK8sApiCoreV1NodeSelectorTerm preference;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;


  public IoK8sApiCoreV1PreferredSchedulingTerm preference(IoK8sApiCoreV1NodeSelectorTerm preference) {
    
    this.preference = preference;
    return this;
  }

   /**
   * Get preference
   * @return preference
  **/
  @ApiModelProperty(required = true, value = "")

  public IoK8sApiCoreV1NodeSelectorTerm getPreference() {
    return preference;
  }


  public void setPreference(IoK8sApiCoreV1NodeSelectorTerm preference) {
    this.preference = preference;
  }


  public IoK8sApiCoreV1PreferredSchedulingTerm weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.")

  public Integer getWeight() {
    return weight;
  }


  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1PreferredSchedulingTerm ioK8sApiCoreV1PreferredSchedulingTerm = (IoK8sApiCoreV1PreferredSchedulingTerm) o;
    return Objects.equals(this.preference, ioK8sApiCoreV1PreferredSchedulingTerm.preference) &&
        Objects.equals(this.weight, ioK8sApiCoreV1PreferredSchedulingTerm.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preference, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PreferredSchedulingTerm {\n");
    sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
