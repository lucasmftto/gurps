FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} gurps-0.0.1-SNAPSHOT.jar

EXPOSE 3000

ENTRYPOINT ["java","-jar","/gurps-0.0.1-SNAPSHOT.jar"]