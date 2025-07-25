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

import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.TriggerManualTrigger;
import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.TriggerProperty;
import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.Worker;
import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TriggerManualTrigger model.
 */
public class TriggerManualTriggerTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTriggerManualTrigger() throws Throwable {
    TriggerManualTrigger triggerManualTriggerModel = new TriggerManualTrigger();
    assertNull(triggerManualTriggerModel.getType());
    assertNull(triggerManualTriggerModel.getName());
    assertNull(triggerManualTriggerModel.getHref());
    assertNull(triggerManualTriggerModel.getEventListener());
    assertNull(triggerManualTriggerModel.getId());
    assertNull(triggerManualTriggerModel.getXProperties());
    assertNull(triggerManualTriggerModel.getTags());
    assertNull(triggerManualTriggerModel.getWorker());
    assertNull(triggerManualTriggerModel.getMaxConcurrentRuns());
    assertNull(triggerManualTriggerModel.isEnabled());
    assertNull(triggerManualTriggerModel.isFavorite());
    assertNull(triggerManualTriggerModel.isLimitWaitingRuns());
  }
}