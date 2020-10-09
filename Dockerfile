FROM openjdk:8-alpine

WORKDIR /app

ADD target/hello-world-0.0.1-SNAPSHOT.jar ./app.jar

ENTRYPOINT ["java", "-cp", "app.jar" "com.sapient.programs.HelloWorld"]

