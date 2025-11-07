# Apache Felix Runtime

This folder contains all runtime dependencies and generated bundles used to start the OSGi framework.

The contents of this folder **should not be committed to Git**.  
It’s automatically managed by Gradle tasks such as `deployToFelix` and `runFelixDetached`.

---

## ⚙️ Setup Instructions

### 1️⃣ Download Apache Felix Framework
Download the latest stable Felix framework (for example, version 7.0.5) from the official site:

👉 [https://felix.apache.org/documentation/downloads.html](https://felix.apache.org/documentation/downloads.html)

Direct binary link:

https://dlcdn.apache.org/felix/org.apache.felix.main.distribution-7.0.5.zip

Then extract the archive into:

runtime/felix/

After extraction, the structure should look like:

```
runtime/
└── felix/
├── bin/
│   └── felix.jar
├── bundle/
├── conf/
└── doc/
```
---

### 2️⃣ Build and Deploy Bundles
From the project root, run:
```bash
./gradlew deployToFelix
```

This will:
•	Clear the Felix cache
•	Build all OSGi subprojects (core.api, core.impl, ui.console)
•	Copy their JARs into runtime/app/

### 3️⃣ Run Felix

Run manually:
```bash
java -jar runtime/felix/bin/felix.jar
```

Or use Gradle:
```bash
./gradlew runFelixDetached
```

To stop Felix:

```bash
./gradlew stopFelix
```

To watch logs:

```bash
tail -f runtime/felix/felix.log
```

### 4️⃣ Expected Output

When running Felix, you should see:

```
Welcome to Apache Felix Gogo
____________________________
g! greet:hello Alex
Hello, Alex! Greetings from OSGi!
```

