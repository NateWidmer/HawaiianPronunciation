package com.company;

import java.util.HashMap;

/**
 * 
 * This class is used to return the value of the hawaiian letters in their
 * translated form.
 * 
 * @author Nate, Larissa
 *
 */
public class Translate {
	
	/**
	 * 
	 * This function translates the letter pair into the hawaiian pronunciation. 
	 * 
	 * @param vowelPair
	 * @param pairs
	 * @return translated pair
	 */

	String TranslateVowelPair(String vowelPair, HashMap<String, String> pairs) {
		String pair = pairs.get(vowelPair).toString();
		return pair;
	}
	
	/**
	 * 
	 * This function translates a single letter into the hawaiian pronunciation.
	 * 
	 * @param letter
	 * @param allowed_letters
	 * @return translated Letter
	 */

	String TranslateLetter(String letter, HashMap<String, String> allowed_letters) {
		String translated_letter = allowed_letters.get(letter).toString();
		return translated_letter;
	}

}