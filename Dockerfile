from openjdk:8
EXPOSE 5000
ARG JAR_FILE=target/spring-boot-rds.jar
WORKDIR /opt/app
ENDPOINT ["java","-jar","app.jar"]