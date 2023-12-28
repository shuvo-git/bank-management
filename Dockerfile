FROM openjdk:17-alpine
ARG JAR_FILE=account-service/build/libs/account-service.jar
COPY $JAR_FILE account-service.jar
ENTRYPOINT ["java", "-jar", "account-service.jar"]