# how to build java code
mvn clean package -DskipTests

#how to run spring boot application
java -jar target/ftpStarbeatArchive-0.0.1-SNAPSHOT.jar	

#how to build docker image
docker build -t ftp-starbeat-archive:1.0 .

#how to run a docker container
docker run ftp-starbeat-archive:1.0 -p 8080:8080