package com.example.SecurityTutorial;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SecurityTutorialApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(SecurityTutorialApplicationTests.class);


	@Test
	void contextLoads() {
		Logger.info("Test case executed..");
		assertEquals(true, true);
	}

}
