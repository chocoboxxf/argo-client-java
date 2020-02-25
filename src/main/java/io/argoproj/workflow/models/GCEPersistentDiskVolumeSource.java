/*
 * Argo
 * Workflow Service API performs CRUD actions against application resources
 *
 * The version of the OpenAPI document: latest
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
 * Represents a Persistent Disk resource in Google Compute Engine.  A GCE PD must exist before mounting to a container. The disk must also be in the same GCE project and zone as the kubelet. A GCE PD can only be mounted as read/write once or read-only many times. GCE PDs support ownership management and SELinux relabeling.
 */
@ApiModel(description = "Represents a Persistent Disk resource in Google Compute Engine.  A GCE PD must exist before mounting to a container. The disk must also be in the same GCE project and zone as the kubelet. A GCE PD can only be mounted as read/write once or read-only many times. GCE PDs support ownership management and SELinux relabeling.")

public class GCEPersistentDiskVolumeSource {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_PARTITION = "partition";
  @SerializedName(SERIALIZED_NAME_PARTITION)
  private Integer partition;

  public static final String SERIALIZED_NAME_PD_NAME = "pdName";
  @SerializedName(SERIALIZED_NAME_PD_NAME)
  private String pdName;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;


  public GCEPersistentDiskVolumeSource fsType(String fsType) {
    
    this.fsType = fsType;
    return this;
  }

   /**
   * Get fsType
   * @return fsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFsType() {
    return fsType;
  }


  public void setFsType(String fsType) {
    this.fsType = fsType;
  }


  public GCEPersistentDiskVolumeSource partition(Integer partition) {
    
    this.partition = partition;
    return this;
  }

   /**
   * Get partition
   * @return partition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPartition() {
    return partition;
  }


  public void setPartition(Integer partition) {
    this.partition = partition;
  }


  public GCEPersistentDiskVolumeSource pdName(String pdName) {
    
    this.pdName = pdName;
    return this;
  }

   /**
   * Get pdName
   * @return pdName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPdName() {
    return pdName;
  }


  public void setPdName(String pdName) {
    this.pdName = pdName;
  }


  public GCEPersistentDiskVolumeSource readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Get readOnly
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCEPersistentDiskVolumeSource gcEPersistentDiskVolumeSource = (GCEPersistentDiskVolumeSource) o;
    return Objects.equals(this.fsType, gcEPersistentDiskVolumeSource.fsType) &&
        Objects.equals(this.partition, gcEPersistentDiskVolumeSource.partition) &&
        Objects.equals(this.pdName, gcEPersistentDiskVolumeSource.pdName) &&
        Objects.equals(this.readOnly, gcEPersistentDiskVolumeSource.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, partition, pdName, readOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCEPersistentDiskVolumeSource {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    pdName: ").append(toIndentedString(pdName)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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
