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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Tekton pipeline trigger object used for updating the trigger.
 */
public class TriggerPatch extends GenericModel {

  /**
   * Trigger type.
   */
  public interface Type {
    /** manual. */
    String MANUAL = "manual";
    /** scm. */
    String SCM = "scm";
    /** timer. */
    String TIMER = "timer";
    /** generic. */
    String GENERIC = "generic";
  }

  /**
   * List of events. Supported options are 'push' Git webhook events, 'pull_request_closed' Git webhook events and
   * 'pull_request' for 'open pull request' or 'update pull request' Git webhook events.
   */
  public interface Events {
    /** push. */
    String PUSH = "push";
    /** pull_request. */
    String PULL_REQUEST = "pull_request";
    /** pull_request_closed. */
    String PULL_REQUEST_CLOSED = "pull_request_closed";
  }

  protected String type;
  protected String name;
  @SerializedName("event_listener")
  protected String eventListener;
  protected List<String> tags;
  protected WorkerIdentity worker;
  @SerializedName("max_concurrent_runs")
  protected Long maxConcurrentRuns;
  protected Boolean enabled;
  protected GenericSecret secret;
  protected String cron;
  protected String timezone;
  protected TriggerSourcePrototype source;
  protected List<String> events;
  protected String filter;
  protected Boolean favorite;
  @SerializedName("enable_events_from_forks")
  protected Boolean enableEventsFromForks;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String name;
    private String eventListener;
    private List<String> tags;
    private WorkerIdentity worker;
    private Long maxConcurrentRuns;
    private Boolean enabled;
    private GenericSecret secret;
    private String cron;
    private String timezone;
    private TriggerSourcePrototype source;
    private List<String> events;
    private String filter;
    private Boolean favorite;
    private Boolean enableEventsFromForks;

