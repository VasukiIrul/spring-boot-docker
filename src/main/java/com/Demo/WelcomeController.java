package com.Demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WelcomeController {

	public ResponseEntity<String> welcome()
	{
		return new ResponseEntity<String> ("welcome to my application",HttpStatus.OK);
	}
}
