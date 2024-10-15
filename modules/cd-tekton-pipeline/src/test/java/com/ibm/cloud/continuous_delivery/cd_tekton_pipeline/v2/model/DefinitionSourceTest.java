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

package com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model;

import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.DefinitionSource;
import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.DefinitionSourceProperties;
import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.Tool;
import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DefinitionSource model.
 */
public class DefinitionSourceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDefinitionSource() throws Throwable {
    Tool toolModel = new Tool.Builder()
      .id("testString")
      .build();
    assertEquals(toolModel.id(), "testString");

    DefinitionSourceProperties definitionSourcePropertiesModel = new DefinitionSourceProperties.Builder()
      .url("testString")
      .branch("testString")
      .tag("testString")
      .path("testString")
      .tool(toolModel)
      .build();
    assertEquals(definitionSourcePropertiesModel.url(), "testString");
    assertEquals(definitionSourcePropertiesModel.branch(), "testString");
    assertEquals(definitionSourcePropertiesModel.tag(), "testString");
    assertEquals(definitionSourcePropertiesModel.path(), "testString");
    assertEquals(definitionSourcePropertiesModel.tool(), toolModel);

    DefinitionSource definitionSourceModel = new DefinitionSource.Builder()
      .type("testString")
      .xProperties(definitionSourcePropertiesModel)
      .build();
    assertEquals(definitionSourceModel.type(), "testString");
    assertEquals(definitionSourceModel.xProperties(), definitionSourcePropertiesModel);

    String json = TestUtilities.serialize(definitionSourceModel);

    DefinitionSource definitionSourceModelNew = TestUtilities.deserialize(json, DefinitionSource.class);
    assertTrue(definitionSourceModelNew instanceof DefinitionSource);
    assertEquals(definitionSourceModelNew.type(), "testString");
    assertEquals(definitionSourceModelNew.xProperties().toString(), definitionSourcePropertiesModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDefinitionSourceError() throws Throwable {
    new DefinitionSource.Builder().build();
  }

}