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

import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.TriggerSourcePropertiesPrototype;
import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.TriggerSourcePrototype;
import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TriggerSourcePrototype model.
 */
public class TriggerSourcePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTriggerSourcePrototype() throws Throwable {
    TriggerSourcePropertiesPrototype triggerSourcePropertiesPrototypeModel = new TriggerSourcePropertiesPrototype.Builder()
      .url("testString")
      .branch("testString")
      .pattern("testString")
      .build();
    assertEquals(triggerSourcePropertiesPrototypeModel.url(), "testString");
    assertEquals(triggerSourcePropertiesPrototypeModel.branch(), "testString");
    assertEquals(triggerSourcePropertiesPrototypeModel.pattern(), "testString");

    TriggerSourcePrototype triggerSourcePrototypeModel = new TriggerSourcePrototype.Builder()
      .type("testString")
      .xProperties(triggerSourcePropertiesPrototypeModel)
      .build();
    assertEquals(triggerSourcePrototypeModel.type(), "testString");
    assertEquals(triggerSourcePrototypeModel.xProperties(), triggerSourcePropertiesPrototypeModel);

    String json = TestUtilities.serialize(triggerSourcePrototypeModel);

    TriggerSourcePrototype triggerSourcePrototypeModelNew = TestUtilities.deserialize(json, TriggerSourcePrototype.class);
    assertTrue(triggerSourcePrototypeModelNew instanceof TriggerSourcePrototype);
    assertEquals(triggerSourcePrototypeModelNew.type(), "testString");
    assertEquals(triggerSourcePrototypeModelNew.xProperties().toString(), triggerSourcePropertiesPrototypeModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTriggerSourcePrototypeError() throws Throwable {
    new TriggerSourcePrototype.Builder().build();
  }

}