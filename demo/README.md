# Getting Started

### Build Quickly

- Spring Initializr
- Spring Boot Starter Projects
- Spring Boot Auto Configuration
- Spring Boot DevTools

### Production Readiness

- Logging
- Support for Different Environments
- Monitor using Spring Boot Actuator

### Tips

- To find details of auto configuration change logging level to debug and observe the startup logs
- change logging level to debug by adding following lines to application.properties
  `logging.level.org.springframework = debug `
- In the console debug statements look for the section - **Condition Evaluation Report**, this section describes dependencies those could be auto configured and those that could not be
- **Spring Boot DevTools** provides ways to increase productivity, such as pick up changes without having to manually restart server. To add this, update **pom.xml** with this dependency
- **Important** - Any change made to pom.xml file requires a server restart
- Levels of Logs supported:
  `trace` > `debug` > `info` > `warning` > `error` || `off`

### Spring Profiles

- Use **Profiles** to control environment specific settings. This is done by creating application properties named after the region. example **application-dev.properties**
- Update the main **application.properties** file with the following value to apply region - `spring.profiles.active=dev`
- For complex and hierarchical values, using Configuration class instead

### Reference Documentation

- [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.0/reference/htmlsingle/index.html#web)

### Guides

The following guides illustrate how to use some features concretely:

- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
