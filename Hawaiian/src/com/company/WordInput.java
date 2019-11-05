package com.company;

import javax.swing.JOptionPane;

/**
 * 
 * This class asks the user for input and then transforms it to lowercase. The
 * result will be returned.
 * 
 * @author Nate, Larissa
 *
 */

public class WordInput {
	
	/**
	 * 
	 * This function asks for a word, transforms it to lowercase and returns that.
	 * 
	 * @return entered Word in lowercase
	 */

	String input() {
		String hawaiian_word = JOptionPane.showInputDialog("Enter a hawaiian word to pronounce: ");
		String hawaiian_word_low = hawaiian_word.toLowerCase();
		return hawaiian_word_low;
	}

}