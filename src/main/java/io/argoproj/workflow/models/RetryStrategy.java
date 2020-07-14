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
import io.argoproj.workflow.models.Backoff;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RetryStrategy provides controls on how to retry a workflow step
 */
@ApiModel(description = "RetryStrategy provides controls on how to retry a workflow step")

public class RetryStrategy {
  public static final String SERIALIZED_NAME_BACKOFF = "backoff";
  @SerializedName(SERIALIZED_NAME_BACKOFF)
  private Backoff backoff;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_RETRY_POLICY = "retryPolicy";
  @SerializedName(SERIALIZED_NAME_RETRY_POLICY)
  private String retryPolicy;


  public RetryStrategy backoff(Backoff backoff) {
    
    this.backoff = backoff;
    return this;
  }

   /**
   * Get backoff
   * @return backoff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Backoff getBackoff() {
    return backoff;
  }


  public void setBackoff(Backoff backoff) {
    this.backoff = backoff;
  }


  public RetryStrategy limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Limit is the maximum number of attempts when retrying a container
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Limit is the maximum number of attempts when retrying a container")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public RetryStrategy retryPolicy(String retryPolicy) {
    
    this.retryPolicy = retryPolicy;
    return this;
  }

   /**
   * RetryPolicy is a policy of NodePhase statuses that will be retried
   * @return retryPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RetryPolicy is a policy of NodePhase statuses that will be retried")

  public String getRetryPolicy() {
    return retryPolicy;
  }


  public void setRetryPolicy(String retryPolicy) {
    this.retryPolicy = retryPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetryStrategy retryStrategy = (RetryStrategy) o;
    return Objects.equals(this.backoff, retryStrategy.backoff) &&
        Objects.equals(this.limit, retryStrategy.limit) &&
        Objects.equals(this.retryPolicy, retryStrategy.retryPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backoff, limit, retryPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetryStrategy {\n");
    sb.append("    backoff: ").append(toIndentedString(backoff)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    retryPolicy: ").append(toIndentedString(retryPolicy)).append("\n");
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

