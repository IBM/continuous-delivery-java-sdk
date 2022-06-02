/*
 * (C) Copyright IBM Corp. 2022.
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
package github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getTektonPipelineRunLogs options.
 */
public class GetTektonPipelineRunLogsOptions extends GenericModel {

  protected String pipelineId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String pipelineId;
    private String id;

    private Builder(GetTektonPipelineRunLogsOptions getTektonPipelineRunLogsOptions) {
      this.pipelineId = getTektonPipelineRunLogsOptions.pipelineId;
      this.id = getTektonPipelineRunLogsOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param pipelineId the pipelineId
     * @param id the id
     */
    public Builder(String pipelineId, String id) {
      this.pipelineId = pipelineId;
      this.id = id;
    }

    /**
     * Builds a GetTektonPipelineRunLogsOptions.
     *
     * @return the new GetTektonPipelineRunLogsOptions instance
     */
    public GetTektonPipelineRunLogsOptions build() {
      return new GetTektonPipelineRunLogsOptions(this);
    }

    /**
     * Set the pipelineId.
     *
     * @param pipelineId the pipelineId
     * @return the GetTektonPipelineRunLogsOptions builder
     */
    public Builder pipelineId(String pipelineId) {
      this.pipelineId = pipelineId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetTektonPipelineRunLogsOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetTektonPipelineRunLogsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.pipelineId,
      "pipelineId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    pipelineId = builder.pipelineId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetTektonPipelineRunLogsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the pipelineId.
   *
   * The tekton pipeline ID.
   *
   * @return the pipelineId
   */
  public String pipelineId() {
    return pipelineId;
  }

  /**
   * Gets the id.
   *
   * ID of current instance.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

