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

import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.GenericSecret;
import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.TriggerPatch;
import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.TriggerSourcePropertiesPrototype;
import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.TriggerSourcePrototype;
import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.model.WorkerIdentity;
import com.ibm.cloud.continuous_delivery.cd_tekton_pipeline.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TriggerPatch model.
 */
public class TriggerPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTriggerPatch() throws Throwable {
    WorkerIdentity workerIdentityModel = new WorkerIdentity.Builder()
      .id("testString")
      .build();
    assertEquals(workerIdentityModel.id(), "testString");

    GenericSecret genericSecretModel = new GenericSecret.Builder()
      .type("token_matches")
      .value("testString")
      .source("header")
      .keyName("testString")
      .algorithm("md4")
      .build();
    assertEquals(genericSecretModel.type(), "token_matches");
    assertEquals(genericSecretModel.value(), "testString");
    assertEquals(genericSecretModel.source(), "header");
    assertEquals(genericSecretModel.keyName(), "testString");
    assertEquals(genericSecretModel.algorithm(), "md4");

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

    TriggerPatch triggerPatchModel = new TriggerPatch.Builder()
      .type("manual")
      .name("start-deploy")
      .eventListener("testString")
      .tags(java.util.Arrays.asList("testString"))
      .worker(workerIdentityModel)
      .maxConcurrentRuns(Long.valueOf("4"))
      .limitWaitingRuns(false)
      .enabled(true)
      .secret(genericSecretModel)
      .cron("testString")
      .timezone("America/Los_Angeles, CET, Europe/London, GMT, US/Eastern, or UTC")
      .source(triggerSourcePrototypeModel)
      .events(java.util.Arrays.asList("push", "pull_request"))
      .filter("header['x-github-event'] == 'push' && body.ref == 'refs/heads/main'")
      .favorite(false)
      .enableEventsFromForks(false)
      .build();
    assertEquals(triggerPatchModel.type(), "manual");
    assertEquals(triggerPatchModel.name(), "start-deploy");
    assertEquals(triggerPatchModel.eventListener(), "testString");
    assertEquals(triggerPatchModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(triggerPatchModel.worker(), workerIdentityModel);
    assertEquals(triggerPatchModel.maxConcurrentRuns(), Long.valueOf("4"));
    assertEquals(triggerPatchModel.limitWaitingRuns(), Boolean.valueOf(false));
    assertEquals(triggerPatchModel.enabled(), Boolean.valueOf(true));
    assertEquals(triggerPatchModel.secret(), genericSecretModel);
    assertEquals(triggerPatchModel.cron(), "testString");
    assertEquals(triggerPatchModel.timezone(), "America/Los_Angeles, CET, Europe/London, GMT, US/Eastern, or UTC");
    assertEquals(triggerPatchModel.source(), triggerSourcePrototypeModel);
    assertEquals(triggerPatchModel.events(), java.util.Arrays.asList("push", "pull_request"));
    assertEquals(triggerPatchModel.filter(), "header['x-github-event'] == 'push' && body.ref == 'refs/heads/main'");
    assertEquals(triggerPatchModel.favorite(), Boolean.valueOf(false));
    assertEquals(triggerPatchModel.enableEventsFromForks(), Boolean.valueOf(false));

    String json = TestUtilities.serialize(triggerPatchModel);

    TriggerPatch triggerPatchModelNew = TestUtilities.deserialize(json, TriggerPatch.class);
    assertTrue(triggerPatchModelNew instanceof TriggerPatch);
    assertEquals(triggerPatchModelNew.type(), "manual");
    assertEquals(triggerPatchModelNew.name(), "start-deploy");
    assertEquals(triggerPatchModelNew.eventListener(), "testString");
    assertEquals(triggerPatchModelNew.worker().toString(), workerIdentityModel.toString());
    assertEquals(triggerPatchModelNew.maxConcurrentRuns(), Long.valueOf("4"));
    assertEquals(triggerPatchModelNew.limitWaitingRuns(), Boolean.valueOf(false));
    assertEquals(triggerPatchModelNew.enabled(), Boolean.valueOf(true));
    assertEquals(triggerPatchModelNew.secret().toString(), genericSecretModel.toString());
    assertEquals(triggerPatchModelNew.cron(), "testString");
    assertEquals(triggerPatchModelNew.timezone(), "America/Los_Angeles, CET, Europe/London, GMT, US/Eastern, or UTC");
    assertEquals(triggerPatchModelNew.source().toString(), triggerSourcePrototypeModel.toString());
    assertEquals(triggerPatchModelNew.filter(), "header['x-github-event'] == 'push' && body.ref == 'refs/heads/main'");
    assertEquals(triggerPatchModelNew.favorite(), Boolean.valueOf(false));
    assertEquals(triggerPatchModelNew.enableEventsFromForks(), Boolean.valueOf(false));
  }
  @Test
  public void testTriggerPatchAsPatch() throws Throwable {
    WorkerIdentity workerIdentityModel = new WorkerIdentity.Builder()
      .id("testString")
      .build();

    GenericSecret genericSecretModel = new GenericSecret.Builder()
      .type("token_matches")
      .value("testString")
      .source("header")
      .keyName("testString")
      .algorithm("md4")
      .build();

    TriggerSourcePropertiesPrototype triggerSourcePropertiesPrototypeModel = new TriggerSourcePropertiesPrototype.Builder()
      .url("testString")
      .branch("testString")
      .pattern("testString")
      .build();

    TriggerSourcePrototype triggerSourcePrototypeModel = new TriggerSourcePrototype.Builder()
      .type("testString")
      .xProperties(triggerSourcePropertiesPrototypeModel)
      .build();

    TriggerPatch triggerPatchModel = new TriggerPatch.Builder()
      .type("manual")
      .name("start-deploy")
      .eventListener("testString")
      .tags(java.util.Arrays.asList("testString"))
      .worker(workerIdentityModel)
      .maxConcurrentRuns(Long.valueOf("4"))
      .limitWaitingRuns(false)
      .enabled(true)
      .secret(genericSecretModel)
      .cron("testString")
      .timezone("America/Los_Angeles, CET, Europe/London, GMT, US/Eastern, or UTC")
      .source(triggerSourcePrototypeModel)
      .events(java.util.Arrays.asList("push", "pull_request"))
      .filter("header['x-github-event'] == 'push' && body.ref == 'refs/heads/main'")
      .favorite(false)
      .enableEventsFromForks(false)
      .build();

    Map<String, Object> mergePatch = triggerPatchModel.asPatch();

    assertEquals(mergePatch.get("type"), "manual");
    assertEquals(mergePatch.get("name"), "start-deploy");
    assertEquals(mergePatch.get("event_listener"), "testString");
    assertTrue(mergePatch.containsKey("tags"));
    assertTrue(mergePatch.containsKey("worker"));
    assertTrue(mergePatch.containsKey("max_concurrent_runs"));
    assertTrue(mergePatch.containsKey("limit_waiting_runs"));
    assertTrue(mergePatch.containsKey("enabled"));
    assertTrue(mergePatch.containsKey("secret"));
    assertEquals(mergePatch.get("cron"), "testString");
    assertEquals(mergePatch.get("timezone"), "America/Los_Angeles, CET, Europe/London, GMT, US/Eastern, or UTC");
    assertTrue(mergePatch.containsKey("source"));
    assertTrue(mergePatch.containsKey("events"));
    assertEquals(mergePatch.get("filter"), "header['x-github-event'] == 'push' && body.ref == 'refs/heads/main'");
    assertTrue(mergePatch.containsKey("favorite"));
    assertTrue(mergePatch.containsKey("enable_events_from_forks"));
  }

}