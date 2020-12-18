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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SemaphoreHolding
 */

public class SemaphoreHolding {
  public static final String SERIALIZED_NAME_HOLDERS = "holders";
  @SerializedName(SERIALIZED_NAME_HOLDERS)
  private List<String> holders = null;

  public static final String SERIALIZED_NAME_SEMAPHORE = "semaphore";
  @SerializedName(SERIALIZED_NAME_SEMAPHORE)
  private String semaphore;


  public SemaphoreHolding holders(List<String> holders) {
    
    this.holders = holders;
    return this;
  }

  public SemaphoreHolding addHoldersItem(String holdersItem) {
    if (this.holders == null) {
      this.holders = new ArrayList<String>();
    }
    this.holders.add(holdersItem);
    return this;
  }

   /**
   * Holders stores the list of current holder names in the 
   * @return holders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Holders stores the list of current holder names in the ")

  public List<String> getHolders() {
    return holders;
  }


  public void setHolders(List<String> holders) {
    this.holders = holders;
  }


  public SemaphoreHolding semaphore(String semaphore) {
    
    this.semaphore = semaphore;
    return this;
  }

   /**
   * Semaphore stores the semaphore name.
   * @return semaphore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Semaphore stores the semaphore name.")

  public String getSemaphore() {
    return semaphore;
  }


  public void setSemaphore(String semaphore) {
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
    SemaphoreHolding semaphoreHolding = (SemaphoreHolding) o;
    return Objects.equals(this.holders, semaphoreHolding.holders) &&
        Objects.equals(this.semaphore, semaphoreHolding.semaphore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holders, semaphore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SemaphoreHolding {\n");
    sb.append("    holders: ").append(toIndentedString(holders)).append("\n");
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

