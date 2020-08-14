FROM adoptopenjdk/openjdk11:latest
MAINTAINER Pranav Amin <pranav.g.amin@gmail.com>

ADD ./target/zuul-0.0.1-SNAPSHOT.jar /app/zuul.jar
CMD ["java", "-Xmx200m", "-jar", "/app/zuul.jar"]

EXPOSE 8080