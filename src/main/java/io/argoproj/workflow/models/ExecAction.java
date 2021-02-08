/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.12.8
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
 * ExecAction describes a \&quot;run in container\&quot; action.
 */
@ApiModel(description = "ExecAction describes a \"run in container\" action.")

public class ExecAction {
  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private List<String> command = null;


  public ExecAction command(List<String> command) {
    
    this.command = command;
    return this;
  }

  public ExecAction addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<String>();
    }
    this.command.add(commandItem);
    return this;
  }

   /**
   * Command is the command line to execute inside the container, the working directory for the command  is root (&#39;/&#39;) in the container&#39;s filesystem. The command is simply exec&#39;d, it is not run inside a shell, so traditional shell instructions (&#39;|&#39;, etc) won&#39;t work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
   * @return command
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.")

  public List<String> getCommand() {
    return command;
  }


  public void setCommand(List<String> command) {
    this.command = command;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecAction execAction = (ExecAction) o;
    return Objects.equals(this.command, execAction.command);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecAction {\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
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

