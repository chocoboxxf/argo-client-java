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
import io.argoproj.workflow.models.Mutex;
import io.argoproj.workflow.models.SemaphoreRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Synchronization holds synchronization lock configuration
 */
@ApiModel(description = "Synchronization holds synchronization lock configuration")

public class Synchronization {
  public static final String SERIALIZED_NAME_MUTEX = "mutex";
  @SerializedName(SERIALIZED_NAME_MUTEX)
  private Mutex mutex;

  public static final String SERIALIZED_NAME_SEMAPHORE = "semaphore";
  @SerializedName(SERIALIZED_NAME_SEMAPHORE)
  private SemaphoreRef semaphore;


  public Synchronization mutex(Mutex mutex) {
    
    this.mutex = mutex;
    return this;
  }

   /**
   * Get mutex
   * @return mutex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Mutex getMutex() {
    return mutex;
  }


  public void setMutex(Mutex mutex) {
    this.mutex = mutex;
  }


  public Synchronization semaphore(SemaphoreRef semaphore) {
    
    this.semaphore = semaphore;
    return this;
  }

   /**
   * Get semaphore
   * @return semaphore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SemaphoreRef getSemaphore() {
    return semaphore;
  }


  public void setSemaphore(SemaphoreRef semaphore) {
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
    Synchronization synchronization = (Synchronization) o;
    return Objects.equals(this.mutex, synchronization.mutex) &&
        Objects.equals(this.semaphore, synchronization.semaphore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mutex, semaphore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Synchronization {\n");
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

