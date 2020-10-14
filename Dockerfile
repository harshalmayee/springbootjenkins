FROM openjdk:8
ADD target/spring-jenkins-docker.jar spring-jenkins-docker.jar
EXPOSE 8080
ENTRYPOINT ["java" ,"-jar" ,"spring-jenkins-docker.jar"]