package com.slokam.exam.controller;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.slokam.exam.exception.ResourceNotFoundException;

@RestControllerAdvice
public class OurExceptionHandler {
  private final Logger logger = Logger.getLogger(OurExceptionHandler.class);
	
    @ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity handleResourceNotFound(){
		logger.info("We are in handleResourceNotFound");
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}
    
}





