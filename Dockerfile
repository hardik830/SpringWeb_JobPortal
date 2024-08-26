# Stage 1: Build the Maven project
FROM maven AS builder

# Set the working directory
WORKDIR /app

# Copy the pom.xml and source code
COPY pom.xml .
COPY src ./src

# Download dependencies and build the application
RUN mvn clean package -DskipTests

# Stage 2: Create the final image
FROM openjdk:21

# Set the working directory
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=builder /app/target/JobPortalSpring-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port on which the application will run
EXPOSE 8080

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
