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

package com.ibm.cloud.continuous_delivery.cd_toolchain.v2.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about retrieving next tool results from the collection.
 */
public class ToolchainToolCollectionNext extends GenericModel {

  protected String start;
  protected String href;

  protected ToolchainToolCollectionNext() { }

  /**
   * Gets the start.
   *
   * Cursor that can be used to get the next set of tool collections.
   *
   * @return the start
   */
  public String getStart() {
    return start;
  }

  /**
   * Gets the href.
   *
   * URI that can be used to get next results from the collection.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }
}

