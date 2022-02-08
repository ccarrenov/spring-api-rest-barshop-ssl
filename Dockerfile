FROM maven:3.8.4-openjdk-11

ENV server.port 443
ENV PORT 443
ENV server.address 0.0.0.0

RUN mkdir spring-api-rest-barshop-ssl

COPY src spring-api-rest-barshop-ssl/src
COPY pom.xml spring-api-rest-barshop-ssl/pom.xml
COPY src/main/resources/docker/application.properties spring-api-rest-barshop-ssl/src/main/resources/application.properties

RUN mvn -f spring-api-rest-barshop-ssl/pom.xml clean package spring-boot:run

EXPOSE 80
EXPOSE 443