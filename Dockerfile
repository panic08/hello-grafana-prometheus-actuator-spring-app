FROM gradle:jdk17

WORKDIR /app

COPY . /app

RUN gradle build

CMD ["java", "-jar", "/app/build/libs/spring-hello-world-actuator-app-0.0.1-SNAPSHOT.jar"]