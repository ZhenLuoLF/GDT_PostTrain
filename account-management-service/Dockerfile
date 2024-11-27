FROM openjdk:17
LABEL authors="zhenluo"

VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/account-management-service-0.0.1-SNAPSHOT.jar account-management-service.jar
EXPOSE 8082
ENTRYPOINT exec java $JAVA_OPTS -jar account-management-service.jar