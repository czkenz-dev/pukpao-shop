FROM openjdk:8-jdk-alpine
WORKDIR app
ARG JAR_FILE=target/shop-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /app/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
