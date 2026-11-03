🎓 Student Portal – Spring Boot REST API
📌 Project Overview

The Student Portal is a RESTful web application developed using Spring Boot that performs CRUD (Create, Read, Update, Delete) operations to manage student records.

This application provides REST API endpoints to add new students, retrieve student details, update existing student information, and delete student records. It follows a layered architecture to maintain clean, organized, and maintainable code.

🚀 Technologies Used
Java – Programming Language
Spring Boot – Backend Framework
Spring Web – REST API Development
Spring Data JPA – Database Operations
MySQL – Database
Hibernate – ORM Framework
Maven – Dependency Management
Postman – API Testing
Eclipse / Spring Tool Suite – IDE
✨ Features
➕ Add new student records.
📋 Retrieve all student records.
🔍 Retrieve student details by ID.
✏️ Update existing student information.
❌ Delete student records.
🔗 RESTful API architecture.
🗄️ MySQL database integration.
⚙️ Layered architecture for better code organization.
🏗️ Project Architecture

The project follows a layered architecture:

text
StudentPortal
│
├── src/main/java
│   └── com.studentportal
│       │
│       ├── controller
│       │   └── StudentController.java
│       │
│       ├── service
│       │   └── StudentService.java
│       │
│       ├── repository
│       │   └── StudentRepository.java
│       │
│       ├── entity
│       │   └── Student.java
│       │
│       └── StudentPortalApplication.java
│
├── src/main/resources
│   └── application.properties
│
└── pom.xml

🔧 CRUD Operations
Operation	HTTP Method	Description
Create	POST	Add a new student
Read All	GET	Get all students
Read By ID	GET	Get student by ID
Update	PUT	Update student details
Delete	DELETE	Delete a student
🌐 REST API Endpoints

Assuming the controller uses /api/students as its base URL:

HTTP Method	Endpoint	Description
POST	/api/students	Add Student
GET	/api/students	Get All Students
GET	/api/students/{id}	Get Student By ID
PUT	/api/students/{id}	Update Student
DELETE	/api/students/{id}	Delete Student
📥 Sample JSON Request

Create Student (POST)

json
{
  "name": "Rahul",
  "email": "rahul@gmail.com",
  "course": "Java Full Stack",
  "phone": "9876543210"
}


Note: Adjust the JSON fields according to your Student entity.

⚙️ Database Configuration

Configure your MySQL database in application.properties:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=root

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

server.port=8080

▶️ How to Run the Project
Clone the repository:
bash
git clone <your-github-repository-url>

Open the project in Eclipse, STS, or IntelliJ IDEA.
Create a MySQL database:
sql
CREATE DATABASE student_db;

Configure your MySQL username and password in application.properties.
Update Maven dependencies.
Run the main Spring Boot application:
bash
mvn spring-boot:run

The application will start at:
text
http://localhost:8080

🧪 API Testing

The REST API endpoints can be tested using Postman.

Test the following operations:

POST – Add a student.
GET – Retrieve all students.
GET – Retrieve a student using ID.
PUT – Update student information.
DELETE – Remove a student.
🎯 Learning Outcomes

Through this project, I gained practical knowledge of:

Developing RESTful APIs using Spring Boot.
Implementing CRUD operations.
Integrating Spring Data JPA with MySQL.
Understanding Entity, Repository, Service, and Controller layers.
Handling HTTP methods and API requests.
Testing REST APIs using Postman.
Managing backend application development using Maven.
👨‍💻 Author

Your Name

Java | Spring Boot | REST API | MySQL

⭐ If you find this project useful, don't forget to give it a star!
