package com.starbeat.microservice.ftpStarbeatArchive.kafka.producer;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MessageProducer.class);
    
    
    @Autowired
    private Environment env;  

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
    	final String TOPIC = env.getProperty("PRODUCER_TOPIC");
    	logger.info(String.format("#### -> Producer topic -> %s", TOPIC));
        logger.info(String.format("#### -> Producing message -> %s", message));
        this.kafkaTemplate.send(TOPIC, message);
    }
}