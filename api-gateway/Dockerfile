FROM openjdk:17
LABEL authors="zhenluo"
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/api-gateway-0.0.1-SNAPSHOT.jar api-gateway.jar
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -jar api-gateway.jar