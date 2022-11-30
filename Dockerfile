FROM openjdk
WORKDIR /app
EXPOSE 8082
ADD target/spring-docker-app.jar spring-docker-app.jar
#ADD target/*.jar spring-boot-docker.jar
ENTRYPOINT ["java","-jar","spring-docker-app.jar"]
