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
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1Selector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IoArgoprojEventsV1alpha1ResourceFilter
 */

public class IoArgoprojEventsV1alpha1ResourceFilter {
  public static final String SERIALIZED_NAME_AFTER_START = "afterStart";
  @SerializedName(SERIALIZED_NAME_AFTER_START)
  private Boolean afterStart;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private org.joda.time.DateTime createdBy;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<IoArgoprojEventsV1alpha1Selector> fields = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<IoArgoprojEventsV1alpha1Selector> labels = null;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;


  public IoArgoprojEventsV1alpha1ResourceFilter afterStart(Boolean afterStart) {
    
    this.afterStart = afterStart;
    return this;
  }

   /**
   * Get afterStart
   * @return afterStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAfterStart() {
    return afterStart;
  }


  public void setAfterStart(Boolean afterStart) {
    this.afterStart = afterStart;
  }


  public IoArgoprojEventsV1alpha1ResourceFilter createdBy(org.joda.time.DateTime createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public org.joda.time.DateTime getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(org.joda.time.DateTime createdBy) {
    this.createdBy = createdBy;
  }


  public IoArgoprojEventsV1alpha1ResourceFilter fields(List<IoArgoprojEventsV1alpha1Selector> fields) {
    
    this.fields = fields;
    return this;
  }

  public IoArgoprojEventsV1alpha1ResourceFilter addFieldsItem(IoArgoprojEventsV1alpha1Selector fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<IoArgoprojEventsV1alpha1Selector>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IoArgoprojEventsV1alpha1Selector> getFields() {
    return fields;
  }


  public void setFields(List<IoArgoprojEventsV1alpha1Selector> fields) {
    this.fields = fields;
  }


  public IoArgoprojEventsV1alpha1ResourceFilter labels(List<IoArgoprojEventsV1alpha1Selector> labels) {
    
    this.labels = labels;
    return this;
  }

  public IoArgoprojEventsV1alpha1ResourceFilter addLabelsItem(IoArgoprojEventsV1alpha1Selector labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<IoArgoprojEventsV1alpha1Selector>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IoArgoprojEventsV1alpha1Selector> getLabels() {
    return labels;
  }


  public void setLabels(List<IoArgoprojEventsV1alpha1Selector> labels) {
    this.labels = labels;
  }


  public IoArgoprojEventsV1alpha1ResourceFilter prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1ResourceFilter ioArgoprojEventsV1alpha1ResourceFilter = (IoArgoprojEventsV1alpha1ResourceFilter) o;
    return Objects.equals(this.afterStart, ioArgoprojEventsV1alpha1ResourceFilter.afterStart) &&
        Objects.equals(this.createdBy, ioArgoprojEventsV1alpha1ResourceFilter.createdBy) &&
        Objects.equals(this.fields, ioArgoprojEventsV1alpha1ResourceFilter.fields) &&
        Objects.equals(this.labels, ioArgoprojEventsV1alpha1ResourceFilter.labels) &&
        Objects.equals(this.prefix, ioArgoprojEventsV1alpha1ResourceFilter.prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afterStart, createdBy, fields, labels, prefix);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1ResourceFilter {\n");
    sb.append("    afterStart: ").append(toIndentedString(afterStart)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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
