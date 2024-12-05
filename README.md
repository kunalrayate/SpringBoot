# Spring Boot JDBC CRUD Application

## Overview
This project is a Spring Boot application designed to manage candidates using JDBC for database operations. The application supports basic CRUD operations (Create, Read, Update, and Delete) and includes functionality to search for candidates based on their party name and state name.

## Features and Operations :

1. GET Operation :
      Retrieve a list of all candidates or a specific candidate by their unique ID.
      Candidates can be fetched based on additional filters such as party name and state name.
   
2. INSERT Operation :
       Allows the creation of new candidates. You can add a candidate's name, party affiliation, state, and other relevant details.
   
3. UPDATE Operation :
       Update an existing candidate’s information, including their party affiliation, state, or other personal details.
   
4. DELETE Operation :
   - Delete candidate records from the system using the unique candidate ID.

## Attributes
Each candidate record consists of the following attributes:
- **c_id**: Candidate ID (Unique Identifier)
- **name**: Full name of the candidate
- **partyname**: Political party name
- **assembly**: Assembly constituency
- **statename**: Name of the state
- **gender**: Gender of the candidate
- **age**: Age of the candidate

## Technologies Used
- **Spring Boot** : The main framework to build the Java application, providing a fast and easy way to set up a Spring-based project with minimal configuration.
- **JDBC** : Java Database Connectivity, used for connecting and executing SQL queries with the MySQL database.
- **MySQL** : A relational database management system for storing candidate data and other application-related information.
- **Maven** : A build automation tool used for dependency management and project configuration.

##  To create a Spring Boot project using Spring Initializr, download it, extract the files, and then import it into Eclipse, follow these steps :

  1. Create the Project using Spring Initializr :
 -  Go to the Spring Initializr website : Spring Initializ
 -  Project Settings :
 -  Project : Choose Maven Project or Gradle Project (For this example, we'll use Maven).
 -  Language : Choose Java.
 -  Spring Boot Version : Select the latest stable version.
   
 2. Project Metadata :
  - Group : com.example (or your preferred group name)
 - Artifact : springbootproject (or your project name)
 - Description : A simple Spring Boot project.
 - Package Name: com.example.springboot.
 - Packaging : Choose Jar (unless you need a WAR file).
 - Java Version : Choose your JDK version (11 or later).
   
3. Dependencies :
   - Spring Web (for REST APIs).
   - Spring Boot DevTools (for development convenience).
   - Spring Data JPA (for database connectivity, especially if using MySQL).
   - MySQL Driver (if you're using MySQL).
