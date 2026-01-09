package com.dra.step_by_step_all;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class StepByStepAllApplicationTests {

//	@Test
//	void contextLoads() {
//		StepByStepAllApplication appStep=new StepByStepAllApplication();
//		assertNotNull(appStep);
//	}

	@Test
	void applicationStartsSuccessfully() {
		StepByStepAllApplication.main(new String[]{});
		assertNotNull(StepByStepAllApplication.class);
	}

	@Test
	void startMessageReturnsExpectedResponse() {
		StepByStepAllApplication app = new StepByStepAllApplication();
		String response = app.startMessage();
		assertNotNull(response);
		assertEquals("Welcome to SpringBoot application created by Dragan....", response);
	}




}
