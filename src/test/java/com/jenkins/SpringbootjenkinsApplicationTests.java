package com.jenkins;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootjenkinsApplicationTests {

	public static Logger logger= LoggerFactory.getLogger(SpringbootjenkinsApplicationTests.class);


	@Test
	public  contextLoads() {
		logger.info("Test Case Executed....");
		logger.info("Test Case Executed second log");
		logger.info("Test Case executed Email Notifications added updated");
		assertEquals(true, true);
	}

}
