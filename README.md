# 📇 Contact Grid Integration System

A Spring Boot-based backend application that provides a RESTful API for managing contact information like name, email, and phone number in a dictionary-style format. This system supports full CRUD operations and is designed for scalability, integration, and ease of use.

## 🚀 Technologies Used
- Java
- Spring Boot
- Maven
- RESTful APIs
- JSON
- Postman (for API testing)

## ✨ Features

### 🔍 Contact Management
- **Create Contact**: Add a new contact with name, email, and phone number.
- **Read Contact**: Retrieve contact details by ID or list all contacts.
- **Update Contact**: Modify existing contact information.
- **Delete Contact**: Remove a contact from the system.

### 🧠 System Highlights
- Dictionary-style data structure for fast lookup and organization.
- Modular codebase following clean architecture principles.
- Exception handling for robust and secure API responses.
- Integration-ready endpoints for frontend or third-party services.

## 📦 API Endpoints

| Method | Endpoint             | Description              |
|--------|----------------------|--------------------------|
| POST   | `/api/contacts`      | Create a new contact     |
| GET    | `/api/contacts`      | Get all contacts         |
| GET    | `/api/contacts/{id}` | Get contact by ID        |
| PUT    | `/api/contacts/{id}` | Update contact by ID     |
| DELETE | `/api/contacts/{id}` | Delete contact by ID     |

## 🛠 Setup Instructions
1. Clone the repository.
2. Run `mvn clean install` to build the project.
3. Start the application using your IDE or `mvn spring-boot:run`.
4. Use Postman or any REST client to interact with the API.

## 📞 Contact ankitprajapati3785@gmail.com
For questions or collaboration, feel free to reach out via email or GitHub.
