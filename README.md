
# Blog API Backend with Java

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java Version](https://img.shields.io/badge/Java-17%2B-blue)](https://openjdk.org/projects/jdk/17/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen)](https://spring.io/projects/spring-boot)

A RESTful API backend for a blogging platform built with Java and Spring Boot, featuring secure authentication, CRUD operations, and comprehensive documentation.

## Features

- JWT-based authentication & authorization
- CRUD operations for blog posts, comments, categories, and tags
- Advanced search with pagination and sorting
- Nested comment system with moderation
- Request validation and error handling
- Automated database migrations (Flyway)
- Swagger/OpenAPI 3 documentation
- Unit and integration testing

## Tech Stack

- **Core**: Java 17, Spring Boot 3.x
- **Security**: Spring Security, JWT
- **Database**: MySQL, Spring Data JPA, Hibernate
- **Tools**: Maven, Lombok, MapStruct
- **Testing**: JUnit 5, Mockito, Testcontainers
- **Documentation**: Springdoc OpenAPI

## Prerequisites

- Java 17 or higher
- Maven 3.8+
- MySQL 8.0+
- (Optional) Docker 20.10+

## Installation

1. Clone the repository:
```bash
git clone https://github.com/your-username/blog-api-java.git
cd blog-api-java
