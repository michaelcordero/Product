# 🛠️ Product Management API

This is a full-stack skeleton project for listing and creating products. The backend is a Spring Boot application connected to a PostgreSQL database, managed with Docker Compose.

---

## 🚀 Getting Started

### 🔧 Prerequisites

Make sure you have the following installed:

- [Docker Desktop](https://www.docker.com/products/docker-desktop/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (for optional IDE integration)
- Java 21 (Temurin recommended)
- Gradle (or use the included `./gradlew`)

---

## ▶️ Running from the Command Line

From the root of the project, run:

```bash
docker compose up --build

## ▶️ Running from IntelliJ Idea

1. Edit Run Configurations
  - Add Docker Compose -> ./docker-compose.yml
  - Before Launch -> Add Gradle Task dockerRebuild
2. To add Debug capability
  - Create another run configuration
  - Remote JVM configuration
  - Just change name. Defaults are fine.

