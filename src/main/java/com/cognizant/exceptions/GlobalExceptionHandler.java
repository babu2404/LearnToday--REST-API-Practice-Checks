package com.cognizant.exceptions;


	import java.util.HashMap;

	import java.util.Map;


	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.springframework.http.HttpHeaders; 
	import org.springframework.http.HttpStatus; 
	import org.springframework.http.ResponseEntity;
	
	import org.springframework.web.bind.annotation.ControllerAdvice;
	import org.springframework.web.bind.annotation.ExceptionHandler;

	import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

 


/**
	 * The Class GlobalExceptionHandler.
	 */
	@ControllerAdvice
	public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
		
		/** The logger. */
		Logger LOGGER  =  LoggerFactory.getLogger(GlobalExceptionHandler.class);
		
		/**
		 * Handle course not found exception.
		 *
		 * @param ex the ex
		 * @return the response entity
		 */
		@ExceptionHandler(CourseNotFoundException.class)
		public ResponseEntity<Map<String,Object>> handleCourseNotFoundException(CourseNotFoundException ex)
		{
			Map<String,Object> err = new HashMap<String,Object>();
			err.put("Status Code",HttpStatus.BAD_REQUEST.value());
			err.put("message", "Course Id Not Found!");	
			err.put("solution", "try to enter valid id");
			return new ResponseEntity<Map<String,Object>>(err,new HttpHeaders(),HttpStatus.BAD_REQUEST);
		}
		
		/**
		 * Handle enrollment not found exception.
		 *
		 * @param ex the ex
		 * @return the response entity
		 */
		@ExceptionHandler(EnrollmentNotFoundException.class)
		public ResponseEntity<Map<String,Object>> handleEnrollmentNotFoundException(EnrollmentNotFoundException ex)
		{
			Map<String,Object> err = new HashMap<String,Object>();
			err.put("Status Code",HttpStatus.BAD_REQUEST.value());
			err.put("message", "enrollment Id Not Found!");	
			err.put("solution", "try to enter valid id");		
			return new ResponseEntity<Map<String,Object>>(err,new HttpHeaders(),HttpStatus.BAD_REQUEST);
		}
		
		/**
		 * Handle trainer not found exception.
		 *
		 * @param ex the ex
		 * @return the response entity
		 */
		@ExceptionHandler(TrainerNotFoundException.class)
		public ResponseEntity<Map<String,Object>> handleTrainerNotFoundException(TrainerNotFoundException ex)
		{
			Map<String,Object> err = new HashMap<String,Object>();
			err.put("Status Code",HttpStatus.BAD_REQUEST.value());
			err.put("message", "Trainer Id Not Found!");	
			err.put("solution", "try to enter valid id");		
			return new ResponseEntity<Map<String,Object>>(err,new HttpHeaders(),HttpStatus.BAD_REQUEST);
		}
		

	}


