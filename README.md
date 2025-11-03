# Ankit's Kotlin Class

Welcome to the Kotlin learning repository! This project contains examples and exercises for learning Kotlin programming language.

## 📚 Contents

This repository includes examples covering:

1. **Basic Concepts** (`Main.kt`)
   - Variables and Data Types
   - Functions
   - Classes and Objects

2. **Collections** (`CollectionsExample.kt`)
   - Lists, Sets, and Maps
   - Collection operations (filter, map, reduce)

3. **Null Safety** (`NullSafetyExample.kt`)
   - Nullable types
   - Safe call operator
   - Elvis operator
   - Let function

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Kotlin (included in the project via Gradle)

### Running the Examples

1. Clone this repository:
   ```bash
   git clone https://github.com/khambya19/ankit-kotlin-.git
   cd ankit-kotlin-
   ```

2. Run the main example:
   ```bash
   ./gradlew run
   ```

3. Run specific examples:
   ```bash
   # Collections example
   ./gradlew run --args="CollectionsExample"
   
   # Null safety example
   ./gradlew run --args="NullSafetyExample"
   ```

### Building the Project

To build the project:
```bash
./gradlew build
```

### Running Tests

To run tests:
```bash
./gradlew test
```

## 📖 Learning Path

1. Start with `Main.kt` to understand basic Kotlin syntax
2. Explore `CollectionsExample.kt` to learn about data structures
3. Study `NullSafetyExample.kt` to understand Kotlin's null safety features

## 🛠️ IDE Setup

### IntelliJ IDEA
1. Open the project folder
2. IntelliJ will automatically detect the Gradle project
3. Wait for Gradle sync to complete

### VS Code
1. Install the Kotlin extension
2. Open the project folder
3. Use the integrated terminal to run Gradle commands

## 📝 Project Structure

```
ankit-kotlin-/
├── src/
│   ├── main/
│   │   └── kotlin/
│   │       └── com/
│   │           └── ankit/
│   │               └── kotlin/
│   │                   ├── Main.kt
│   │                   ├── CollectionsExample.kt
│   │                   └── NullSafetyExample.kt
│   └── test/
│       └── kotlin/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## 📚 Resources

- [Kotlin Official Documentation](https://kotlinlang.org/docs/home.html)
- [Kotlin Koans](https://play.kotlinlang.org/koans)
- [Kotlin Style Guide](https://kotlinlang.org/docs/coding-conventions.html)

## 🤝 Contributing

Feel free to add more examples or improve existing ones!

## 📄 License

This project is for educational purposes.