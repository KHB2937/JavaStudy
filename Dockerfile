# Base image
FROM openjdk:11-jre-slim

# Working directory
WORKDIR /app

# Copy Maven wrapper files
COPY mvnw .
COPY .mvn .mvn

# Copy pom.xml file
COPY pom.xml .

# Download dependencies
RUN ./mvnw dependency:go-offline

# Copy application code
COPY src src

# Build application
RUN ./mvnw clean package

# Copy executable JAR file
COPY target/*.jar app.jar

# Expose port
EXPOSE 8080

# Run application
CMD ["java", "-jar", "app.jar"]