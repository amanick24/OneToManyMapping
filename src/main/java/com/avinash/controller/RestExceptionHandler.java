package com.avinash.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class RestExceptionHandler {

	@ExceptionHandler(value= NoRecordFoundExecption.class)
	public ResponseEntity NoRecordFoundExecption() {
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
}
