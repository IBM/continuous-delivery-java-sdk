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
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.Property;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Property model.
 */
public class PropertyTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testProperty() throws Throwable {
    Property propertyModel = new Property.Builder()
      .name("testString")
      .value("testString")
      .xEnum(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .xDefault("testString")
      .type("SECURE")
      .path("testString")
      .build();
    assertEquals(propertyModel.name(), "testString");
    assertEquals(propertyModel.value(), "testString");
    assertEquals(propertyModel.xEnum(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(propertyModel.xDefault(), "testString");
    assertEquals(propertyModel.type(), "SECURE");
    assertEquals(propertyModel.path(), "testString");

    String json = TestUtilities.serialize(propertyModel);

    Property propertyModelNew = TestUtilities.deserialize(json, Property.class);
    assertTrue(propertyModelNew instanceof Property);
    assertEquals(propertyModelNew.name(), "testString");
    assertEquals(propertyModelNew.value(), "testString");
    assertEquals(propertyModelNew.xDefault(), "testString");
    assertEquals(propertyModelNew.type(), "SECURE");
    assertEquals(propertyModelNew.path(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPropertyError() throws Throwable {
    new Property.Builder().build();
  }

}