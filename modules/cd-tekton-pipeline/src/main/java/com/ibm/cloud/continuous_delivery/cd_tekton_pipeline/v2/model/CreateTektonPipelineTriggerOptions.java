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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createTektonPipelineTrigger options.
 */
public class CreateTektonPipelineTriggerOptions extends GenericModel {

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

  protected String pipelineId;
  protected String type;
  protected String name;
  protected String eventListener;
  protected List<String> tags;
  protected WorkerIdentity worker;
  protected Long maxConcurrentRuns;
  protected Boolean enabled;
  protected GenericSecret secret;
  protected String cron;
  protected String timezone;
  protected TriggerSourcePrototype source;
  protected List<String> events;
  protected String filter;
  protected Boolean favorite;
  protected Boolean enableEventsFromForks;

  /**
   * Builder.
   */
  public static class Builder {
    private String pipelineId;
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
     * Instantiates a new Builder from an existing CreateTektonPipelineTriggerOptions instance.
     *
     * @param createTektonPipelineTriggerOptions the instance to initialize the Builder with
     */
    private Builder(CreateTektonPipelineTriggerOptions createTektonPipelineTriggerOptions) {
      this.pipelineId = createTektonPipelineTriggerOptions.pipelineId;
      this.type = createTektonPipelineTriggerOptions.type;
      this.name = createTektonPipelineTriggerOptions.name;
      this.eventListener = createTektonPipelineTriggerOptions.eventListener;
      this.tags = createTektonPipelineTriggerOptions.tags;
      this.worker = createTektonPipelineTriggerOptions.worker;
      this.maxConcurrentRuns = createTektonPipelineTriggerOptions.maxConcurrentRuns;
      this.enabled = createTektonPipelineTriggerOptions.enabled;
      this.secret = createTektonPipelineTriggerOptions.secret;
      this.cron = createTektonPipelineTriggerOptions.cron;
      this.timezone = createTektonPipelineTriggerOptions.timezone;
      this.source = createTektonPipelineTriggerOptions.source;
      this.events = createTektonPipelineTriggerOptions.events;
      this.filter = createTektonPipelineTriggerOptions.filter;
      this.favorite = createTektonPipelineTriggerOptions.favorite;
      this.enableEventsFromForks = createTektonPipelineTriggerOptions.enableEventsFromForks;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param pipelineId the pipelineId
     * @param type the type
     * @param name the name
     * @param eventListener the eventListener
     */
    public Builder(String pipelineId, String type, String name, String eventListener) {
      this.pipelineId = pipelineId;
      this.type = type;
      this.name = name;
      this.eventListener = eventListener;
    }

    /**
     * Builds a CreateTektonPipelineTriggerOptions.
     *
     * @return the new CreateTektonPipelineTriggerOptions instance
     */
    public CreateTektonPipelineTriggerOptions build() {
      return new CreateTektonPipelineTriggerOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the CreateTektonPipelineTriggerOptions builder
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
     * @return the CreateTektonPipelineTriggerOptions builder
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
     * Set the pipelineId.
     *
     * @param pipelineId the pipelineId
     * @return the CreateTektonPipelineTriggerOptions builder
     */
    public Builder pipelineId(String pipelineId) {
      this.pipelineId = pipelineId;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateTektonPipelineTriggerOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateTektonPipelineTriggerOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the eventListener.
     *
     * @param eventListener the eventListener
     * @return the CreateTektonPipelineTriggerOptions builder
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
     * @return the CreateTektonPipelineTriggerOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the CreateTektonPipelineTriggerOptions builder
     */
    public Builder worker(WorkerIdentity worker) {
      this.worker = worker;
      return this;
    }

    /**
     * Set the maxConcurrentRuns.
     *
     * @param maxConcurrentRuns the maxConcurrentRuns
     * @return the CreateTektonPipelineTriggerOptions builder
     */
    public Builder maxConcurrentRuns(long maxConcurrentRuns) {
      this.maxConcurrentRuns = maxConcurrentRuns;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the CreateTektonPipelineTriggerOptions builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the secret.
     *
     * @param secret the secret
     * @return the CreateTektonPipelineTriggerOptions builder
     */
    public Builder secret(GenericSecret secret) {
      this.secret = secret;
      return this;
    }

    /**
     * Set the cron.
     *
     * @param cron the cron
     * @return the CreateTektonPipelineTriggerOptions builder
     */
    public Builder cron(String cron) {
      this.cron = cron;
      return this;
    }

    /**
     * Set the timezone.
     *
     * @param timezone the timezone
     * @return the CreateTektonPipelineTriggerOptions builder
     */
    public Builder timezone(String timezone) {
      this.timezone = timezone;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the CreateTektonPipelineTriggerOptions builder
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
     * @return the CreateTektonPipelineTriggerOptions builder
     */
    public Builder events(List<String> events) {
      this.events = events;
      return this;
    }

    /**
     * Set the filter.
     *
     * @param filter the filter
     * @return the CreateTektonPipelineTriggerOptions builder
     */
    public Builder filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set the favorite.
     *
     * @param favorite the favorite
     * @return the CreateTektonPipelineTriggerOptions builder
     */
    public Builder favorite(Boolean favorite) {
      this.favorite = favorite;
      return this;
    }

    /**
     * Set the enableEventsFromForks.
     *
     * @param enableEventsFromForks the enableEventsFromForks
     * @return the CreateTektonPipelineTriggerOptions builder
     */
    public Builder enableEventsFromForks(Boolean enableEventsFromForks) {
      this.enableEventsFromForks = enableEventsFromForks;
      return this;
    }
  }

  protected CreateTektonPipelineTriggerOptions() { }

  protected CreateTektonPipelineTriggerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.pipelineId,
      "pipelineId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.eventListener,
      "eventListener cannot be null");
    pipelineId = builder.pipelineId;
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
   * @return a CreateTektonPipelineTriggerOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the pipelineId.
   *
   * The Tekton pipeline ID.
   *
   * @return the pipelineId
   */
  public String pipelineId() {
    return pipelineId;
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
   * Trigger tags array.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the worker.
   *
   * Specify the worker used to run the trigger. Use `worker: { id: 'public' }` to use the IBM Managed workers. The
   * default is to inherit the worker set in the pipeline settings, which can also be explicitly set using `worker: {
   * id: 'inherit' }`.
   *
   * @return the worker
   */
  public WorkerIdentity worker() {
    return worker;
  }

  /**
   * Gets the maxConcurrentRuns.
   *
   * Defines the maximum number of concurrent runs for this trigger. If omitted then the concurrency limit is disabled
   * for this trigger.
   *
   * @return the maxConcurrentRuns
   */
  public Long maxConcurrentRuns() {
    return maxConcurrentRuns;
  }

  /**
   * Gets the enabled.
   *
   * Flag to check if the trigger is enabled. If omitted the trigger is enabled by default.
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
}

