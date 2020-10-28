# Start with a base image containing Java runtime
FROM openjdk:12-jdk-alpine

# Add Maintainer Info
LABEL maintainer="adsoft@live.com.mx"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8098

# The application's jar file
ARG JAR_FILE=target/SpringBootJwtAuthentication-0.0.1.jar

# Add the application's jar to the container
ADD ${JAR_FILE} SpringBootJwtAuthentication-0.0.1.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/SpringBootJwtAuthentication-0.0.1.jar"]

# docker build
# sudo docker build -t <dockerhub-user>/sudo docker build -t <dockerhub-user>/SpringBootJwtAuth . .

# docker run
# sudo docker run --name <linuxuser>-api -p 8xxx:8080 <dockerhub-user>/SpringBootJwtAuth 