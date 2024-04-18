# base image
FROM eclipse-temurin:22-jre-alpine
# copy application JAR file
WORKDIR /usr/src/app
# copy service JAR file
COPY service/target/service-1.0-SNAPSHOT.jar ./appservice.jar
# copy consumer JAR file
COPY consumer/target/consumer-1.0-SNAPSHOT.jar ./appconsumer.jar
# copy provider JAR file
COPY provider/target/provider-1.0-SNAPSHOT.jar ./appprovider.jar
# run the application
ENTRYPOINT ["java","--module-path","/usr/src/app","--module","org.iths.consumer/org.iths.consumer.Main"]