package com.Demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WelcomeController {

	@PostMapping("/welcome")
	public ResponseEntity<String> welcome()
	{
		return new ResponseEntity<String> ("welcome to my application",HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Integer> addTwoValues(@RequestParam("a") int val1,@RequestParam("b") int val2)
	{
		int result=val1+val2;
		return new ResponseEntity<Integer>(result,HttpStatus.OK);
	}
}
