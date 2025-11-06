# Mini OSGi Project

This is a minimal modular OSGi project built with **Gradle** and **bnd** to learn and experiment with OSGi concepts such as modularization, service registration, and dynamic dependency management.

---

## 🚀 Project Overview

The project consists of three modules:

| Module | Description |
|--------|--------------|
| **core.api** | Defines the public API and OSGi service interfaces. |
| **core.impl** | Implements the `core.api` services and registers them as OSGi components. |
| **ui.console** | Provides a simple command-line interface (CLI) to interact with the OSGi services. |

---

## 🛠 Tech Stack

- **Java 21**
- **Gradle 9.2.0**
- **bnd (OSGi build tool)**
- **Apache Felix (runtime framework)** — planned for later testing
- **IntelliJ IDEA** (recommended IDE)

---

## 📂 Project Structure

```
mini-osgi-project/
├── core.api/           # API definitions (interfaces)
│   └── src/main/java/
├── core.impl/          # Implementations (@Component classes)
│   └── src/main/java/
├── ui.console/         # Simple CLI bundle (later)
│   └── src/main/java/
├── gradle/             # Gradle wrapper
├── gradle.properties   # Shared Gradle configuration
├── settings.gradle     # Module definitions
├── build.gradle        # Root Gradle file
└── .gitignore
```

---

## ⚙️ Build Instructions

### 1️⃣ Clean and build all modules
```bash
./gradlew clean build
```

## Build a specific module

```bash
./grandlew :core.imple:build
```

### Verify build success
The compiled JARs will appear under each module:

- core.api/build/libs/
- core.impl/build/libs/

## 🧠 Learning Goals

- Understand how OSGi bundles interact through service interfaces.
- Learn how to use bnd annotations (@Component, @Reference, etc.).
- Build modular, maintainable Java code following Clean Architecture principles.
- Prepare for OpenEMS contribution or similar enterprise-level OSGi platforms.

## 🧰 Useful Gradle Commands

| Command | Description |
|--------|--------------|
| ./gradlew tasks | Lists all available Gradle tasks. |
| ./gradlew dependencies | Shows project dependencies. |
| ./gradlew build --scan |Builds with detailed diagnostics. |

## 👨‍💻 Author
Alex Belke

Java / Kotlin Developer • Passionate about clean architecture and modular design

📍 Germany 🇩🇪

## 🪶 License

This project is for educational and learning purposes only.

No production use or redistribution intended.
