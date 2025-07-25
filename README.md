# IBM Cloud Continuous Delivery Java SDK Version 2.0.2 

[![Build Status](https://app.travis-ci.com/IBM/continuous-delivery-java-sdk.svg?branch=main)](https://app.travis-ci.com/github/IBM/continuous-delivery-java-sdk)
[![Release](https://img.shields.io/github/v/release/IBM/continuous-delivery-java-sdk)](https://github.com/IBM/continuous-delivery-java-sdk/releases/latest)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![semantic-release](https://img.shields.io/badge/%20%20%F0%9F%93%A6%F0%9F%9A%80-semantic--release-e10079.svg)](https://github.com/semantic-release/semantic-release)

The Java client library to interact with the [IBM Cloud Continuous Delivery Toolchain and Tekton Pipeline APIs](https://cloud.ibm.com/docs?tab=api-docs&category=devops).

## Table of Contents

<!--
  The TOC below is generated using the `markdown-toc` node package.

      https://github.com/jonschlinkert/markdown-toc

  You should regenerate the TOC after making changes to this file.

      npx markdown-toc --maxdepth 4 -i README.md
  -->

<!-- toc -->

- [IBM Cloud Continuous Delivery Java SDK Version 2.0.2](#ibm-cloud-continuous-delivery-java-sdk-version-190)
  - [Table of Contents](#table-of-contents)
  - [Overview](#overview)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
    - [Maven](#maven)
    - [Gradle](#gradle)
  - [Using the SDK](#using-the-sdk)
  - [Questions](#questions)
  - [Issues](#issues)
  - [Open source @ IBM](#open-source--ibm)
  - [Contributing](#contributing)
  - [License](#license)

<!-- tocstop -->

## Overview

The IBM Cloud Continuous Delivery Java SDK allows developers to programmatically interact with the following IBM Cloud services:

Service Name | Artifact Coordinates
--- | ---
[Toolchain API](https://cloud.ibm.com/apidocs/toolchain?code=java) | com.ibm.cloud:cd-toolchain:2.0.2
[Tekton Pipeline API](https://cloud.ibm.com/apidocs/tekton-pipeline?code=java) | com.ibm.cloud:cd-tekton-pipeline:2.0.2

Table 1. IBM Cloud services

## Prerequisites

[ibm-cloud-onboarding]: https://cloud.ibm.com/registration

- An [IBM Cloud][ibm-cloud-onboarding] account.
- An IAM API key to allow the SDK to access your account. Create one [here](https://cloud.ibm.com/iam/apikeys).
- Java 8 or above.

## Installation

The current version of this SDK is: 2.0.2

Each service's artifact coordinates are listed in the table above.

The project artifacts are published on the public [Maven Central](https://repo1.maven.org/maven2/)
artifact repository.  This is the default public repository used by maven when searching for dependencies.
To use this repository within a gradle build, please see
[this link](https://docs.gradle.org/current/userguide/declaring_repositories.html).

To use a particular service, define a dependency that contains the
artifact coordinates (group id, artifact id and version) for the service.
Here are examples for maven and gradle:

### Maven

```xml
<dependency>
    <groupId>com.ibm.cloud</groupId>
    <artifactId>cd-toolchain</artifactId>
    <version>2.0.2</version>
</dependency>
<dependency>
    <groupId>com.ibm.cloud</groupId>
    <artifactId>cd-tekton-pipeline</artifactId>
    <version>2.0.2</version>
</dependency>
```

### Gradle

```gradle
compile 'com.ibm.cloud:cd-toolchain:2.0.2'
compile 'com.ibm.cloud:cd-tekton-pipeline:2.0.2'
```

## Using the SDK

For general SDK usage information, please see [this link](https://github.com/IBM/ibm-cloud-sdk-common/blob/main/README.md)

## Questions

If you are having difficulties using this SDK or have a question about the IBM Cloud services,
please ask a question at
[Stack Overflow](http://stackoverflow.com/questions/ask?tags=ibm-cloud).
Alternatively, you can reach out to the IBM Cloud Continuous Delivery development team by joining us on [Slack](https://ic-devops-slack-invite.us-south.devops.cloud.ibm.com/).

## Issues

If you encounter an issue with the project, you are welcome to submit a
[bug report](https://github.com/IBM/continuous-delivery-java-sdk/issues).
Before that, please search for similar issues. It's possible that someone has already reported the problem.

## Open source @ IBM

Find more open source projects on the [IBM Github Page](http://ibm.github.io/)

## Contributing

See [CONTRIBUTING](CONTRIBUTING.md).

## License

The IBM Cloud Continuous Delivery Java SDK is released under the Apache 2.0 license.
The license's full text can be found in [LICENSE](LICENSE).
