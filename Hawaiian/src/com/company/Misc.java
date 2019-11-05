package com.company;

import javax.swing.JOptionPane;

/**
 * 
 * This class contains any function that could not be assigned to any of the other
 * classes. 
 * 
 * @author Nate, Larissa
 *
 */

public class Misc {
	
	/**
	 * 
	 * This function takes the word entered and transforms it to uppercase.
	 * The result will be shown on the screen.
	 * 
	 * @param word
	 */

	void outputSentence(String word) {
		String word_low = word.toUpperCase();
		JOptionPane.showMessageDialog(null, word_low + " is pronounced:");
	}
	
	/**
	 * 
	 * This function will be called when a word was translated. The reply given
	 * from the user will be transformed to lowercase and then checked if it is valid
	 * then checks if it the answer is yes or no.
	 * Returns either true or false or throws an exception in case the answer is invalid.
	 * 
	 * @return true/false
	 * @throws AnswerNotValidException
	 */

	boolean should_continue() throws AnswerNotValidException {
		
		Check check = new Check();
		
		String answer = JOptionPane.showInputDialog(null, "Do you want to enter another word? Y/YES/N/NO");
		String answer_low = answer.toLowerCase();
		
		check.isValidAnswer(answer_low);

		if ((answer_low.contentEquals("y")) || (answer_low.contentEquals("yes"))) {
			return true;
		}
		return false;
	}

}