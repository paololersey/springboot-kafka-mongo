package com.starbeat.microservice.ftpStarbeatArchive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starbeat.microservice.ftpStarbeatArchive.kafka.producer.MessageProducer;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

	private final MessageProducer producer;

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
	public void sendMessageToKafkaTopic() {
		String message = "Welcome";
		this.producer.sendMessage(message);
	}
}