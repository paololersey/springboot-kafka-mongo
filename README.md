# How to download and run Kafka image
docker-compose up 

# Start an interactive terminal with the Kafka container. List the containers as
docker ps
#to retrieve the kafka container’s name. For example, in this case our container is named apache-kafka_kafka_1. Go inside
docker exec -it apache-kafka_kafka_1 bash

# To create a new topic named test -> bash-4.4# 
kafka-topics.sh --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic test
 
# To start a producer that publishes datastream from standard input to kafka, and type a message to the console -> bash-4.4
kafka-console-producer.sh --broker-list localhost:9092 --topic test

# To listen as a consumer 
kafka-console-consumer.sh --bootstrap-server kafka:9092 --topic meter


