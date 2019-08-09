package org.dev985.ciexample.submodule2;

import org.dev985.ciexample.submodule1.submodule1.Module1Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module2Application {

    private static final Logger log = LoggerFactory.getLogger(Module1Application.class);

    public Module2Application() {
        log.info("Started service Module2");
    }

    public static void main(String[] args) {
        SpringApplication.run(Module2Application.class, args);
    }

}
