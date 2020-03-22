FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 5000
ADD build/libs/*.jar app.jar
ENTRYPOINT ["sh", "-c", "java -jar /app.jar"]