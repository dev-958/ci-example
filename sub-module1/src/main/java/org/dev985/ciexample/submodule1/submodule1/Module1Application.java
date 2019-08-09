package org.dev985.ciexample.submodule1.submodule1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1Application {

	private static final Logger log = LoggerFactory.getLogger(Module1Application.class);

	public Module1Application() {
		log.info("Started service Module1");
	}

	public static void main(String[] args) {
		SpringApplication.run(Module1Application.class, args);
	}

}
