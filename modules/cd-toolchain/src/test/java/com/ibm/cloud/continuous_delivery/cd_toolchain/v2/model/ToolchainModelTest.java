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

package com.ibm.cloud.continuous_delivery.cd_toolchain.v2.model;

import com.ibm.cloud.continuous_delivery.cd_toolchain.v2.model.ToolchainModel;
import com.ibm.cloud.continuous_delivery.cd_toolchain.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ToolchainModel model.
 */
public class ToolchainModelTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testToolchainModel() throws Throwable {
    ToolchainModel toolchainModelModel = new ToolchainModel();
    assertNull(toolchainModelModel.getId());
    assertNull(toolchainModelModel.getName());
    assertNull(toolchainModelModel.getDescription());
    assertNull(toolchainModelModel.getAccountId());
    assertNull(toolchainModelModel.getLocation());
    assertNull(toolchainModelModel.getResourceGroupId());
    assertNull(toolchainModelModel.getCrn());
    assertNull(toolchainModelModel.getHref());
    assertNull(toolchainModelModel.getUiHref());
    assertNull(toolchainModelModel.getCreatedAt());
    assertNull(toolchainModelModel.getUpdatedAt());
    assertNull(toolchainModelModel.getCreatedBy());
  }
}