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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Toolchain object containing references to the parent toolchain.
 */
public class ToolchainReference extends GenericModel {

  protected String id;
  protected String crn;

  protected ToolchainReference() { }

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

  /**
   * Gets the crn.
   *
   * The CRN for the toolchain that contains the Tekton pipeline.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }
}

