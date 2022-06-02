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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Tekton pipeline runs object.
 */
public class PipelineRuns extends GenericModel {

  @SerializedName("pipeline_runs")
  protected List<PipelineRunsPipelineRunsItem> pipelineRuns;
  protected Long offset;
  protected Long limit;
  protected PipelineRunsFirst first;
  protected PipelineRunsNext next;

  /**
   * Gets the pipelineRuns.
   *
   * Tekton pipeline runs list.
   *
   * @return the pipelineRuns
   */
  public List<PipelineRunsPipelineRunsItem> getPipelineRuns() {
    return pipelineRuns;
  }

  /**
   * Gets the offset.
   *
   * Skip a specified number of pipeline runs.
   *
   * @return the offset
   */
  public Long getOffset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The number of pipeline runs to return, sorted by creation time, most recent first.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the first.
   *
   * First page of pipeline runs.
   *
   * @return the first
   */
  public PipelineRunsFirst getFirst() {
    return first;
  }

  /**
   * Gets the next.
   *
   * Next page of pipeline runs relative to the offset and limit.
   *
   * @return the next
   */
  public PipelineRunsNext getNext() {
    return next;
  }
}

