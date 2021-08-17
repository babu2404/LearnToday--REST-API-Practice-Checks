package com.cognizant.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * The Class TrainerNotFoundException.
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class TrainerNotFoundException extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Instantiates a new trainer not found exception.
	 *
	 * @param msg the msg
	 */
	public TrainerNotFoundException(String msg) {
		super(msg);
	}

}
