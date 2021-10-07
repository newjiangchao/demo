package com.example.demo;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@Log4j2
@SpringBootTest
public class DemoApplicationTests extends AbstractTestNGSpringContextTests {

	@Value("${spring.datasource.url}")
	private String url;

	@Test
	public void contextLoads() {
		log.info("url: {}", url);
	}

}
