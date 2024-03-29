# Pizza Creed Backend 🍕🛠️

## Project Description

Welcome to the Pizza Creed backend, a scalable and secure solution developed to handle pizza product management and customer shopping baskets. 🎉

### 🎯 Objectives

- Understand SOA and Microservices architecture.
- Implement EJB 3, Spring Framework, and Spring MVC.
- Develop a REST API for Pizza Creed to support a mobile app for pizza orders.
- Ensure secure and modular backend functionality for pizza product management and shopping baskets.

### 🚀 Features

#### Pizza Product Management
- Admin web console for CRUD operations on pizza products.
- Secure endpoints for authenticated administrators.

#### Shopping Basket
- Entities for managing customer shopping baskets (`ShoppingBasket`, `BasketItem`).
- RESTful API for basket operations (create, add, remove, view, checkout).
- Authentication for securing customer-specific basket operations.

### 🛠️ Technologies Used

- Java 17
- Spring Boot, Spring MVC, Spring Data JPA
- H2 Database (for testing and development)
- Postman for API testing

### 🏗️ System Architecture

- Microservices architecture for shopping basket component.
- Modular design for pizza product management.
- Secure endpoints to protect sensitive operations.

### 🧪 Testing

- Unit tests for controllers and services.
- Integration tests to ensure seamless system interactions.
- Postman tests for comprehensive API validation.

### 📜 How to Run

1. Clone the repository.
2. Set up your database configuration in `application.properties`.
3. Run the application using `mvn spring-boot:run`.

### 🚦 How to Test

1. Run unit tests using `mvn test`.
2. Use Postman to execute API tests (refer to `PostmanTests.md`).

### 🤝 Contribution Guidelines

1. Fork the repository.
2. Create a new branch for your feature/fix.
3. Submit a pull request with a detailed description.

### 📖 Documentation

Detailed project documentation, including architecture and API usage, is available in the [docs](docs) directory.
