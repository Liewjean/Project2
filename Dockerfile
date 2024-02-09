FROM openjdk:17-jdk

COPY build/libs/springboot-second-app-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java","-jar","springboot-second-app-0.0.1-SNAPSHOT.jar"]