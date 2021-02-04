FROM java:8
VOLUME /tmp
EXPOSE 8080
ADD target/spring-boot-db-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
RUN sh -c 'touch /app.jar'
