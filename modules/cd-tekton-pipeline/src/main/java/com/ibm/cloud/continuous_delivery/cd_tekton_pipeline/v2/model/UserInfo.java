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
 * Information about the user that triggered a pipeline run. Only included for pipeline runs that were manually
 * triggered.
 */
public class UserInfo extends GenericModel {

  @SerializedName("iam_id")
  protected String iamId;
  protected String sub;

  protected UserInfo() { }

  /**
   * Gets the iamId.
   *
   * IBM Cloud IAM ID.
   *
   * @return the iamId
   */
  public String getIamId() {
    return iamId;
  }

  /**
   * Gets the sub.
   *
   * User email address.
   *
   * @return the sub
   */
  public String getSub() {
    return sub;
  }
}

