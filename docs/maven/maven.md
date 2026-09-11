mvn compile          # compile sources only
mvn test             # compile + run tests
mvn package          # compile + test + build the JAR into target/
mvn clean package    # wipe target/ first, then build the JAR (most common)
mvn clean install    # same, plus install the JAR into your local ~/.m2 repo

| Scope               | Compile | Test | Runtime | Packaged                                     |
|---------------------|---------|------|---------|----------------------------------------------|
| `compile` (default) | ✅      | ✅   | ✅      | ✅                                           |
| `provided`          | ✅      | ✅   | ❌      | ❌ (e.g. servlet-api, supplied by container) |
| `runtime`           | ❌      | ✅   | ✅      | ✅ (e.g. JDBC driver)                        |
| `test`              | ❌      | ✅   | ❌      | ❌ (e.g. JUnit)                              |