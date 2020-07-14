/*
 * Argo
 * Argo
 *
 * The version of the OpenAPI document: v2.9.2
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
import io.argoproj.workflow.models.SubmitOpts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WorkflowSubmitRequest
 */

public class WorkflowSubmitRequest {
  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_RESOURCE_KIND = "resourceKind";
  @SerializedName(SERIALIZED_NAME_RESOURCE_KIND)
  private String resourceKind;

  public static final String SERIALIZED_NAME_RESOURCE_NAME = "resourceName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAME)
  private String resourceName;

  public static final String SERIALIZED_NAME_SUBMIT_OPTIONS = "submitOptions";
  @SerializedName(SERIALIZED_NAME_SUBMIT_OPTIONS)
  private SubmitOpts submitOptions;


  public WorkflowSubmitRequest namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public WorkflowSubmitRequest resourceKind(String resourceKind) {
    
    this.resourceKind = resourceKind;
    return this;
  }

   /**
   * Get resourceKind
   * @return resourceKind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceKind() {
    return resourceKind;
  }


  public void setResourceKind(String resourceKind) {
    this.resourceKind = resourceKind;
  }


  public WorkflowSubmitRequest resourceName(String resourceName) {
    
    this.resourceName = resourceName;
    return this;
  }

   /**
   * Get resourceName
   * @return resourceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceName() {
    return resourceName;
  }


  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }


  public WorkflowSubmitRequest submitOptions(SubmitOpts submitOptions) {
    
    this.submitOptions = submitOptions;
    return this;
  }

   /**
   * Get submitOptions
   * @return submitOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubmitOpts getSubmitOptions() {
    return submitOptions;
  }


  public void setSubmitOptions(SubmitOpts submitOptions) {
    this.submitOptions = submitOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowSubmitRequest workflowSubmitRequest = (WorkflowSubmitRequest) o;
    return Objects.equals(this.namespace, workflowSubmitRequest.namespace) &&
        Objects.equals(this.resourceKind, workflowSubmitRequest.resourceKind) &&
        Objects.equals(this.resourceName, workflowSubmitRequest.resourceName) &&
        Objects.equals(this.submitOptions, workflowSubmitRequest.submitOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, resourceKind, resourceName, submitOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowSubmitRequest {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    resourceKind: ").append(toIndentedString(resourceKind)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    submitOptions: ").append(toIndentedString(submitOptions)).append("\n");
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

