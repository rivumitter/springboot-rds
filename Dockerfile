FROM openjdk:8
EXPOSE 5000
ARG JAR_FILE=target/spring-boot-rds.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
