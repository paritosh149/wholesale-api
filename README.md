# Introduction
This is a sample project created to showcase following:
1. Spring Boot Application Basics
2. Spring JPA demo using H2 in-memory database
3. Spring Rest Data using Account and Transaction as base models
4. Spring Test using JUnit standard API
5. Spring HAL Browser dependency injection
6. Swagger UI for Spring Rest Data Repositories.

##### Note: This project is initialized using start.spring.io Starter project.

**Build steps**
1. Download Maven from https://maven.apache.org/download.cgi
2. Install Maven (Steps are described in https://maven.apache.org/install.html)
3. On Command Line, enter following command
   `mvn package`
4. Open target folder to find the packaged JAR file named anz_wholesale_api-0.0.1-SNAPSHOT.JAR.


**Run steps**
1. On command line, enter following command
`java anz_wholesale_api-0.0.1-SNAPSHOT.JAR`
2. Open a new Web Browser Window, and
    1. Go to http://localhost:8080/ to open HAL Browser.
    2. Go to http://localhost:8080/swagger-ui.html to open Swagger UI


##### Assumptions:
1. The data is inserted as shown in the given PDF document.
2. The data is provided over http using GET in JSON format only.
3. PUT, POST and DELETE are prohibited as per PDF document.
4. JFrog maven repository is used for Swagger 3.0.0-SNAPSHOT
