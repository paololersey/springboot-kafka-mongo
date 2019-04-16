package com.starbeat.microservice.ftpStarbeatArchive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.starbeat.microservice.ftpStarbeatArchive"})
@SpringBootApplication
public class FtpStarbeatArchiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(FtpStarbeatArchiveApplication.class, args);
	}

}
