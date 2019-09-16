## SampleRESTAPI

SampleRESTAPI creates a simple JAX-RS(Jersey) REST Interface logic which accepts JSON Data as input and performs some operation 
based on the input data and provides JSON Data as output.

## Prerequisites
1. Eclipse IDE/IntelliJ IDE
2. Tomcat Server
3. Install Gradle
3. JAVA 1.8

## Installing
1. Install Gradle into the system from https://gradle.org/install/#manually
2. Add Plugin for Apache Tomcat Server From Eclipse Market Place.


## Gradle Project Creation
1. Install Build Gradle Integration plugin from Eclipse Market Place so that it can support the Gradle project.
2. Create a new Gradle project by File->New->Others->Gradle Project

## Converting Gradle Project to support Tomcat Server
1. In build.gradle add the tomcat server configurations as mentioned in th project.

## How to Create JAX-RS(Jersey) REST Interface:
1. To include Jersey features in the project add the dependency below in build.gradle
  
  compile 'org.glassfish.jersey.containers:jersey-container-servlet:2.25.1'

## Dependencies required for this project

1. Included Objectify dependency
2. Added the dependencies below to support MediaType.APPLICATION_JSON
   compile group: 'com.fasterxml.jackson.jaxrs', name: 'jackson-jaxrs-json-provider', version: '2.7.9'
   compile group: 'org.glassfish.jersey.media', name: 'jersey-media-json-jackson', version: '2.25.1'
3. Included dependencies related to App Engine so that this projet can be deployed in App Engine Server.

## Project Description
1. In this project Dependency Injection configurations were done in ApplicationConfig.java class
   where singleton instance of StudentRepository class was created.
2. Myresource.java is a sample test class to check whether the particular URL is loading or not
3. Student.java is a simple POJO Class which includes Student Id, Student Name and Student Mark.
4. StudentRepository.java class mostly like performing database related operation.
5. StudentResources.java class is the class which contains REST Interface logic.
   5.1 getStudentList() method is a Get() request which returns all the students from the student repository in JSON Format
   5.2 getStudentWithId(Student student) method is a POST request which JSON as an input and returns the student data in JSON Format
       which matches with the input. 
6. On invoking this URL http://localhost:8080/webapi/student/getStudentList it returns the total number of students in the student repository 
7. On invoking this URL http://localhost:8080/webapi/student/getStudentwithId it returns the particular student from the student repository.

## Deploying this project in Tomcat Server:
1. In Eclipse IDE,right click project->Run as Tomcat Server will run your project in Tomcat Server.































