# how to build java code
mvn clean package -DskipTests

#how to run spring boot application
java -jar target/ftpStarbeatArchive-0.0.1-SNAPSHOT.jar	

#how to build docker image
docker build -t ftp-starbeat-archive:1.0 .

#how to run a docker container
docker run ftp-starbeat-archive:1.0 -p 8080:8080

#Testing components : rest Api
http://<docker-machine ip>:8080/welcome

#Testing components : kafka send a message to prducer and receive to a #consumer
http://<docker-machine ip>:8080/kafka/send

#Testing components : mongo
http://<docker-machine ip>:8080/log
