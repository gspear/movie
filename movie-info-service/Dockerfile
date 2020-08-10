FROM adoptopenjdk/openjdk11:latest
MAINTAINER Pranav Amin <pranav.g.amin@gmail.com>

ADD ./target/movie-info-service-0.0.1-SNAPSHOT.jar /app/movie-info-service.jar
CMD ["java", "-Xmx200m", "-jar", "/app/movie-info-service.jar"]

EXPOSE 8080