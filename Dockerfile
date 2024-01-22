# Use an official OpenJDK runtime as a base image
FROM openjdk:17-jdk-slim
EXPOSE 8082
# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/apitgatw-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that your Spring Boot application is running on


# Command to run your application
CMD ["java", "-jar", "app.jar"]
