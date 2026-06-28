# Contributing to Son Blocks

Thanks for your interest in contributing! This guide will help you get started.

## Prerequisites

- **Java 25** — The mod targets Java 25 as shipped with NeoForge 26.1.2
- **Gradle** — The project includes the Gradle wrapper (`./gradlew`), so no separate Gradle installation is required
- **Git** — For version control

## Building from Source

1. Clone the repository:
   ```bash
   git clone https://github.com/Project516/sonblocks.git
   cd sonblocks
   ```

2. Build the project:
   ```bash
   ./gradlew build
   ```

   The resulting JAR file will be in `build/libs/`.

3. (Optional) Run the client for testing:
   ```bash
   ./gradlew runClient
   ```

4. (Optional) Run the dedicated server for testing:
   ```bash
   ./gradlew runServer
   ```

## Development Setup

### IntelliJ IDEA

1. Open the project root directory in IntelliJ IDEA
2. When prompted, import the Gradle project
3. The `idea` plugin is already configured in `build.gradle` to auto-download sources and Javadoc

### Other IDEs

Import the project as a Gradle project. Make sure your IDE is configured to use JDK 25 for the project SDK.

## How to Contribute

1. **Fork** the repository
2. Create a **feature branch** from `master`:
   ```bash
   git checkout -b my-feature
   ```
3. Make your changes and **commit** with a clear message
4. **Push** your branch to your fork:
   ```bash
   git push origin my-feature
   ```
5. Open a **Pull Request** against the `master` branch

## Code Style

- Follow existing Java conventions used in the project
- Use UTF-8 encoding (configured in `build.gradle`)
- Keep changes focused — one feature or fix per PR

## Data Generation

The mod uses NeoForge's data generation system. To regenerate resources:

```bash
./gradlew runData
```

Generated resources are placed in `src/generated/resources/`.

## Reporting Issues

If you find a bug or have a suggestion, please [open an issue](https://github.com/Project516/sonblocks/issues) with:
- A clear description of the problem or feature request
- Steps to reproduce (for bugs)
- The Minecraft and NeoForge version you're using

## License

By contributing, you agree that your contributions will be licensed under the [AGPL-3.0-or-later](LICENSE) license that covers this project.
