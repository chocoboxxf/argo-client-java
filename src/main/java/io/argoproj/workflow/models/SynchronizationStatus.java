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
import io.argoproj.workflow.models.MutexStatus;
import io.argoproj.workflow.models.SemaphoreStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SynchronizationStatus stores the status of semaphore and mutex.
 */
@ApiModel(description = "SynchronizationStatus stores the status of semaphore and mutex.")

public class SynchronizationStatus {
  public static final String SERIALIZED_NAME_MUTEX = "mutex";
  @SerializedName(SERIALIZED_NAME_MUTEX)
  private MutexStatus mutex;

  public static final String SERIALIZED_NAME_SEMAPHORE = "semaphore";
  @SerializedName(SERIALIZED_NAME_SEMAPHORE)
  private SemaphoreStatus semaphore;


  public SynchronizationStatus mutex(MutexStatus mutex) {
    
    this.mutex = mutex;
    return this;
  }

   /**
   * Get mutex
   * @return mutex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MutexStatus getMutex() {
    return mutex;
  }


  public void setMutex(MutexStatus mutex) {
    this.mutex = mutex;
  }


  public SynchronizationStatus semaphore(SemaphoreStatus semaphore) {
    
    this.semaphore = semaphore;
    return this;
  }

   /**
   * Get semaphore
   * @return semaphore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SemaphoreStatus getSemaphore() {
    return semaphore;
  }


  public void setSemaphore(SemaphoreStatus semaphore) {
    this.semaphore = semaphore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SynchronizationStatus synchronizationStatus = (SynchronizationStatus) o;
    return Objects.equals(this.mutex, synchronizationStatus.mutex) &&
        Objects.equals(this.semaphore, synchronizationStatus.semaphore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mutex, semaphore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SynchronizationStatus {\n");
    sb.append("    mutex: ").append(toIndentedString(mutex)).append("\n");
    sb.append("    semaphore: ").append(toIndentedString(semaphore)).append("\n");
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

