
# Grammar Computing

Grammar Computing is a Java project designed to provide tools and utilities for computational grammar analysis and manipulation. It serves as a foundation for exploring formal grammars, parsing algorithms, and related computational linguistics concepts.

## Features

- Grammar parsing and validation
- Support for custom grammar definitions
- Utilities for grammar transformation and analysis
- Command-line interface for basic operations

## Folder Structure

- `src/` - Java source files
- `lib/` - External dependencies (JARs)
- `bin/` - Compiled class files

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- VS Code with Java extensions (recommended)

### Build and Run

1. **Compile the project:**
   ```pwsh
   javac -d bin -cp "lib/*" src/GrammarComputing.java
   ```
2. **Run the main class:**
   ```pwsh
   java -cp "bin;lib/*" GrammarComputing
   ```

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Usage

After building, you can run the main class to interact with the grammar computing utilities. Example:

```pwsh
java -cp "bin;lib/*" GrammarComputing
```

Refer to the source code for available commands and options.

## Contributing

Contributions are welcome! To contribute:

1. Fork the repository
2. Create a new branch for your feature or bugfix
3. Commit your changes with clear messages
4. Open a pull request describing your changes

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Acknowledgments

- [VS Code Java Extensions](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
- [Java Dependency Management](https://github.com/microsoft/vscode-java-dependency#manage-dependencies)
