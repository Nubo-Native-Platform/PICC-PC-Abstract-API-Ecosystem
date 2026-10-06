# Development Guidelines and Engineering Standards

This document defines the architectural principles, engineering standards, data modeling rules, and contribution workflows for maintaining and extending `abstract-api-ecosystem` within the Nubo Native Platform (NNP).

---

## Table of Contents

1. [Architecture and Design Principles](#1-architecture-and-design-principles)
2. [Technology Baseline and Compatibility](#2-technology-baseline-and-compatibility)
3. [Domain Modeling and Data Contracts](#3-domain-modeling-and-data-contracts)
   - [JPA Entities](#jpa-entities)
   - [Transfer Objects (TOs) & DTOs](#transfer-objects-tos--dtos)
   - [Entity-to-DTO Transformation](#entity-to-dto-transformation)
4. [Distributed Redis Caching Architecture](#4-distributed-redis-caching-architecture)
   - [Connection Factory Agnosticism](#connection-factory-agnosticism)
   - [Cache Repository Pattern](#cache-repository-pattern)
5. [Code Quality and Formatting Standards](#5-code-quality-and-formatting-standards)
6. [Git Workflow and Branching Strategy](#6-git-workflow-and-branching-strategy)
7. [Pull Request (PR) Checklist](#7-pull-request-pr-checklist)
8. [Release Lifecycle and Versioning](#8-release-lifecycle-and-versioning)

---

## 1. Architecture and Design Principles

`abstract-api-ecosystem` provides the core shared abstraction layer for all API Ecosystem services across NNP, including:
- **API Gateway Service** (`api-gateway-service`)
- **Reactive API Gateway** (`api-gateway`)
- **API Analytics Engine** (`api-analytics-service`)
- **Provider Adapters & Mock Services** (`ms-mock-api-esim`, `ms-mock-provider-eric-cbio`, etc.)

Key architectural rules:
1. **Zero Downstream Intrusion**: Provide lean, shared domain models and contracts without forcing unnecessary runtime dependencies or heavyweight server starters onto downstream consumers.
2. **Backwards Compatibility**: DTO and entity schema modifications must preserve field serialization compatibility.
3. **Connector Flexibility**: Abstract caching and persistence components must allow child services to choose connection implementations (e.g. Jedis vs Lettuce) without breaking.
4. **Zero Hardcoded Secrets**: Hostnames, ports, credentials, and API tokens must never be hardcoded in classes or configuration files.

---

## 2. Technology Baseline and Compatibility

| Component | Target Version | Description / Purpose |
| :--- | :--- | :--- |
| **Java JDK** | `21` (LTS) | Baseline runtime target (Records, Virtual Threads, Pattern Matching) |
| **Parent Platform** | `abstract-nnp` `1.0.0` | Enterprise parent POM and BOM dependency governance |
| **Spring Boot** | `3.5.4` | Application framework standard |
| **Jakarta EE** | `10` | Standard namespace (`jakarta.persistence.*`, `jakarta.validation.*`) |
| **Redis Client** | Jedis / Lettuce | Redis caching and HashOperations repository abstraction |
| **ModelMapper** | `3.2.4` | Flexible object transformation |
| **Build Tool** | Maven `3.9.9` | Enforced minimum Maven version via Maven Enforcer Plugin |

---

## 3. Domain Modeling and Data Contracts

### JPA Entities
- Located in `com.nubons.nnp.sso.abs.entity.*`.
- Must extend `AbstractBaseEntity` and implement `java.io.Serializable`.
- Use Jakarta Persistence annotations: `@Entity`, `@Table`, `@Id`, `@Column`.
- Use Lombok annotations: `@Getter`, `@Setter`, `@ToString`.
- Provide a default no-args constructor.

### Transfer Objects (TOs) & DTOs
- Located in `com.nubons.nnp.sso.abs.to.*`.
- Must extend `AbstractBaseTO` and implement `java.io.Serializable`.
- Annotate validation constraints using Jakarta Validation (`@NotBlank`, `@NotNull`, etc.).
- When using Lombok `@Data` on classes extending `AbstractBaseTO`, explicitly annotate `@EqualsAndHashCode(callSuper = false)` to prevent compiler warnings.

### Entity-to-DTO Transformation
Each Transfer Object should provide static convenience methods:
```java
public static ExampleTO fromEntity(Example ent);
public static Example toEntity(ExampleTO to);
public static void copyToEntity(ExampleTO to, Example ent);
```
Alternatively, child services can inject `ModelMapper` (configured via `MapperConfig`).

---

## 4. Distributed Redis Caching Architecture

### Connection Factory Agnosticism
`AbstractRedisRepo<K, V>` is wired to the standard `org.springframework.data.redis.connection.RedisConnectionFactory` interface, allowing either Jedis or Lettuce connection factories to be provided by child microservices.

### Cache Repository Pattern
To create a custom caching repository:
```java
@Repository
public class OrderRedisRepo extends AbstractRedisRepo<String, OrderTO> {
    public void save(OrderTO order) {
        repo().put("NNP.API-ECO.ORDERS", order.getId(), order);
    }

    public OrderTO get(String id) {
        return repo().get("NNP.API-ECO.ORDERS", id);
    }
}
```

---

## 5. Code Quality and Formatting Standards

- **Java Style**: Standard 4-space indentation, clear camelCase naming conventions.
- **Documentation**: Provide Javadoc for public API methods and entity constants.
- **Testing**: Maintain unit tests covering utility classes, mappings, and serialization under `src/test/java/`.

---

## 6. Git Workflow and Branching Strategy

- **Main Branch**: `main` contains production-ready code.
- **Development Branch**: `develop` contains integrated changes for upcoming releases.
- **Branch Naming**:
  - `feature/add-route-metadata`
  - `fix/redis-connection-timeout`
  - `docs/update-user-manual`
- **Commit Messages**: Follow Conventional Commits:
  - `feat: add rate-limiting metadata TO`
  - `fix: resolve NPE in UUIDGenerator`
  - `docs: update deployment instructions`

---

## 7. Pull Request (PR) Checklist

Before submitting a PR:
- [ ] Run `./mvnw clean test` locally to ensure all tests pass.
- [ ] Confirm no secrets, tokens, or local credentials are included.
- [ ] Ensure any newly added public models have unit test coverage.
- [ ] Check backwards compatibility for existing serialized objects.

---

## 8. Release Lifecycle and Versioning

This project adheres to **Semantic Versioning 2.0.0** (`MAJOR.MINOR.PATCH`):
- **MAJOR**: Incompatible contract or entity changes.
- **MINOR**: Backwards-compatible additions of DTOs, entities, or features.
- **PATCH**: Backwards-compatible bug fixes.

Releases are published automatically via GitHub Actions when a version tag (`v1.0.0`) is pushed to GitHub.
