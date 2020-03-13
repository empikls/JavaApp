FROM openjdk:13
ADD target/spring-boot-hello-world-1.0.0.jar spring-boot-hello-world-1.0.0.jar
EXPOSE 9001
ENTRYPOINT ["java", "-jar", "spring-boot-hello-world-1.0.0.jar"]