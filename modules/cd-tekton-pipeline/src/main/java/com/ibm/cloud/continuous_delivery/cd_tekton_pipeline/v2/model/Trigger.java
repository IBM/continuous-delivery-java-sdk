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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Tekton pipeline trigger.
 *
 * Classes which extend this class:
 * - TriggerManualTrigger
 * - TriggerScmTrigger
 * - TriggerTimerTrigger
 * - TriggerGenericTrigger
 */
public class Trigger extends GenericModel {

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
  protected String href;
  @SerializedName("event_listener")
  protected String eventListener;
  protected String id;
  @SerializedName("properties")
  protected List<TriggerProperty> xProperties;
  protected List<String> tags;
  protected Worker worker;
  @SerializedName("max_concurrent_runs")
  protected Long maxConcurrentRuns;
  protected Boolean enabled;
  protected Boolean favorite;
  protected TriggerSource source;
  protected List<String> events;
  protected String filter;
  protected String cron;
  protected String timezone;
  protected GenericSecret secret;
  @SerializedName("webhook_url")
  protected String webhookUrl;

  protected Trigger() { }

  /**
   * Gets the type.
   *
   * Trigger type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the name.
   *
   * Trigger name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the href.
   *
   * API URL for interacting with the trigger. Only included when fetching the list of pipeline triggers.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the eventListener.
   *
   * Event listener name. The name of the event listener to which the trigger is associated. The event listeners are
   * defined in the definition repositories of the Tekton pipeline.
   *
   * @return the eventListener
   */
  public String getEventListener() {
    return eventListener;
  }

  /**
   * Gets the id.
   *
   * The Trigger ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the xProperties.
   *
   * Optional trigger properties are used to override or supplement the pipeline properties when triggering a pipeline
   * run.
   *
   * @return the xProperties
   */
  public List<TriggerProperty> getXProperties() {
    return xProperties;
  }

  /**
   * Gets the tags.
   *
   * Optional trigger tags array.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Gets the worker.
   *
   * Details of the worker used to run the trigger.
   *
   * @return the worker
   */
  public Worker getWorker() {
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
  public Long getMaxConcurrentRuns() {
    return maxConcurrentRuns;
  }

  /**
   * Gets the enabled.
   *
   * Flag to check if the trigger is enabled.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }

  /**
   * Gets the favorite.
   *
   * Mark the trigger as a favorite.
   *
   * @return the favorite
   */
  public Boolean isFavorite() {
    return favorite;
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
  public TriggerSource getSource() {
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
  public List<String> getEvents() {
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
  public String getFilter() {
    return filter;
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
  public String getCron() {
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
  public String getTimezone() {
    return timezone;
  }

  /**
   * Gets the secret.
   *
   * Only needed for Generic Webhook trigger type. The secret is used to start the Generic Webhook trigger.
   *
   * @return the secret
   */
  public GenericSecret getSecret() {
    return secret;
  }

  /**
   * Gets the webhookUrl.
   *
   * Webhook URL that can be used to trigger pipeline runs.
   *
   * @return the webhookUrl
   */
  public String getWebhookUrl() {
    return webhookUrl;
  }
}

