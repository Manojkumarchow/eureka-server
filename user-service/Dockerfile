FROM openjdk:17-jdk-slim

# Set the maintainer label (optional)
LABEL maintainer="manojchow72@gmail.com"

WORKDIR /app

COPY build/libs/*.jar user-service.jar

EXPOSE 8086

ENTRYPOINT ["java", "-jar", "user-service.jar"]
