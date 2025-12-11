# -----------------------------
# Build Stage
# -----------------------------
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app

# Copy pom and download dependencies first (layer caching)
COPY pom.xml .
RUN mvn -q dependency:go-offline

# Copy source code
COPY src ./src

# Build the application
RUN mvn -q clean package -DskipTests


# -----------------------------
# Runtime Stage
# -----------------------------
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy jar from the build stage
COPY --from=build /app/target/spring-boot-library-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run app
ENTRYPOINT ["java", "-jar", "app.jar"]
