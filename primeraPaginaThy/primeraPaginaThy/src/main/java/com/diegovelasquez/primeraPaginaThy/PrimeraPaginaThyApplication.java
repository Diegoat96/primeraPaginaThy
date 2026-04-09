package com.diegovelasquez.primeraPaginaThy;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class PrimeraPaginaThyApplication implements CommandLineRunner {


    private static final org.slf4j.Logger log = LoggerFactory.getLogger(PrimeraPaginaThyApplication.class);

    public static void main(String[] args) {
		SpringApplication.run(PrimeraPaginaThyApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        log.info("Todo bien");
    }
}
