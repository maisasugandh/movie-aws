FROM openjdk:17-oracle
COPY ./target/spring-movie-0.0.1-SNAPSHOT.jar movie-service.jar
CMD ["java","-jar","movie-service.jar"]