# Caesar Cipher JavaFX Application

A **Java-based Caesar Cipher application** with a graphical user interface built using **JavaFX**.

This project was developed to explore the fundamentals of classical cryptography while gaining experience with Java, JavaFX, FXML, Maven, and event-driven application development.

> **Educational Project:** The Caesar Cipher is a classical encryption technique and is not considered secure for protecting modern sensitive information.

## Features

* Encode messages using a Caesar Cipher
* Decode messages using a Caesar Cipher
* Customisable shift value
* Default shift value of `3`
* Preserves uppercase and lowercase characters
* Leaves spaces, numbers, punctuation, and other non-letter characters unchanged
* JavaFX graphical user interface
* Separate input and output areas
* Exit button for closing the application

## How It Works

The Caesar Cipher shifts each letter in the alphabet by a specified number of positions.

For example, using a shift of `3`:

```text
Original:  HELLO
Encoded:   KHOOR
```

Decoding reverses the shift:

```text
Encoded:   KHOOR
Decoded:   HELLO
```

The application uses modular arithmetic to ensure that characters wrap around the alphabet when the end or beginning is reached.

For example:

```text
Z + 3 = C
```

## Application Interface

The JavaFX interface contains:

* **Input** — Text to encode or decode
* **Output** — Resulting encoded or decoded text
* **Shift Value** — Custom shift amount
* **Encode** — Applies the Caesar Cipher shift
* **Decode** — Reverses the shift
* **Exit** — Closes the application

The interface is defined using **FXML** and styled using a dedicated CSS file.

## Technologies

* **Java 17**
* **JavaFX 17**
* **FXML**
* **CSS**
* **Maven**
* **JUnit 5**

The project uses Maven to manage JavaFX dependencies and build configuration.

## Project Structure

```text
Caesar/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/caesar/
│       │       ├── CaesarCipherApp.java
│       │       ├── CaesarCipherController.java
│       │       └── Launcher.java
│       │
│       └── resources/
│           └── com/example/caesar/
│               ├── caesar_cipher_app.fxml
│               └── CipherApp.css
│
├── pom.xml
├── mvnw
└── mvnw.cmd
```

The application separates the JavaFX application startup, controller logic, and FXML user interface.

## Cipher Implementation

The encoding process:

1. Reads the input text.
2. Retrieves the selected shift value.
3. Checks each character.
4. Determines whether the character is uppercase or lowercase.
5. Applies the shift using modulo `26`.
6. Leaves non-alphabetic characters unchanged.
7. Displays the resulting text.

Decoding performs the same process in reverse.

If the shift field is empty or contains an invalid number, the application falls back to a shift value of `3`.

## Building & Running

### Requirements

* Java 17 or later
* Maven

The project includes Maven Wrapper scripts, allowing Maven commands to be run without requiring a separate Maven installation.

### Using Maven

On Windows:

```bash
mvnw.cmd clean javafx:run
```

On Linux/macOS:

```bash
./mvnw clean javafx:run
```

Alternatively, if Maven is installed:

```bash
mvn clean javafx:run
```

## Security Considerations

The Caesar Cipher is useful for demonstrating fundamental cryptographic concepts, but it is **not a secure encryption method**.

Its small key space and predictable substitution make it vulnerable to:

* Brute-force attacks
* Frequency analysis
* Known-plaintext attacks
* Statistical analysis

It should therefore **not be used to protect passwords, personal information, credentials, or other sensitive data**.

For real-world applications, modern cryptographic algorithms and established security libraries should be used instead.

## Learning Objectives

This project was developed to explore:

* Classical cryptography concepts
* Substitution ciphers
* Modular arithmetic
* Java programming
* Object-oriented application structure
* JavaFX GUI development
* FXML-based interfaces
* Event-driven programming
* Maven dependency and build management
* Input validation and error handling

## Future Improvements

Potential improvements include:

* Add a brute-force mode to demonstrate Caesar Cipher weaknesses
* Add frequency-analysis functionality
* Add automated unit tests for cipher operations
* Support additional character sets
* Improve the graphical interface
* Add configurable encryption/decryption history
* Provide packaged releases for different operating systems

## Disclaimer

This project is intended for **educational purposes** and demonstrates a classical cryptographic technique.

The Caesar Cipher should not be considered suitable for modern secure communication or protection of sensitive information.
