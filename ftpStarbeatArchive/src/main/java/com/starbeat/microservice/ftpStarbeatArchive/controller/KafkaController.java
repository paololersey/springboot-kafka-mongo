package com.starbeat.microservice.ftpStarbeatArchive.controller;

import java.util.concurrent.CountDownLatch;

import com.starbeat.microservice.ftpStarbeatArchive.kafka.producer.MessageProducer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

	private final MessageProducer producer;
	private final CountDownLatch latch = new CountDownLatch(3);
	
	@Autowired
	KafkaController(MessageProducer producer) {
		this.producer = producer;
	}

	/*
	 * @PostMapping(value = "/publish") public void
	 * sendMessageToKafkaTopic(@RequestParam("message") String message) {
	 * this.producer.sendMessage(message); }
	 */
	@GetMapping(value = "/send")
	public void sendMessageToKafkaTopic() throws InterruptedException {
		String message = "Welcome";
		this.producer.sendMessage(message);
	}

	@KafkaListener(topics = "channelA")
    public void listen(ConsumerRecord<?, ?> cr) throws Exception {
        System.out.println(cr.toString());
        latch.countDown();
    }
}