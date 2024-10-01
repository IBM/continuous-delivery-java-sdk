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

import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.Definition;
import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.DefinitionSource;
import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.DefinitionSourceProperties;
import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.Property;
import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.ResourceGroupReference;
import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.TektonPipeline;
import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.Tool;
import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.ToolchainReference;
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
 * Unit test class for the TektonPipeline model.
 */
public class TektonPipelineTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTektonPipeline() throws Throwable {
    TektonPipeline tektonPipelineModel = new TektonPipeline();
    assertNull(tektonPipelineModel.getName());
    assertNull(tektonPipelineModel.getStatus());
    assertNull(tektonPipelineModel.getResourceGroup());
    assertNull(tektonPipelineModel.getToolchain());
    assertNull(tektonPipelineModel.getId());
    assertNull(tektonPipelineModel.getDefinitions());
    assertNull(tektonPipelineModel.getXProperties());
    assertNull(tektonPipelineModel.getUpdatedAt());
    assertNull(tektonPipelineModel.getCreatedAt());
    assertNull(tektonPipelineModel.getTriggers());
    assertNull(tektonPipelineModel.getWorker());
    assertNull(tektonPipelineModel.getRunsUrl());
    assertNull(tektonPipelineModel.getHref());
    assertNull(tektonPipelineModel.getBuildNumber());
    assertNull(tektonPipelineModel.getNextBuildNumber());
    assertNull(tektonPipelineModel.isEnableNotifications());
    assertNull(tektonPipelineModel.isEnablePartialCloning());
    assertNull(tektonPipelineModel.isEnabled());
  }
}