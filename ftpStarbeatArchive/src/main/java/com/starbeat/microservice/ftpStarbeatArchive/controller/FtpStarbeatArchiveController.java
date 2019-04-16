package com.starbeat.microservice.ftpStarbeatArchive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FtpStarbeatArchiveController {

	@GetMapping("/welcome")
	public String helloMicroservice() {
	    return "This is the first microservice";
	}

}
