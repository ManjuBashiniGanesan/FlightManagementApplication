FROM openjdk:8-jdk-alpine
EXPOSE 8080
COPY /build/libs/FlightApplication-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
