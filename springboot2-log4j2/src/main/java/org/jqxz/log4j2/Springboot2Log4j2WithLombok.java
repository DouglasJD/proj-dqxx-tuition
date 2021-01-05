package org.jqxz.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Springboot2Log4j2WithLombok {
	static Logger logger =  LogManager.getLogger("weather");

	public static void main(String[] args) {
		logger.info("Sping Boot 2 Log4j2 example with lombok");
		SpringApplication.run(Springboot2Log4j2WithLombok.class, args);
	}

}
