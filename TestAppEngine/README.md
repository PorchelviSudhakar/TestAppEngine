## TestAppEngine

TestAppEngine creates a simple JAX-RS(Jersey) REST Interface logic which accepts JSON Data as input and performs some operation 
based on the input data and provides JSON Data as output.

## Prerequisites
Eclipse IDE/IntelliJ IDE
App Engine JAVA SDK
Install Gradle
JAVA 1.8

## Installing
1.Install Gradle into the system from https://gradle.org/install/#manually
2.Install App Engine JAVA SDK From https://cloud.google.com/appengine/docs/java/download


## Gradle Project Creation
1. Install Build Gradle Integration plugin from Eclipse Market Place so that it can support the Gradle project.
2.Create a new Gradle project by File->New->Others->Gradle Project

## Converting Gradle Project to support App Engine
1.In Eclipse Right Click->Properties->Project Facets->check the following
   1.1 App Engine Java Standard Environment JRE8
   1.2 Dynamic Web Module 3.0
   1.3 Java 1.8
   1.4 JAX-RS(REST Web Services) 1.1

Apply the above configuration in the project.
2. The above configurations create an src->main->webapp folder in the project and generate an appengine-web.xml file in the project.
3. Remove Default Library.java and LibraryTest.java classes from the Gradle Project.  

Note: The above configurations can make the Gradle project to deploy in App Engine Server.

## How to Create JAX-RS(Jersey) REST Interface:
1. To include Jersey features in the project add the dependency below in build.gradle
  
  compile 'org.glassfish.jersey.containers:jersey-container-servlet:2.25.1'

## Dependencies required for this project

1. Included Objectify dependency
2. Added the dependencies below to support MediaType.APPLICATION_JSON
   compile group: 'com.fasterxml.jackson.jaxrs', name: 'jackson-jaxrs-json-provider', version: '2.7.9'
   compile group: 'org.glassfish.jersey.media', name: 'jersey-media-json-jackson', version: '2.25.1'
3.Included dependencies related to App Engine so that this projet can be deployed in App Engine Server.

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

## Deploying this project in App Engine
1. In Google Cloud SDK Shell enter the following commands
      1.1 gcloud init
      1.2 gcloud auth application-default login (This command makes you to login with your account)
      1.3 gradle appengineRun(This command will make you run the application)
2. http://localhost:8080/webapi/myresource simply returns a text message saying "Got It!".
3. On invoking this URL http://localhost:8080/webapi/student/getStudentList it returns the total number of students in the student repository 
4. On invoking this URL http://localhost:8080/webapi/student/getStudentwithId it returns the particular student from the student repository.    































