# Contributing to PICC-PC-Abstract-API-Ecosystem

This repository — **PICC-PC-Abstract-API-Ecosystem** (`abstract-api-ecosystem`) — is part of the **Platform Infrastructure and Core Components (PICC)** layer of the Nubo Native Platform (NNP). Contributions are welcome under the **Apache 2.0 License**.

## Getting Started

1. Check open **Issues** or discuss prospective features/fixes by reaching out to **contribution@nubons.com**.
2. Review our [Development Guidelines](DEVELOPMENT_GUIDELINES.md) and [Code of Conduct](CODE_OF_CONDUCT.md).

## Contribution Workflow

1. **Fork & Clone**: Fork the repository on GitHub and clone your fork locally.
2. **Branching**: Create a feature or bugfix branch (`feature/description` or `fix/description`).
3. **Coding Standards**:
   - Align with Java 21 LTS and Spring Boot 3.5.x standards.
   - Use Jakarta EE 10 annotations (`jakarta.persistence.*`, `jakarta.validation.*`).
   - Maintain backwards compatibility for shared entities and Transfer Objects (TOs).
4. **Testing**: Run local tests with `./mvnw clean test` to ensure all existing and new unit tests pass.
5. **Pull Request**: Open a pull request against `main` with a clear explanation of changes.

## Security Notice

**Never commit credentials, tokens, secret keys, or `.env` files.** Refer to [SECURITY.md](SECURITY.md) for vulnerability reporting.
