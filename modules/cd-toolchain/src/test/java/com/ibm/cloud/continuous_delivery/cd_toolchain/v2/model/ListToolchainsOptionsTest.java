/*
 * (C) Copyright IBM Corp. 2023.
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

import com.ibm.cloud.continuous_delivery.cd_toolchain.v2.model.ListToolchainsOptions;
import com.ibm.cloud.continuous_delivery.cd_toolchain.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListToolchainsOptions model.
 */
public class ListToolchainsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListToolchainsOptions() throws Throwable {
    ListToolchainsOptions listToolchainsOptionsModel = new ListToolchainsOptions.Builder()
      .resourceGroupId("testString")
      .limit(Long.valueOf("20"))
      .start("testString")
      .name("TestToolchainV2")
      .build();
    assertEquals(listToolchainsOptionsModel.resourceGroupId(), "testString");
    assertEquals(listToolchainsOptionsModel.limit(), Long.valueOf("20"));
    assertEquals(listToolchainsOptionsModel.start(), "testString");
    assertEquals(listToolchainsOptionsModel.name(), "TestToolchainV2");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListToolchainsOptionsError() throws Throwable {
    new ListToolchainsOptions.Builder().build();
  }

}