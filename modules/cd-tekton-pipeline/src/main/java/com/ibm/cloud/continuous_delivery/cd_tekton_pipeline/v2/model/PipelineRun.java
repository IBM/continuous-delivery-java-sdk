/*
 * (C) Copyright IBM Corp. 2024.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model;

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Single Tekton pipeline run object.
 */
public class PipelineRun extends GenericModel {

  /**
   * Status of the pipeline run.
   */
  public interface Status {
    /** pending. */
    String PENDING = "pending";
    /** waiting. */
    String WAITING = "waiting";
    /** queued. */
    String QUEUED = "queued";
    /** running. */
    String RUNNING = "running";
    /** cancelled. */
    String CANCELLED = "cancelled";
    /** failed. */
    String FAILED = "failed";
    /** error. */
    String ERROR = "error";
    /** succeeded. */
    String SUCCEEDED = "succeeded";
  }

  protected String id;
  protected String href;
  @SerializedName("user_info")
  protected UserInfo userInfo;
  protected String status;
  @SerializedName("definition_id")
  protected String definitionId;
  protected RunDefinition definition;
  protected Object description;
  protected PipelineRunWorker worker;
  @SerializedName("pipeline_id")
  protected String pipelineId;
  protected RunPipeline pipeline;
  @SerializedName("listener_name")
  protected String listenerName;
  protected Trigger trigger;
  @SerializedName("event_params_blob")
  protected String eventParamsBlob;
  @SerializedName("trigger_headers")
  protected String triggerHeaders;
  @SerializedName("properties")
  protected List<Property> xProperties;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("run_url")
  protected String runUrl;
  @SerializedName("error_message")
  protected String errorMessage;

  protected PipelineRun() { }

  /**
   * Gets the id.
   *
   * UUID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the href.
   *
   * General href URL.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the userInfo.
   *
   * Information about the user that triggered a pipeline run. Only included for pipeline runs that were manually
   * triggered.
   *
   * @return the userInfo
   */
  public UserInfo getUserInfo() {
    return userInfo;
  }

  /**
   * Gets the status.
   *
   * Status of the pipeline run.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the definitionId.
   *
   * The aggregated definition ID.
   *
   * @return the definitionId
   */
  public String getDefinitionId() {
    return definitionId;
  }

  /**
   * Gets the definition.
   *
   * Reference to the pipeline definition of a pipeline run.
   *
   * @return the definition
   */
  public RunDefinition getDefinition() {
    return definition;
  }

  /**
   * Gets the description.
   *
   * A description of the PipelineRun.
   *
   * @return the description
   */
  public Object getDescription() {
    return description;
  }

  /**
   * Gets the worker.
   *
   * Worker details used in this pipeline run.
   *
   * @return the worker
   */
  public PipelineRunWorker getWorker() {
    return worker;
  }

  /**
   * Gets the pipelineId.
   *
   * The ID of the pipeline to which this pipeline run belongs.
   *
   * @return the pipelineId
   */
  public String getPipelineId() {
    return pipelineId;
  }

  /**
   * Gets the pipeline.
   *
   * Reference to the pipeline to which a pipeline run belongs.
   *
   * @return the pipeline
   */
  public RunPipeline getPipeline() {
    return pipeline;
  }

  /**
   * Gets the listenerName.
   *
   * Listener name used to start the run.
   *
   * @return the listenerName
   */
  public String getListenerName() {
    return listenerName;
  }

  /**
   * Gets the trigger.
   *
   * Tekton pipeline trigger.
   *
   * @return the trigger
   */
  public Trigger getTrigger() {
    return trigger;
  }

  /**
   * Gets the eventParamsBlob.
   *
   * Event parameters object in String format that was passed in upon creation of this pipeline run, the contents
   * depends on the type of trigger. For example, the Git event payload is included for Git triggers, or in the case of
   * a manual trigger the override and added properties are included.
   *
   * @return the eventParamsBlob
   */
  public String getEventParamsBlob() {
    return eventParamsBlob;
  }

  /**
   * Gets the triggerHeaders.
   *
   * Trigger headers object in String format that was passed in upon creation of this pipeline run. Omitted if no
   * trigger_headers object was provided when creating the pipeline run.
   *
   * @return the triggerHeaders
   */
  public String getTriggerHeaders() {
    return triggerHeaders;
  }

  /**
   * Gets the xProperties.
   *
   * Properties used in this Tekton pipeline run. Not included when fetching the list of pipeline runs.
   *
   * @return the xProperties
   */
  public List<Property> getXProperties() {
    return xProperties;
  }

  /**
   * Gets the createdAt.
   *
   * Standard RFC 3339 Date Time String.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the updatedAt.
   *
   * Standard RFC 3339 Date Time String. Only included if the run has been updated since it was created.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the runUrl.
   *
   * URL for the details page of this pipeline run.
   *
   * @return the runUrl
   */
  public String getRunUrl() {
    return runUrl;
  }

  /**
   * Gets the errorMessage.
   *
   * Error message that provides details when a pipeline run encounters an error.
   *
   * @return the errorMessage
   */
  public String getErrorMessage() {
    return errorMessage;
  }
}

