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
import io.argoproj.workflow.models.Event;
import io.argoproj.workflow.models.Submit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WorkflowEventBindingSpec
 */

public class WorkflowEventBindingSpec {
  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private Event event;

  public static final String SERIALIZED_NAME_SUBMIT = "submit";
  @SerializedName(SERIALIZED_NAME_SUBMIT)
  private Submit submit;


  public WorkflowEventBindingSpec event(Event event) {
    
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @ApiModelProperty(required = true, value = "")

  public Event getEvent() {
    return event;
  }


  public void setEvent(Event event) {
    this.event = event;
  }


  public WorkflowEventBindingSpec submit(Submit submit) {
    
    this.submit = submit;
    return this;
  }

   /**
   * Get submit
   * @return submit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Submit getSubmit() {
    return submit;
  }


  public void setSubmit(Submit submit) {
    this.submit = submit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowEventBindingSpec workflowEventBindingSpec = (WorkflowEventBindingSpec) o;
    return Objects.equals(this.event, workflowEventBindingSpec.event) &&
        Objects.equals(this.submit, workflowEventBindingSpec.submit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, submit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowEventBindingSpec {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    submit: ").append(toIndentedString(submit)).append("\n");
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

