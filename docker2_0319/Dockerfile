FROM openjdk:17-alpine

ARG JAR_FILE=/build/libs/docker2_0319-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} /doc_0319v2.jar

ENTRYPOINT [ "java","-jar","/doc_0319v2.jar"]