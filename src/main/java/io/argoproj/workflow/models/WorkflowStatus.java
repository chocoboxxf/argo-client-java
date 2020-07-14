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
import io.argoproj.workflow.models.Condition;
import io.argoproj.workflow.models.NodeStatus;
import io.argoproj.workflow.models.Outputs;
import io.argoproj.workflow.models.Template;
import io.argoproj.workflow.models.WorkflowSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * WorkflowStatus contains overall status information about a workflow
 */
@ApiModel(description = "WorkflowStatus contains overall status information about a workflow")

public class WorkflowStatus {
  public static final String SERIALIZED_NAME_COMPRESSED_NODES = "compressedNodes";
  @SerializedName(SERIALIZED_NAME_COMPRESSED_NODES)
  private String compressedNodes;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<Condition> conditions = null;

  public static final String SERIALIZED_NAME_FINISHED_AT = "finishedAt";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT)
  private DateTime finishedAt;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_NODES = "nodes";
  @SerializedName(SERIALIZED_NAME_NODES)
  private Map<String, NodeStatus> nodes = null;

  public static final String SERIALIZED_NAME_OFFLOAD_NODE_STATUS_VERSION = "offloadNodeStatusVersion";
  @SerializedName(SERIALIZED_NAME_OFFLOAD_NODE_STATUS_VERSION)
  private String offloadNodeStatusVersion;

  public static final String SERIALIZED_NAME_OUTPUTS = "outputs";
  @SerializedName(SERIALIZED_NAME_OUTPUTS)
  private Outputs outputs;

  public static final String SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIMS = "persistentVolumeClaims";
  @SerializedName(SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIMS)
  private List<io.kubernetes.client.models.V1Volume> persistentVolumeClaims = null;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;

  public static final String SERIALIZED_NAME_RESOURCES_DURATION = "resourcesDuration";
  @SerializedName(SERIALIZED_NAME_RESOURCES_DURATION)
  private Map<String, Long> resourcesDuration = null;

  public static final String SERIALIZED_NAME_STARTED_AT = "startedAt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private DateTime startedAt;

  public static final String SERIALIZED_NAME_STORED_TEMPLATES = "storedTemplates";
  @SerializedName(SERIALIZED_NAME_STORED_TEMPLATES)
  private Map<String, Template> storedTemplates = null;

  public static final String SERIALIZED_NAME_STORED_WORKFLOW_TEMPLATE_SPEC = "storedWorkflowTemplateSpec";
  @SerializedName(SERIALIZED_NAME_STORED_WORKFLOW_TEMPLATE_SPEC)
  private WorkflowSpec storedWorkflowTemplateSpec;


  public WorkflowStatus compressedNodes(String compressedNodes) {
    
    this.compressedNodes = compressedNodes;
    return this;
  }

   /**
   * Compressed and base64 decoded Nodes map
   * @return compressedNodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Compressed and base64 decoded Nodes map")

  public String getCompressedNodes() {
    return compressedNodes;
  }


  public void setCompressedNodes(String compressedNodes) {
    this.compressedNodes = compressedNodes;
  }


  public WorkflowStatus conditions(List<Condition> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public WorkflowStatus addConditionsItem(Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<Condition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions is a list of conditions the Workflow may have
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Conditions is a list of conditions the Workflow may have")

  public List<Condition> getConditions() {
    return conditions;
  }


  public void setConditions(List<Condition> conditions) {
    this.conditions = conditions;
  }


  public WorkflowStatus finishedAt(DateTime finishedAt) {
    
    this.finishedAt = finishedAt;
    return this;
  }

   /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   * @return finishedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.")

  public DateTime getFinishedAt() {
    return finishedAt;
  }


  public void setFinishedAt(DateTime finishedAt) {
    this.finishedAt = finishedAt;
  }


  public WorkflowStatus message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A human readable message indicating details about why the workflow is in this condition.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human readable message indicating details about why the workflow is in this condition.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public WorkflowStatus nodes(Map<String, NodeStatus> nodes) {
    
    this.nodes = nodes;
    return this;
  }

  public WorkflowStatus putNodesItem(String key, NodeStatus nodesItem) {
    if (this.nodes == null) {
      this.nodes = new HashMap<String, NodeStatus>();
    }
    this.nodes.put(key, nodesItem);
    return this;
  }

   /**
   * Nodes is a mapping between a node ID and the node&#39;s status.
   * @return nodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nodes is a mapping between a node ID and the node's status.")

  public Map<String, NodeStatus> getNodes() {
    return nodes;
  }


  public void setNodes(Map<String, NodeStatus> nodes) {
    this.nodes = nodes;
  }


  public WorkflowStatus offloadNodeStatusVersion(String offloadNodeStatusVersion) {
    
    this.offloadNodeStatusVersion = offloadNodeStatusVersion;
    return this;
  }

   /**
   * Whether on not node status has been offloaded to a database. If exists, then Nodes and CompressedNodes will be empty. This will actually be populated with a hash of the offloaded data.
   * @return offloadNodeStatusVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether on not node status has been offloaded to a database. If exists, then Nodes and CompressedNodes will be empty. This will actually be populated with a hash of the offloaded data.")

  public String getOffloadNodeStatusVersion() {
    return offloadNodeStatusVersion;
  }


  public void setOffloadNodeStatusVersion(String offloadNodeStatusVersion) {
    this.offloadNodeStatusVersion = offloadNodeStatusVersion;
  }


  public WorkflowStatus outputs(Outputs outputs) {
    
    this.outputs = outputs;
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Outputs getOutputs() {
    return outputs;
  }


  public void setOutputs(Outputs outputs) {
    this.outputs = outputs;
  }


  public WorkflowStatus persistentVolumeClaims(List<io.kubernetes.client.models.V1Volume> persistentVolumeClaims) {
    
    this.persistentVolumeClaims = persistentVolumeClaims;
    return this;
  }

  public WorkflowStatus addPersistentVolumeClaimsItem(io.kubernetes.client.models.V1Volume persistentVolumeClaimsItem) {
    if (this.persistentVolumeClaims == null) {
      this.persistentVolumeClaims = new ArrayList<io.kubernetes.client.models.V1Volume>();
    }
    this.persistentVolumeClaims.add(persistentVolumeClaimsItem);
    return this;
  }

   /**
   * PersistentVolumeClaims tracks all PVCs that were created as part of the  The contents of this list are drained at the end of the workflow.
   * @return persistentVolumeClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PersistentVolumeClaims tracks all PVCs that were created as part of the  The contents of this list are drained at the end of the workflow.")

  public List<io.kubernetes.client.models.V1Volume> getPersistentVolumeClaims() {
    return persistentVolumeClaims;
  }


  public void setPersistentVolumeClaims(List<io.kubernetes.client.models.V1Volume> persistentVolumeClaims) {
    this.persistentVolumeClaims = persistentVolumeClaims;
  }


  public WorkflowStatus phase(String phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * Phase a simple, high-level summary of where the workflow is in its lifecycle.
   * @return phase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phase a simple, high-level summary of where the workflow is in its lifecycle.")

  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }


  public WorkflowStatus resourcesDuration(Map<String, Long> resourcesDuration) {
    
    this.resourcesDuration = resourcesDuration;
    return this;
  }

  public WorkflowStatus putResourcesDurationItem(String key, Long resourcesDurationItem) {
    if (this.resourcesDuration == null) {
      this.resourcesDuration = new HashMap<String, Long>();
    }
    this.resourcesDuration.put(key, resourcesDurationItem);
    return this;
  }

   /**
   * ResourcesDuration is the total for the workflow
   * @return resourcesDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ResourcesDuration is the total for the workflow")

  public Map<String, Long> getResourcesDuration() {
    return resourcesDuration;
  }


  public void setResourcesDuration(Map<String, Long> resourcesDuration) {
    this.resourcesDuration = resourcesDuration;
  }


  public WorkflowStatus startedAt(DateTime startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.")

  public DateTime getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(DateTime startedAt) {
    this.startedAt = startedAt;
  }


  public WorkflowStatus storedTemplates(Map<String, Template> storedTemplates) {
    
    this.storedTemplates = storedTemplates;
    return this;
  }

  public WorkflowStatus putStoredTemplatesItem(String key, Template storedTemplatesItem) {
    if (this.storedTemplates == null) {
      this.storedTemplates = new HashMap<String, Template>();
    }
    this.storedTemplates.put(key, storedTemplatesItem);
    return this;
  }

   /**
   * StoredTemplates is a mapping between a template ref and the node&#39;s status.
   * @return storedTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "StoredTemplates is a mapping between a template ref and the node's status.")

  public Map<String, Template> getStoredTemplates() {
    return storedTemplates;
  }


  public void setStoredTemplates(Map<String, Template> storedTemplates) {
    this.storedTemplates = storedTemplates;
  }


  public WorkflowStatus storedWorkflowTemplateSpec(WorkflowSpec storedWorkflowTemplateSpec) {
    
    this.storedWorkflowTemplateSpec = storedWorkflowTemplateSpec;
    return this;
  }

   /**
   * Get storedWorkflowTemplateSpec
   * @return storedWorkflowTemplateSpec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkflowSpec getStoredWorkflowTemplateSpec() {
    return storedWorkflowTemplateSpec;
  }


  public void setStoredWorkflowTemplateSpec(WorkflowSpec storedWorkflowTemplateSpec) {
    this.storedWorkflowTemplateSpec = storedWorkflowTemplateSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowStatus workflowStatus = (WorkflowStatus) o;
    return Objects.equals(this.compressedNodes, workflowStatus.compressedNodes) &&
        Objects.equals(this.conditions, workflowStatus.conditions) &&
        Objects.equals(this.finishedAt, workflowStatus.finishedAt) &&
        Objects.equals(this.message, workflowStatus.message) &&
        Objects.equals(this.nodes, workflowStatus.nodes) &&
        Objects.equals(this.offloadNodeStatusVersion, workflowStatus.offloadNodeStatusVersion) &&
        Objects.equals(this.outputs, workflowStatus.outputs) &&
        Objects.equals(this.persistentVolumeClaims, workflowStatus.persistentVolumeClaims) &&
        Objects.equals(this.phase, workflowStatus.phase) &&
        Objects.equals(this.resourcesDuration, workflowStatus.resourcesDuration) &&
        Objects.equals(this.startedAt, workflowStatus.startedAt) &&
        Objects.equals(this.storedTemplates, workflowStatus.storedTemplates) &&
        Objects.equals(this.storedWorkflowTemplateSpec, workflowStatus.storedWorkflowTemplateSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compressedNodes, conditions, finishedAt, message, nodes, offloadNodeStatusVersion, outputs, persistentVolumeClaims, phase, resourcesDuration, startedAt, storedTemplates, storedWorkflowTemplateSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowStatus {\n");
    sb.append("    compressedNodes: ").append(toIndentedString(compressedNodes)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    offloadNodeStatusVersion: ").append(toIndentedString(offloadNodeStatusVersion)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    persistentVolumeClaims: ").append(toIndentedString(persistentVolumeClaims)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    resourcesDuration: ").append(toIndentedString(resourcesDuration)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    storedTemplates: ").append(toIndentedString(storedTemplates)).append("\n");
    sb.append("    storedWorkflowTemplateSpec: ").append(toIndentedString(storedWorkflowTemplateSpec)).append("\n");
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

