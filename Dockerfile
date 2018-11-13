FROM openjdk:8-alpine
VOLUME /tmp
ADD target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT exec java -jar /app.jar