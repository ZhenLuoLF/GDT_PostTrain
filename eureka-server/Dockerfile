FROM openjdk:17
LABEL authors="zhenluo"
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/eureka-server-0.0.1-SNAPSHOT.jar eureka-service.jar
EXPOSE 8761
ENTRYPOINT exec java $JAVA_OPTS -jar eureka-service.jar