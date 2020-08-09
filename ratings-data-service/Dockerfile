FROM java:8-jre
MAINTAINER Pranav Amin <pranav.g.amin@gmail.com>

ADD ./target/movie-catalog-service-0.0.1-SNAPSHOT.jar /app/movie-catalog-service.jar
CMD ["java", "-Xmx200m", "-jar", "/app/movie-catalog-service.jar"]

EXPOSE 8080