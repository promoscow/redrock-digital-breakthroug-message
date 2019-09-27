# back
FROM openjdk:8-jdk-alpine

LABEL maintainer="2262288@gmail.com"
VOLUME /tmp

EXPOSE 8082

ARG JAR_FILE=build/libs/message-sender-0.0.1.jar
ADD ${JAR_FILE} message-sender.jar
ENTRYPOINT ["java","-jar","/message-sender.jar"]
