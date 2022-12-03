FROM openjdk:17-jdk-alpine
WORKDIR /web

ARG APP_NAME="web"
ARG APP_VERSION="0.0.1-SNAPSHOT"
ARG JAR_FILE="/build/libs/${APP_NAME}-${APP_VERSION}.jar"

COPY ${JAR_FILE} web.jar

ENTRYPOINT ["java","-jar", "web.jar"]   
