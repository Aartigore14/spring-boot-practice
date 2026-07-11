# ☕ Spring Boot Practice

> A structured, project-based repository for learning Spring Boot 3.x — built alongside my Java Full Stack placement preparation for the 2026–27 campus placement season.

<br>

## 👩‍💻 About This Repository

This repository documents my Spring Boot learning journey — progressing from basic REST APIs to database integration, security, and full-stack development. Every project is hands-on: concepts are applied immediately after learning, not just watched.

**Learning Path:** REST APIs → Spring Data JPA + MySQL → Spring Security + JWT → Full Stack (SmartSpend)

<br>

## 📁 Repository Structure

```
spring-boot-practice/
│
├── 01-hello-world-api/        → First REST endpoint, @RestController, @GetMapping
├── 02-student-api/            → Full CRUD REST API, @Service layer, DTO pattern
├── 03-student-jpa/            → Spring Data JPA + MySQL integration (upcoming)
├── 04-exception-handling/     → GlobalExceptionHandler, ProblemDetail RFC 7807 (upcoming)
├── 05-jwt-auth-demo/          → Spring Security 6 + JWT (upcoming)
└── README.md
```

<br>

## 🗂️ Projects

### 🟢 Stage 1 — Spring Boot Basics (No Database)

| # | Project | Concepts Covered | Status |
|---|---------|-----------------|--------|
| 01 | [Hello World API](./01-hello-world-api/) | @RestController, @GetMapping, embedded Tomcat, Maven project structure | ✅ Complete |
| 02 | [Student API](./02-student-api/) | Full CRUD, @PostMapping, @PutMapping, @DeleteMapping, @Service layer, @PathVariable, @RequestBody, in-memory ArrayList | ✅ Complete |

---

### 🟡 Stage 2 — Database Integration

| # | Project | Concepts Covered | Status |
|---|---------|-----------------|--------|
| 03 | Student JPA | @Entity, @Repository, Spring Data JPA, MySQL, application.properties | 🔜 Upcoming |
| 04 | Exception Handling | @ControllerAdvice, @ExceptionHandler, ProblemDetail (RFC 7807) | 🔜 Upcoming |
| 05 | Pagination Demo | Pageable, cursor-based pagination, sorting, filtering | 🔜 Upcoming |

---

### 🔴 Stage 3 — Spring Security + JWT

| # | Project | Concepts Covered | Status |
|---|---------|-----------------|--------|
| 06 | JWT Auth Demo | Spring Security 6 filter chain, JWT token, refresh tokens, stateless auth | 🔜 Upcoming |
| 07 | Role Based Access | @PreAuthorize, method-level security, admin vs user roles | 🔜 Upcoming |

---

### 🔵 Stage 4 — Full Stack

| # | Project | Concepts Covered | Status |
|---|---------|-----------------|--------|
| 08 | SmartSpend | Spring Boot + React + MySQL + JWT — complete full stack app | 🔜 Upcoming |

<br>

## 🧠 Concepts Learned So Far

```
✅ Spring Boot auto-configuration and starter dependencies
✅ Maven project structure and pom.xml
✅ @RestController — handles HTTP requests
✅ @GetMapping, @PostMapping, @PutMapping, @DeleteMapping
✅ @PathVariable — read value from URL (/students/{id})
✅ @RequestBody — read JSON from request body
✅ @Service — business logic layer
✅ Three-layer architecture: Controller → Service → Repository
✅ Embedded Tomcat server on port 8080
✅ application.properties configuration
✅ Testing APIs with Postman
🔜 Spring Data JPA + Hibernate
🔜 MySQL integration with HikariCP
🔜 Bean Validation (@Valid, @NotNull, @Size)
🔜 Global exception handling
🔜 Spring Security 6 filter chain
🔜 JWT token generation and validation
```

<br>

## 🏗️ Three Layer Architecture

Every Spring Boot project in this repo follows this structure:

```
HTTP Request
     ↓
Controller (@RestController)
→ Receives request
→ Validates input
→ Calls Service
     ↓
Service (@Service)
→ Contains business logic
→ Calls Repository
     ↓
Repository (@Repository)
→ Talks to database
→ Returns data
     ↓
HTTP Response (JSON)
```

<br>

## 🛠️ Tech Stack

![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=flat&logo=springboot&logoColor=white)
![Java](https://img.shields.io/badge/Java-21_LTS-ED8B00?style=flat&logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=flat&logo=mysql&logoColor=white)
![Lombok](https://img.shields.io/badge/Lombok-1.18.x-red?style=flat)
![Maven](https://img.shields.io/badge/Maven-3.9.x-C71A36?style=flat&logo=apachemaven&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-API_Testing-FF6C37?style=flat&logo=postman&logoColor=white)

<br>

## ▶️ How to Run Any Project

### Prerequisites
- Java 21 LTS ([Download Temurin](https://adoptium.net/))
- Maven 3.9+ or use included `mvnw` wrapper
- MySQL 8.0 (for Stage 2+ projects)
- IntelliJ IDEA Community Edition
- Postman (for API testing)

### Steps

```bash
# 1. Clone this repository
git clone https://github.com/Aartigore14/spring-boot-practice.git

# 2. Navigate to any project
cd spring-boot-practice/01-hello-world-api

# 3. Open in IntelliJ IDEA
# File → Open → select the project folder

# 4. Run the application
# Right-click Application.java → Run

# 5. Test the API
# Open Postman or browser → http://localhost:8080
```

<br>

## 📡 API Reference — Student API

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/students` | Get all students |
| GET | `/api/students/{id}` | Get student by ID |
| POST | `/api/students` | Add new student |
| PUT | `/api/students/{id}` | Update student |
| DELETE | `/api/students/{id}` | Delete student |

<br>

## 📈 Learning Progress

| Stage | Topics | Target |
|-------|--------|--------|
| Stage 1 — Basics | REST API, CRUD, Service layer | ✅ July 2026 |
| Stage 2 — Database | JPA, MySQL, Exception Handling | August 2026 |
| Stage 3 — Security | Spring Security 6, JWT | September 2026 |
| Stage 4 — Full Stack | SmartSpend deployment | November 2026 |

<br>

## 🔗 Connect With Me

| Platform | Link |
|----------|------|
| 💼 LinkedIn | [linkedin.com/in/gore-aarti](https://linkedin.com/in/gore-aarti) |
| 🐙 GitHub | [github.com/Aartigore14](https://github.com/Aartigore14) |
| 💻 LeetCode | [leetcode.com/aartigore](https://leetcode.com/aartigore) |
| 🏆 HackerRank | [hackerrank.com/profile/aartigore2005](https://hackerrank.com/profile/aartigore2005) |

<br>

## 📌 Related Repositories

| Repo | Description |
|------|-------------|
| [java-mini-projects](https://github.com/Aartigore14/java-mini-projects) | Core Java → OOP → Collections → 6 complete projects |
| [smart-parking-system](https://github.com/Aartigore14/smart-parking-system) | Frontend web project — HTML, CSS, JavaScript |

<br>

---

<p align="center">
  <i>Building one Spring Boot project at a time. 🚀</i><br>
  <i>⭐ Star this repo if you find it useful!</i>
</p>
