# ☕ Spring Boot Practice

> A structured, project-based learning repository covering Spring Boot 3.x from basics to advanced — built alongside my Java Full Stack placement preparation for 2026–27 campus drives.

<br>

## 👩‍💻 About This Repository

This repository documents my Spring Boot learning journey, progressing from basic REST APIs to full-stack integration with React and MySQL. Every project here is hands-on — concepts are applied immediately after learning, not just watched.

**Learning Path:** REST APIs → Spring Data JPA → Spring Security + JWT → Full Stack

<br>

## 📁 Repository Structure

```
spring-boot-practice/
│
├── 01-basics/
│   ├── hello-world-api/          → First REST endpoint, @RestController
│   ├── student-api/              → Full CRUD with in-memory ArrayList
│   └── exception-handling/       → GlobalExceptionHandler, ProblemDetail
│
├── 02-database/
│   ├── student-jpa/              → Spring Data JPA + MySQL
│   ├── product-crud/             → Full CRUD with database + pagination
│   └── pagination-demo/          → Pageable, sorting, filtering
│
├── 03-security/
│   ├── jwt-auth-demo/            → Spring Security 6 + JWT
│   └── role-based-access/        → @PreAuthorize, admin vs user roles
│
├── 04-advanced/
│   ├── file-upload-api/          → Multipart file handling
│   └── email-service/            → JavaMailSender integration
│
└── README.md
```

<br>

## 🗂️ Projects

### 🟢 Stage 1 — Spring Boot Basics (No Database)

| # | Project | Concepts Covered | Status |
|---|---------|-----------------|--------|
| 01 | [Hello World API](./01-basics/hello-world-api/) | @RestController, @GetMapping, embedded Tomcat | ✅ Complete |
| 02 | [Student API](./01-basics/student-api/) | Full CRUD, @PostMapping, @PutMapping, @DeleteMapping, DTO pattern | 🔜 Upcoming |
| 03 | [Exception Handling](./01-basics/exception-handling/) | @ControllerAdvice, ProblemDetail (RFC 7807), custom exceptions | 🔜 Upcoming |

---

### 🟡 Stage 2 — Database Integration

| # | Project | Concepts Covered | Status |
|---|---------|-----------------|--------|
| 04 | [Student JPA](./02-database/student-jpa/) | @Entity, @Repository, Spring Data JPA, MySQL | 🔜 Upcoming |
| 05 | [Product CRUD](./02-database/product-crud/) | Full CRUD with DB, Flyway migrations, indexing | 🔜 Upcoming |
| 06 | [Pagination Demo](./02-database/pagination-demo/) | Pageable, cursor-based pagination, sorting | 🔜 Upcoming |

---

### 🔴 Stage 3 — Spring Security + JWT

| # | Project | Concepts Covered | Status |
|---|---------|-----------------|--------|
| 07 | [JWT Auth Demo](./03-security/jwt-auth-demo/) | Spring Security 6 filter chain, JWT, refresh tokens | 🔜 Upcoming |
| 08 | [Role Based Access](./03-security/role-based-access/) | @PreAuthorize, method-level security, admin vs user | 🔜 Upcoming |

---

### 🔵 Stage 4 — Advanced Features

| # | Project | Concepts Covered | Status |
|---|---------|-----------------|--------|
| 09 | [File Upload API](./04-advanced/file-upload-api/) | MultipartFile, file storage, validation | 🔜 Upcoming |
| 10 | [Email Service](./04-advanced/email-service/) | JavaMailSender, async email, templates | 🔜 Upcoming |

<br>

## 🧠 Concepts Covered

```
✅ Spring Boot auto-configuration and starter dependencies
✅ @RestController, @GetMapping, @PostMapping, @PutMapping, @DeleteMapping
✅ Embedded Tomcat server
✅ Maven project structure and pom.xml
✅ application.properties configuration
🔜 DTO (Data Transfer Object) pattern
🔜 Bean Validation (@Valid, @NotNull, @Size)
🔜 Spring Data JPA + Hibernate
🔜 MySQL integration with HikariCP connection pool
🔜 Spring Security 6 filter chain
🔜 JWT token generation and validation
🔜 Role-based access control
🔜 Global exception handling (ProblemDetail RFC 7807)
🔜 Pagination and sorting
```

<br>

## 🛠️ Tech Stack

![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.x-6DB33F?style=flat&logo=springboot&logoColor=white)
![Java](https://img.shields.io/badge/Java-21_LTS-ED8B00?style=flat&logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=flat&logo=mysql&logoColor=white)
![Lombok](https://img.shields.io/badge/Lombok-1.18.x-red?style=flat)
![Maven](https://img.shields.io/badge/Maven-3.9.x-C71A36?style=flat&logo=apachemaven&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-Community-000000?style=flat&logo=intellijidea&logoColor=white)

<br>

## ▶️ How to Run Any Project

### Prerequisites
- Java 21 LTS ([Download Temurin](https://adoptium.net/))
- Maven 3.9+ or use included `mvnw` wrapper
- MySQL 8.0 (for Stage 2+ projects)
- IntelliJ IDEA (Community Edition)
- Postman (for API testing)

### Steps

```bash
# 1. Clone this repository
git clone https://github.com/Aartigore14/spring-boot-practice.git

# 2. Navigate to any project folder
cd spring-boot-practice/01-basics/hello-world-api

# 3. Open in IntelliJ IDEA
# File → Open → select the project folder

# 4. Run the application
# Right-click Application.java → Run

# 5. Test the API
# Open browser or Postman → http://localhost:8080
```

> For database projects (Stage 2+), configure MySQL credentials in `application.properties` before running.

<br>

## 📡 API Testing

All REST APIs in this repository are tested using **Postman**. Each project folder contains a `postman-collection.json` file (added as projects are completed) that you can import directly into Postman.

For quick testing without Postman, use the browser for GET requests:
```
http://localhost:8080/hello
http://localhost:8080/students
```

<br>

## 📈 Learning Progress

| Stage | Topics | Target |
|-------|--------|--------|
| Stage 1 | REST API Basics | July 2026 |
| Stage 2 | JPA + MySQL | August 2026 |
| Stage 3 | Security + JWT | September 2026 |
| Stage 4 | Advanced Features | October 2026 |
| SmartSpend | Full Stack Project | November 2026 |

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
| [java-mini-projects](https://github.com/Aartigore14/java-mini-projects) | Core Java → OOP → Collections → Intermediate projects |
| [smart-parking-system](https://github.com/Aartigore14/smart-parking-system) | Frontend web project — HTML, CSS, JavaScript |

<br>

---

<p align="center">
  <i>Learning Spring Boot one project at a time. 🚀</i><br>
  <i>⭐ Star this repo if you find it useful!</i>
</p>
