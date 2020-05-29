FROM java:8-alpine
VOLUME /tmp
EXPOSE 8080
ADD /target/ftpStarbeatArchive-0.0.1-SNAPSHOT.jar ftpStarbeatArchive-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-Dspring.data.mongodb.uri=mongodb://mongo/log", "-jar",  "ftpStarbeatArchive-0.0.1-SNAPSHOT.jar"]	