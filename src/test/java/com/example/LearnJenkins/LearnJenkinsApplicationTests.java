package com.example.LearnJenkins;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
class LearnJenkinsApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(LearnJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		log.info("Test case executing.......");
		assertEquals(true,true);
	}

}
