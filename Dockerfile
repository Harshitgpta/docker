FROM openjdk:11
LABEL maintainer="harshit"
COPY target/user-service-0.0.1-SNAPSHOT.jar /user-service.jar
CMD ["java", "-jar", "/user-service.jar"]