package com.tr.dhsloader.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.tr.dhsloader" })
public class FTPTestApp implements CommandLineRunner {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FTPTestApp.class);

	public static void main(String[] args) throws Exception {
		SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder();
		applicationBuilder.sources(FTPTestApp.class);
		applicationBuilder.web(false);
		applicationBuilder.run(args);

	}

	@Override
	public void run(String... arg0) throws Exception {

		while (true) {
			LOGGER.info("test Application Started..");
			try {
				System.out.println("Running...");
			} catch (Exception e) {
				LOGGER.error("Exception Occured {}", e.getMessage());
			}
			LOGGER.info("test Application ended..");
			
			LOGGER.info("waiting for 10 secs to continue next segment...");
			Thread.sleep(10000);
		}
	}

}
