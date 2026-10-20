# Student Portal — Java Full Stack Web Application

## 📌 Project Overview

The Student Portal is a full-stack web application developed to simplify student information management. It provides secure authentication, student record management, and role-based access control through a responsive web interface.

The application allows authorized users to manage student records while ensuring that protected operations are accessible only to users with the appropriate permissions.

## 🎯 Objectives

- Develop a responsive student management application.
- Implement secure user authentication using JWT.
- Store and manage student information in MySQL.
- Perform CRUD operations on student records.
- Implement role-based authorization.
- Connect a React frontend to a Spring Boot REST API.

## 🛠️ Technologies Used

### Frontend
- React.js
- HTML5
- CSS3
- Axios

### Backend
- Java
- Spring Boot
- Spring Security
- RESTful APIs
- JWT Authentication
- BCrypt Password Hashing

### Database
- MySQL
- Spring Data JPA

### Development Tools
- Eclipse IDE
- Visual Studio Code
- MySQL Workbench
- Postman
- Git and GitHub
- Maven

## ✨ Features

### Authentication and Security
- User registration and login.
- JWT-based authentication.
- BCrypt password hashing.
- Role-based access control.
- Logout functionality.

### Student Management
- Add new student records.
- View all students.
- Search for students.
- View student details by ID.
- Update student information.
- Delete student records.

### User Interface
- Responsive design.
- Reusable React components.
- Form validation.
- API integration using Axios.
- Error and success messages.

## 🏗️ Application Architecture

The application follows a client-server architecture.

1. **React Frontend:** Displays the user interface and collects user input.
2. **Axios:** Sends HTTP requests to the backend.
3. **Spring Boot REST API:** Processes requests and applies business logic.
4. **Spring Security:** Authenticates users and enforces access permissions.
5. **JWT:** Carries authentication claims for protected API requests.
6. **MySQL:** Stores student records and user information.

## 🔐 Authentication Flow

1. A user registers or logs in.
2. The backend validates the credentials.
3. The password is verified using BCrypt.
4. The backend issues a JWT after successful authentication.
5. The frontend sends the JWT with protected API requests.
6. Spring Security validates the token and checks permissions.

## 🗄️ Database Design

The database can contain the following tables:

### Users
- id
- name
- email
- password
- role

### Students
- student_id
- first_name
- last_name
- age
- email
- course
- marks

The actual columns should match the entities implemented in the project.

## 🚀 How to Run the Project

### Prerequisites
- Java 17 or a version supported by the project.
- Maven.
- Node.js and npm.
- MySQL Server.
- Eclipse or another Java IDE.
- Visual Studio Code or another frontend editor.

### Step 1: Configure MySQL

Create the database:

```sql
CREATE DATABASE student_portal;
```

Configure the database URL, username, and password in the backend's `application.properties` file.

### Step 2: Start the Backend

Open the Spring Boot project in Eclipse.

Update the database configuration and run the main Spring Boot application class.

### Step 3: Start the Frontend

Open a terminal in the React project directory:

```bash
npm install
npm run dev
```

Open the local URL displayed by Vite.

### Step 4: Test the Application

- Register a user.
- Log in with valid credentials.
- Test student CRUD operations.
- Verify that protected APIs reject unauthorized requests.
- Test logout.

## 🔒 Security Considerations

- Passwords should never be stored in plain text.
- Protected APIs must enforce authorization on the backend.
- JWT signing secrets must be kept outside source control.
- Input validation should be applied to incoming requests.
- Production deployments should use HTTPS.

## 📚 Learning Outcomes

- Java and Spring Boot application development.
- REST API development and testing.
- React component development.
- Frontend and backend integration.
- MySQL database integration.
- Authentication and authorization.
- Exception handling and validation.
- Git and GitHub project management.

## 👨‍💻 Author

**Lakshmi Sai Manikanta Srinu Namana**

Java Full Stack Developer

## 📄 License

This project is intended for educational and portfolio purposes.
