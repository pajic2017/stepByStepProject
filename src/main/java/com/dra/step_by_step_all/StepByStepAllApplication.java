package com.dra.step_by_step_all;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class StepByStepAllApplication {

	private static final Logger log= Logger.getLogger(StepByStepAllApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(StepByStepAllApplication.class, args);
		log.info("Interaction with ConsoleLog #step-by-step");
	}

	@GetMapping("/start")
	public String startMessage(){
		log.info("Inside startMessage() method ");
		log.severe("Severe log example");
		return "Welcome to SpringBoot application created by Dragan....";
	}

}
