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
 * The getTektonPipelineDefinition options.
 */
public class GetTektonPipelineDefinitionOptions extends GenericModel {

  protected String pipelineId;
  protected String definitionId;

  /**
   * Builder.
   */
  public static class Builder {
    private String pipelineId;
    private String definitionId;

    private Builder(GetTektonPipelineDefinitionOptions getTektonPipelineDefinitionOptions) {
      this.pipelineId = getTektonPipelineDefinitionOptions.pipelineId;
      this.definitionId = getTektonPipelineDefinitionOptions.definitionId;
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
     * @param definitionId the definitionId
     */
    public Builder(String pipelineId, String definitionId) {
      this.pipelineId = pipelineId;
      this.definitionId = definitionId;
    }

    /**
     * Builds a GetTektonPipelineDefinitionOptions.
     *
     * @return the new GetTektonPipelineDefinitionOptions instance
     */
    public GetTektonPipelineDefinitionOptions build() {
      return new GetTektonPipelineDefinitionOptions(this);
    }

    /**
     * Set the pipelineId.
     *
     * @param pipelineId the pipelineId
     * @return the GetTektonPipelineDefinitionOptions builder
     */
    public Builder pipelineId(String pipelineId) {
      this.pipelineId = pipelineId;
      return this;
    }

    /**
     * Set the definitionId.
     *
     * @param definitionId the definitionId
     * @return the GetTektonPipelineDefinitionOptions builder
     */
    public Builder definitionId(String definitionId) {
      this.definitionId = definitionId;
      return this;
    }
  }

  protected GetTektonPipelineDefinitionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.pipelineId,
      "pipelineId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.definitionId,
      "definitionId cannot be empty");
    pipelineId = builder.pipelineId;
    definitionId = builder.definitionId;
  }

  /**
   * New builder.
   *
   * @return a GetTektonPipelineDefinitionOptions builder
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
   * Gets the definitionId.
   *
   * The definition ID.
   *
   * @return the definitionId
   */
  public String definitionId() {
    return definitionId;
  }
}

