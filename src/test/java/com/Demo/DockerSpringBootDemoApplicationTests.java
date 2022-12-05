package com.Demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class DockerSpringBootDemoApplicationTests {

	@Autowired
	WelcomeController controller;

	@Test
	public void addTest() {
		ResponseEntity<Integer> result = controller.addTwoValues(20, 12);
		Assertions.assertEquals(result.getBody(), 32);
	}

}
