FROM adoptopenjdk/openjdk11:latest
MAINTAINER Pranav Amin <pranav.g.amin@gmail.com>

ADD ./target/ratings-data-service-0.0.1-SNAPSHOT.jar /app/ratings-data-service.jar
CMD ["java", "-Xmx200m", "-jar", "/app/ratings-data-service.jar"]

EXPOSE 8080