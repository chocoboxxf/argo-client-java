/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.12.1
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
import io.argoproj.workflow.models.LabelSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
 */
@ApiModel(description = "PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.")

public class IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec {
  public static final String SERIALIZED_NAME_MAX_UNAVAILABLE = "maxUnavailable";
  @SerializedName(SERIALIZED_NAME_MAX_UNAVAILABLE)
  private Object maxUnavailable;

  public static final String SERIALIZED_NAME_MIN_AVAILABLE = "minAvailable";
  @SerializedName(SERIALIZED_NAME_MIN_AVAILABLE)
  private Object minAvailable;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private LabelSelector selector;


  public IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec maxUnavailable(Object maxUnavailable) {
    
    this.maxUnavailable = maxUnavailable;
    return this;
  }

   /**
   * Get maxUnavailable
   * @return maxUnavailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMaxUnavailable() {
    return maxUnavailable;
  }


  public void setMaxUnavailable(Object maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
  }


  public IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec minAvailable(Object minAvailable) {
    
    this.minAvailable = minAvailable;
    return this;
  }

   /**
   * Get minAvailable
   * @return minAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMinAvailable() {
    return minAvailable;
  }


  public void setMinAvailable(Object minAvailable) {
    this.minAvailable = minAvailable;
  }


  public IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec selector(LabelSelector selector) {
    
    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LabelSelector getSelector() {
    return selector;
  }


  public void setSelector(LabelSelector selector) {
    this.selector = selector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec ioK8sApiPolicyV1beta1PodDisruptionBudgetSpec = (IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec) o;
    return Objects.equals(this.maxUnavailable, ioK8sApiPolicyV1beta1PodDisruptionBudgetSpec.maxUnavailable) &&
        Objects.equals(this.minAvailable, ioK8sApiPolicyV1beta1PodDisruptionBudgetSpec.minAvailable) &&
        Objects.equals(this.selector, ioK8sApiPolicyV1beta1PodDisruptionBudgetSpec.selector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxUnavailable, minAvailable, selector);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec {\n");
    sb.append("    maxUnavailable: ").append(toIndentedString(maxUnavailable)).append("\n");
    sb.append("    minAvailable: ").append(toIndentedString(minAvailable)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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

