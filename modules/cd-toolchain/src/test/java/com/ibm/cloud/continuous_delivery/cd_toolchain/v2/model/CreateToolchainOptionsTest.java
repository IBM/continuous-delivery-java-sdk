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

import com.ibm.cloud.continuous_delivery.cd_toolchain.v2.model.CreateToolchainOptions;
import com.ibm.cloud.continuous_delivery.cd_toolchain.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateToolchainOptions model.
 */
public class CreateToolchainOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateToolchainOptions() throws Throwable {
    CreateToolchainOptions createToolchainOptionsModel = new CreateToolchainOptions.Builder()
      .name("TestToolchainV2")
      .resourceGroupId("6a9a01f2cff54a7f966f803d92877123")
      .description("A sample toolchain to test the API")
      .build();
    assertEquals(createToolchainOptionsModel.name(), "TestToolchainV2");
    assertEquals(createToolchainOptionsModel.resourceGroupId(), "6a9a01f2cff54a7f966f803d92877123");
    assertEquals(createToolchainOptionsModel.description(), "A sample toolchain to test the API");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateToolchainOptionsError() throws Throwable {
    new CreateToolchainOptions.Builder().build();
  }

}