# Spring BIAN Java Reference Architecture Library

BIAN (Banking Industry Architecture Network) is a membership group committed to developing open standards around banking and financial services.  A key deliverable of this group is the BIAN Service Landscape model which defines a comprehensive services architecture for financial transactions and facilities.  This library is an implementation of the BIAN model leveraging the Spring framework and allows a developer to rapidly create BIAN-compliant services while hiding much of the underlying BIAN model details.  See www.bian.org for more information on BIAN.

This library leverages not only the Spring framework, but a number of the Spring Cloud Services components as well to facilitate building robust and resilient cloud-native BIAN microservices, and is aligned with the Wave 3 approach of the BIAN implementation model.  Spring components that are used:

- [Spring Boot](http://projects.spring.io/spring-boot/)
- [Spring Cloud Netflix](https://cloud.spring.io/spring-cloud-netflix/)
- [Spring Cloud Stream](https://cloud.spring.io/spring-cloud-stream/)

## BIAN Basics

Before diving into the library architecture, it helps to understand two key concepts within BIAN, service domains and control records.

### Service Domain

The BIAN Service Landscape defines discrete areas of responsibility known as service domains.  A **Service Domain** is a combination of a **Functional Pattern** and an **Asset Type**.  For instance, using the functional pattern 'Registry' with the asset type 'Product' would yield a 'Product Registry' service domain, which could be used to manage a product catalog.  If we instead changed the asset type to 'Device', we would have a 'Device Registry' service domain that could be used to authorize services on a mobile device.  

### Control Record

The **Control Record** is used to track the state of a service domain, and like the service domain is derived from the functional pattern and asset type.  However, in a control record, the functional pattern is represented by the **Generic Artifact Type**.  There is a one-to-one correlation between functional patterns and generic artifact types.  The control record goes one step further in delineating between specific service domain operations by introducing an additional parameter called the **Behavior Qualifier**, which, like generic artifact types, have a one-to-one correlation with functional patterns.

### BIAN Summary

So to summarize the above:

**Functional Pattern** ==> **Generic Artifact Type** ==> **Behavior Qualifier**

**Functional Pattern** + **Asset Type** = **Service Domain**

**Generic Artifact Type** + **Asset Type** + (optional)**Behavior Qualifier** = **Control Record**

## Architecture

The Spring BIAN library implements a BIAN service domain wrapper that acts as an API and data translator while hiding much of the BIAN model complexity from the developer:

![Spring BIAN Service Domain](docs/Spring-BIANServiceDomain.png)

Components in dark yellow are provided by the library, light yellow are provided by the developer, and blue are provided by the Spring framework.

### Spring BIAN Library Features
Features of the library are:

- BIAN functional pattern specific service classes
- BIAN generic artifact classes
- BIAN behavior qualifier classes
- A subset of BIAN asset type classes (built as each of the 300+ service domains are implemented)
- BIAN control record classes
- A subset of BIAN service domain specific control record classes (built as each of the 300+ service domains are implemented)
- Common DTO (Data Transfer Object) methodology classes for mapping between API input/output and internal control record representation
- Service Operation handling with default handlers for functional pattern services per BIAN specification.
- Service exception handling
- Distributed central service configuration
- Dynamic service registration
- Service-to-service load balancing
- Service outage quick failover and reporting
- Service status and BIAN information endpoints
- RESTful method to BIAN service operation mapper and handling



## Usage

The repository contains several BIAN libraries and a set of examples:

- spring-bian-core - the core...
- spring-bian-service - the..
- spring-bian-samples - the...

```
mvn clean install
```


1. Identify the BIAN functional pattern of the service domain, and create a RESTful service that subclasses the appropriate BIAN functional service.  By subclassing the functional service, your service automatically inherits a host of common functionality like RESTful endpoints, messaging, error handling, in addition to BIAN functional pattern specific service operation handling.
1. Identify the payload structure of the service domain, both for internal field usage and external data standard mappings
1. Create data mappings for API input to control record, control record to API output, and control record to service back-end.
1. Implement the stubbed-out service operation calls by making any necessary back-end native calls.
