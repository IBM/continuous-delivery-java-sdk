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

package github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.ListTektonPipelineRunsOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListTektonPipelineRunsOptions model.
 */
public class ListTektonPipelineRunsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListTektonPipelineRunsOptions() throws Throwable {
    ListTektonPipelineRunsOptions listTektonPipelineRunsOptionsModel = new ListTektonPipelineRunsOptions.Builder()
      .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
      .limit(Long.valueOf("1"))
      .offset(Long.valueOf("26"))
      .status("succeeded")
      .triggerName("manual-trigger")
      .build();
    assertEquals(listTektonPipelineRunsOptionsModel.pipelineId(), "94619026-912b-4d92-8f51-6c74f0692d90");
    assertEquals(listTektonPipelineRunsOptionsModel.limit(), Long.valueOf("1"));
    assertEquals(listTektonPipelineRunsOptionsModel.offset(), Long.valueOf("26"));
    assertEquals(listTektonPipelineRunsOptionsModel.status(), "succeeded");
    assertEquals(listTektonPipelineRunsOptionsModel.triggerName(), "manual-trigger");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListTektonPipelineRunsOptionsError() throws Throwable {
    new ListTektonPipelineRunsOptions.Builder().build();
  }

}