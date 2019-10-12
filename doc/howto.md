### How to build and run
### Configure Lombok
### Configure Swagger
### Configure YAML
### Configure Hibernate
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```
This dependency includes JPA API, JPA Implementation, JDBC and other needed libraries. Since the default JPA implementation is Hibernate,
this dependency is actually enough to bring it in as well.
Finally, we’ll use H2 as a very lightweight database for this example:
```
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
```
We can use the H2 console to check that the DB is up and running, also for a user-friendly GUI for our data entry. 
Let’s go ahead and enable it in application.properites:
```
spring.h2.console.enabled=true
```
_I used in application-dev.properties file._

This is all we needed to configure to include Hibernate and H2.

We can check the configuration was successful on the logs when we start up the Spring Boot application.
### Configure profile
### H2 Database
### Different DB for different environment
