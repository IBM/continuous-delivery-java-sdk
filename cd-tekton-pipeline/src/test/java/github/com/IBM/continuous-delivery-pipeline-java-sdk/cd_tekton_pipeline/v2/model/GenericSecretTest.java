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
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.GenericSecret;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GenericSecret model.
 */
public class GenericSecretTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGenericSecret() throws Throwable {
    GenericSecret genericSecretModel = new GenericSecret.Builder()
      .type("tokenMatches")
      .value("testString")
      .source("header")
      .keyName("testString")
      .algorithm("md4")
      .build();
    assertEquals(genericSecretModel.type(), "tokenMatches");
    assertEquals(genericSecretModel.value(), "testString");
    assertEquals(genericSecretModel.source(), "header");
    assertEquals(genericSecretModel.keyName(), "testString");
    assertEquals(genericSecretModel.algorithm(), "md4");

    String json = TestUtilities.serialize(genericSecretModel);

    GenericSecret genericSecretModelNew = TestUtilities.deserialize(json, GenericSecret.class);
    assertTrue(genericSecretModelNew instanceof GenericSecret);
    assertEquals(genericSecretModelNew.type(), "tokenMatches");
    assertEquals(genericSecretModelNew.value(), "testString");
    assertEquals(genericSecretModelNew.source(), "header");
    assertEquals(genericSecretModelNew.keyName(), "testString");
    assertEquals(genericSecretModelNew.algorithm(), "md4");
  }
}