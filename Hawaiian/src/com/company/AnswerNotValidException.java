package com.company;

/**
 * 
 * The Exception Class that gives back the Exception message whenever an invalid
 * answer is given.
 * 
 * @author Nate Widmer
 *
 */

public class AnswerNotValidException extends Exception {
	
	/**
	 * 
	 * The function accesses the constructor of the upper class (Exception)
	 * It will give it the message. 
	 * 
	 * @param message
	 */
	
	public AnswerNotValidException(String message) {
		super(message);
	}

}
