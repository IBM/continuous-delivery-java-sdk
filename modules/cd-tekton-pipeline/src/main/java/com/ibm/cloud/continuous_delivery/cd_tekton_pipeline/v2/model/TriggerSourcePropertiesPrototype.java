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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Properties of the source, which define the URL of the repository and a branch or pattern.
 */
public class TriggerSourcePropertiesPrototype extends GenericModel {

  protected String url;
  protected String branch;
  protected String pattern;

  /**
   * Builder.
   */
  public static class Builder {
    private String url;
    private String branch;
    private String pattern;

    /**
     * Instantiates a new Builder from an existing TriggerSourcePropertiesPrototype instance.
     *
     * @param triggerSourcePropertiesPrototype the instance to initialize the Builder with
     */
    private Builder(TriggerSourcePropertiesPrototype triggerSourcePropertiesPrototype) {
      this.url = triggerSourcePropertiesPrototype.url;
      this.branch = triggerSourcePropertiesPrototype.branch;
      this.pattern = triggerSourcePropertiesPrototype.pattern;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param url the url
     */
    public Builder(String url) {
      this.url = url;
    }

    /**
     * Builds a TriggerSourcePropertiesPrototype.
     *
     * @return the new TriggerSourcePropertiesPrototype instance
     */
    public TriggerSourcePropertiesPrototype build() {
      return new TriggerSourcePropertiesPrototype(this);
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the TriggerSourcePropertiesPrototype builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set the branch.
     *
     * @param branch the branch
     * @return the TriggerSourcePropertiesPrototype builder
     */
    public Builder branch(String branch) {
      this.branch = branch;
      return this;
    }

    /**
     * Set the pattern.
     *
     * @param pattern the pattern
     * @return the TriggerSourcePropertiesPrototype builder
     */
    public Builder pattern(String pattern) {
      this.pattern = pattern;
      return this;
    }
  }

  protected TriggerSourcePropertiesPrototype() { }

  protected TriggerSourcePropertiesPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.url,
      "url cannot be null");
    url = builder.url;
    branch = builder.branch;
    pattern = builder.pattern;
  }

  /**
   * New builder.
   *
   * @return a TriggerSourcePropertiesPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the url.
   *
   * URL of the repository to which the trigger is listening.
   *
   * @return the url
   */
  public String url() {
    return url;
  }

  /**
   * Gets the branch.
   *
   * Name of a branch from the repo. Only one of branch, pattern, or filter should be specified.
   *
   * @return the branch
   */
  public String branch() {
    return branch;
  }

  /**
   * Gets the pattern.
   *
   * The pattern of Git branch or tag. You can specify a glob pattern such as '!test' or '*master' to match against
   * multiple tags or branches in the repository.The glob pattern used must conform to Bash 4.3 specifications, see bash
   * documentation for more info: https://www.gnu.org/software/bash/manual/bash.html#Pattern-Matching. Only one of
   * branch, pattern, or filter should be specified.
   *
   * @return the pattern
   */
  public String pattern() {
    return pattern;
  }
}

