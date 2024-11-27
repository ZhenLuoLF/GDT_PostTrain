FROM openjdk:17
LABEL authors="zhenluo"
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/product-catalog-service-0.0.1-SNAPSHOT.jar product-catalog-service.jar
EXPOSE 8081
ENTRYPOINT exec java $JAVA_OPTS -jar product-catalog-service.jar