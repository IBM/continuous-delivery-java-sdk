/*
 * (C) Copyright IBM Corp. 2025.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Worker details used in this pipeline run.
 */
public class PipelineRunWorker extends GenericModel {

  protected String name;
  @SerializedName("agent_id")
  protected String agentId;
  @SerializedName("service_id")
  protected String serviceId;
  protected String id;

  protected PipelineRunWorker() { }

  /**
   * Gets the name.
   *
   * Name of the worker. Computed based on the worker ID.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the agentId.
   *
   * The agent ID of the corresponding private worker integration used for this pipeline run.
   *
   * @return the agentId
   */
  public String getAgentId() {
    return agentId;
  }

  /**
   * Gets the serviceId.
   *
   * The Service ID of the corresponding private worker integration used for this pipeline run.
   *
   * @return the serviceId
   */
  public String getServiceId() {
    return serviceId;
  }

  /**
   * Gets the id.
   *
   * Universally Unique Identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }
}

