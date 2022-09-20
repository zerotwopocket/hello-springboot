FROM eclipse-temurin:11
RUN mkdir /opt/app
COPY target/hello-springboot-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/hello-springboot-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080/tcp