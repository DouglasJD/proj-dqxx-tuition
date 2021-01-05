package org.jqxz.log4j2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j2;



@SpringBootApplication
@Log4j2
public class Springboot2Log4j2WOLombok {
	public static void main(String[] args) {
		log.info("Sping Boot 2 Log4j2 example with lombok");
		SpringApplication.run(Springboot2Log4j2WOLombok.class, args);
	}

}
