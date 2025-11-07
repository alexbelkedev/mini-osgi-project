# 🧩 Mini OSGi Project

This is a minimal, Gradle-based **OSGi project** designed to demonstrate modular development with:
- Apache Felix framework as the runtime
- Declarative Services (SCR) for dependency injection
- Gogo shell for command interaction
- Automatic Gradle tasks for build and deployment

---

## 📦 Project Structure

```
mini-osgi-project/
 ├── core.api/        → Public API interfaces (e.g. GreetingService)
 ├── core.impl/       → Implementations of core services
 ├── ui.console/      → Gogo shell commands and console UI
 ├── runtime/         → External Felix runtime (excluded from Git)
 │    ├── felix/      → Felix framework (downloaded manually)
 │    └── app/        → Bundles deployed automatically by Gradle
 ├── build.gradle     → Root Gradle configuration
 ├── gradle.properties
 ├── settings.gradle
 └── README.md        → This file
```

---

## 🧱 Requirements

- **Java 17+**  
- **Gradle 8+**
- Internet access (for downloading dependencies)
- Apache Felix framework (see below)

---

## ⚙️ Setup Instructions

### 1️⃣ Download Apache Felix

Download the latest **Felix Framework** (e.g. version 7.0.5) from the official site:

👉 [https://felix.apache.org/documentation/downloads.html](https://felix.apache.org/documentation/downloads.html)

Direct link:
```
https://dlcdn.apache.org/felix/org.apache.felix.main.distribution-7.0.5.zip
```

Extract it to:
```
runtime/felix/
```

After extraction, ensure this path exists:
```
runtime/felix/bin/felix.jar
```

---

### 2️⃣ Build and Deploy Bundles

Run:
```bash
./gradlew deployToFelix
```

This will:
- Build all submodules (`core.api`, `core.impl`, `ui.console`)
- Remove old JARs
- Copy the new ones into `runtime/app/`
- Clear the Felix runtime cache

---

### 3️⃣ Run Apache Felix

You can start Felix manually:
```bash
java -jar runtime/felix/bin/felix.jar
```

Or use Gradle to start it in the background:
```bash
./gradlew runFelixDetached
```

Stop it anytime with:
```bash
./gradlew stopFelix
```

---

### 4️⃣ Try It Out

Inside the Felix console:
```bash
g! greet:hello Alex
Hello, Alex! Greetings from OSGi!
```

To list all active components:
```bash
scr:list
```

---

## 🔄 Helpful Gradle Tasks

| Task | Description |
|------|--------------|
| `clean` | Clean all build outputs |
| `deployToFelix` | Build and copy bundles into `runtime/app` |
| `runFelixDetached` | Launch Felix in background (logs to `runtime/felix/felix.log`) |
| `stopFelix` | Stop running Felix instances |
| `clearFelixCache` | Clear OSGi runtime cache |

---

## 🧹 Git Guidelines

The `runtime/` folder is ignored by Git (except `runtime/README.md`).  
It’s safe to delete or recreate anytime — Gradle will rebuild the bundles automatically.

---

### 🧠 Author Notes

This project is intentionally small and modular — it can serve as:
- A learning base for OSGi development
- A template for building microservice-like modular Java systems
- A reference for integrating Gradle and Felix smoothly

---

> 🧰 “Build small, modular, and composable — that’s the OSGi way.”