    /**
     * Instantiates a new Builder from an existing TriggerPatch instance.
     *
     * @param triggerPatch the instance to initialize the Builder with
     */
    private Builder(TriggerPatch triggerPatch) {
      this.type = triggerPatch.type;
      this.name = triggerPatch.name;
      this.eventListener = triggerPatch.eventListener;
      this.tags = triggerPatch.tags;
      this.worker = triggerPatch.worker;
      this.maxConcurrentRuns = triggerPatch.maxConcurrentRuns;
      this.enabled = triggerPatch.enabled;
      this.secret = triggerPatch.secret;
      this.cron = triggerPatch.cron;
      this.timezone = triggerPatch.timezone;
      this.source = triggerPatch.source;
      this.events = triggerPatch.events;
      this.filter = triggerPatch.filter;
      this.favorite = triggerPatch.favorite;
      this.enableEventsFromForks = triggerPatch.enableEventsFromForks;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TriggerPatch.
     *
     * @return the new TriggerPatch instance
     */
    public TriggerPatch build() {
      return new TriggerPatch(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the TriggerPatch builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Adds an events to events.
     *
     * @param events the new events
     * @return the TriggerPatch builder
     */
    public Builder addEvents(String events) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(events,
        "events cannot be null");
      if (this.events == null) {
        this.events = new ArrayList<String>();
      }
      this.events.add(events);
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the TriggerPatch builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the TriggerPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the eventListener.
     *
     * @param eventListener the eventListener
     * @return the TriggerPatch builder
     */
    public Builder eventListener(String eventListener) {
      this.eventListener = eventListener;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the TriggerPatch builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the TriggerPatch builder
     */
    public Builder worker(WorkerIdentity worker) {
      this.worker = worker;
      return this;
    }

    /**
     * Set the maxConcurrentRuns.
     *
     * @param maxConcurrentRuns the maxConcurrentRuns
     * @return the TriggerPatch builder
     */
    public Builder maxConcurrentRuns(long maxConcurrentRuns) {
      this.maxConcurrentRuns = maxConcurrentRuns;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the TriggerPatch builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the secret.
     *
     * @param secret the secret
     * @return the TriggerPatch builder
     */
    public Builder secret(GenericSecret secret) {
      this.secret = secret;
      return this;
    }

    /**
     * Set the cron.
     *
     * @param cron the cron
     * @return the TriggerPatch builder
     */
    public Builder cron(String cron) {
      this.cron = cron;
      return this;
    }

    /**
     * Set the timezone.
     *
     * @param timezone the timezone
     * @return the TriggerPatch builder
     */
    public Builder timezone(String timezone) {
      this.timezone = timezone;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the TriggerPatch builder
     */
    public Builder source(TriggerSourcePrototype source) {
      this.source = source;
      return this;
    }

    /**
     * Set the events.
     * Existing events will be replaced.
     *
     * @param events the events
     * @return the TriggerPatch builder
     */
    public Builder events(List<String> events) {
      this.events = events;
      return this;
    }

    /**
     * Set the filter.
     *
     * @param filter the filter
     * @return the TriggerPatch builder
     */
    public Builder filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set the favorite.
     *
     * @param favorite the favorite
     * @return the TriggerPatch builder
     */
    public Builder favorite(Boolean favorite) {
      this.favorite = favorite;
      return this;
    }

    /**
     * Set the enableEventsFromForks.
     *
     * @param enableEventsFromForks the enableEventsFromForks
     * @return the TriggerPatch builder
     */
    public Builder enableEventsFromForks(Boolean enableEventsFromForks) {
      this.enableEventsFromForks = enableEventsFromForks;
      return this;
    }
  }

  protected TriggerPatch() { }

  protected TriggerPatch(Builder builder) {
    type = builder.type;
    name = builder.name;
    eventListener = builder.eventListener;
    tags = builder.tags;
    worker = builder.worker;
    maxConcurrentRuns = builder.maxConcurrentRuns;
    enabled = builder.enabled;
    secret = builder.secret;
    cron = builder.cron;
    timezone = builder.timezone;
    source = builder.source;
    events = builder.events;
    filter = builder.filter;
    favorite = builder.favorite;
    enableEventsFromForks = builder.enableEventsFromForks;
  }

  /**
   * New builder.
   *
   * @return a TriggerPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * Trigger type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the name.
   *
   * Trigger name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the eventListener.
   *
   * Event listener name. The name of the event listener to which the trigger is associated. The event listeners are
   * defined in the definition repositories of the Tekton pipeline.
   *
   * @return the eventListener
   */
  public String eventListener() {
    return eventListener;
  }

  /**
   * Gets the tags.
   *
   * Trigger tags array. Optional tags for the trigger.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the worker.
   *
   * Specify the worker used to run the trigger. Use `worker: { id: 'public' }` to use the IBM Managed workers. Use
   * `worker: { id: 'inherit' }` to inherit the worker used by the pipeline.
   *
   * @return the worker
   */
  public WorkerIdentity worker() {
    return worker;
  }

  /**
   * Gets the maxConcurrentRuns.
   *
   * Defines the maximum number of concurrent runs for this trigger. If set to 0 then the custom concurrency limit is
   * disabled for this trigger.
   *
   * @return the maxConcurrentRuns
   */
  public Long maxConcurrentRuns() {
    return maxConcurrentRuns;
  }

  /**
   * Gets the enabled.
   *
   * Defines if this trigger is enabled.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }

  /**
   * Gets the secret.
   *
   * Only needed for Generic Webhook trigger type. The secret is used to start the Generic Webhook trigger.
   *
   * @return the secret
   */
  public GenericSecret secret() {
    return secret;
  }

  /**
   * Gets the cron.
   *
   * Only needed for timer triggers. CRON expression that indicates when this trigger will activate. Maximum frequency
   * is every 5 minutes. The string is based on UNIX crontab syntax: minute, hour, day of month, month, day of week.
   * Example: The CRON expression 0 *_/2 * * * - translates to - every 2 hours.
   *
   * @return the cron
   */
  public String cron() {
    return cron;
  }

  /**
   * Gets the timezone.
   *
   * Only used for timer triggers. Specify the timezone used for this timer trigger, which will ensure the CRON
   * activates this trigger relative to the specified timezone. If no timezone is specified, the default timezone used
   * is UTC. Valid timezones are those listed in the IANA timezone database, https://www.iana.org/time-zones.
   *
   * @return the timezone
   */
  public String timezone() {
    return timezone;
  }

  /**
   * Gets the source.
   *
   * Source repository for a Git trigger. Only required for Git triggers. The referenced repository URL must match the
   * URL of a repository tool integration in the parent toolchain. Obtain the list of integrations from the toolchain
   * API https://cloud.ibm.com/apidocs/toolchain#list-tools.
   *
   * @return the source
   */
  public TriggerSourcePrototype source() {
    return source;
  }

  /**
   * Gets the events.
   *
   * Either 'events' or 'filter' is required specifically for Git triggers. Stores a list of events that a Git trigger
   * listens to. Choose one or more from 'push', 'pull_request', and 'pull_request_closed'. If SCM repositories use the
   * 'merge request' term, they correspond to the generic term i.e. 'pull request'.
   *
   * @return the events
   */
  public List<String> events() {
    return events;
  }

  /**
   * Gets the filter.
   *
   * Either 'events' or 'filter' can be used. Stores the CEL (Common Expression Language) expression value which is used
   * for event filtering against the Git webhook payloads.
   *
   * @return the filter
   */
  public String filter() {
    return filter;
  }

  /**
   * Gets the favorite.
   *
   * Mark the trigger as a favorite.
   *
   * @return the favorite
   */
  public Boolean favorite() {
    return favorite;
  }

  /**
   * Gets the enableEventsFromForks.
   *
   * Only used for SCM triggers. When enabled, pull request events from forks of the selected repository will trigger a
   * pipeline run.
   *
   * @return the enableEventsFromForks
   */
  public Boolean enableEventsFromForks() {
    return enableEventsFromForks;
  }

  /**
   * Construct a JSON merge-patch from the TriggerPatch.
   *
   * Note that properties of the TriggerPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the TriggerPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

