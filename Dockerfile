FROM eclipse-temurin:11
RUN mkdir /app
WORkDIR /app
COPY target/demo-0.0.1-SNAPSHOT.jar /app/welcome.jar
EXPOSE 8080
CMD java -jar welcome.jar