FROM openjdk:17-jdk-slim

# Set the maintainer label (optional)
LABEL maintainer="manojchow72@gmail.com"

WORKDIR /app

COPY build/libs/*.jar eureka-proxy.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "eureka-proxy.jar"]
