# Security Policy

## Reporting a Vulnerability

Please **do not open a public issue** for security vulnerabilities. Instead, email **contribution@nubons.com** with:
- A description of the issue and its potential impact.
- Step-by-step reproduction instructions or proof-of-concept.
- Affected versions and configurations.

We aim to acknowledge receipt within 5 business days and coordinate a responsible disclosure and patching timeline.

## Zero Secrets Policy

This repository must **never contain secrets, API tokens, passwords, private keys, `.env` files, or deployment credentials**. All configuration and runtime secrets must be supplied at deployment via environment variables or secret management vaults.
