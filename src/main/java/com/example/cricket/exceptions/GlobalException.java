package com.example.cricket.exceptions;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	static Logger log=Logger.getLogger(GlobalException.class);
	@ExceptionHandler(AgeException.class)
	public ResponseEntity<String> re(Exception ae){
		PropertyConfigurator.configure("Cricket.properties");
		log.error(ae);
		return new ResponseEntity<>(ae.getMessage(),HttpStatus.NOT_FOUND);
	}
}
