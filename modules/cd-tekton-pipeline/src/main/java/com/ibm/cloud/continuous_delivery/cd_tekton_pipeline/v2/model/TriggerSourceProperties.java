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
 * Properties of the source, which define the URL of the repository and a branch or pattern.
 */
public class TriggerSourceProperties extends GenericModel {

  protected String url;
  protected String branch;
  protected String pattern;
  @SerializedName("blind_connection")
  protected Boolean blindConnection;
  @SerializedName("hook_id")
  protected String hookId;
  protected Tool tool;

  protected TriggerSourceProperties() { }

  /**
   * Gets the url.
   *
   * URL of the repository to which the trigger is listening.
   *
   * @return the url
   */
  public String getUrl() {
    return url;
  }

  /**
   * Gets the branch.
   *
   * Name of a branch from the repo. Only one of branch, pattern, or filter should be specified.
   *
   * @return the branch
   */
  public String getBranch() {
    return branch;
  }

  /**
   * Gets the pattern.
   *
   * The pattern of Git branch or tag. You can specify a glob pattern such as '!test' or '*master' to match against
   * multiple tags or branches in the repository.The glob pattern used must conform to Bash 4.3 specifications, see bash
   * documentation for more info: https://www.gnu.org/software/bash/manual/bash.html#Pattern-Matching. Only one of
   * branch, pattern, or filter should be specified.
   *
   * @return the pattern
   */
  public String getPattern() {
    return pattern;
  }

  /**
   * Gets the blindConnection.
   *
   * True if the repository server is not addressable on the public internet. IBM Cloud will not be able to validate the
   * connection details you provide.
   *
   * @return the blindConnection
   */
  public Boolean isBlindConnection() {
    return blindConnection;
  }

  /**
   * Gets the hookId.
   *
   * Repository webhook ID. It is generated upon trigger creation.
   *
   * @return the hookId
   */
  public String getHookId() {
    return hookId;
  }

  /**
   * Gets the tool.
   *
   * Reference to the repository tool in the parent toolchain.
   *
   * @return the tool
   */
  public Tool getTool() {
    return tool;
  }
}

