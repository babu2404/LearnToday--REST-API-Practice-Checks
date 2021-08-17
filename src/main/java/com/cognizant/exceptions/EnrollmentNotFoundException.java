package com.cognizant.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * The Class EnrollmentNotFoundException.
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class EnrollmentNotFoundException extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Instantiates a new enrollment not found exception.
	 *
	 * @param msg the msg
	 */
	public EnrollmentNotFoundException(String msg) {
		super(msg);
	}

}
