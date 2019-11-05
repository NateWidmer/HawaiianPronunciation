package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

/**
 * 
 * The Check class, checks the input given. 
 * 
 * @author Nate, Larissa
 *
 */

public class Check {
	
	/**
	 * 
	 * This function takes a letter and Hashmap and compares the key with the letter
	 * if the letter is a key in the map it will return true
	 * 
	 * @param letter
	 * @param allowed_letters
	 * @return true/false
	 */

	boolean IsVowel(String letter, HashMap<String, String> allowed_letters) {
		return allowed_letters.containsKey(letter);
	}
	
	/**
	 * 
	 * This function takes the Vowel Pair and Hashmap and compares the key with the
	 * pair. if the pair is a key in the map it will return true.
	 * 
	 * @param vowelPair
	 * @param pairs
	 * @return true/false
	 */

	boolean IsValidPair(String vowelPair, HashMap<String, String> pairs) {
		return pairs.containsKey(vowelPair);
	}
	
	/**
	 * 
	 * This function takes the Vowel, current index and the size of the word and
	 * checks if the index is already the last one. Returns true if it is. 
	 * 
	 * @param index
	 * @param word_size
	 * @return true/false
	 */

	boolean IsLastCharacterInString(int index, int word_size) {
		return (index + 1 == word_size);
	}
	
	/**
	 * 
	 * This function takes the current letter and checks if it is a key of the
	 * Hashmap inside the function. Returns true if it is. 
	 * 
	 * @param letter
	 * @return true/false
	 */

	boolean IsConsonant(String letter) {
		Set<String> consonants = new HashSet<String>();
		consonants.add("p");
		consonants.add("k");
		consonants.add("h");
		consonants.add("l");
		consonants.add("m");
		consonants.add("n");

		return consonants.contains(letter);
	}

	/**
	 * 
	 * This function takes the entered word and checks if it contains a consonant
	 * which is not allowed in hawaiian. If it contains one it returns true
	 * 
	 * @param word
	 * @return true/false
	 */
	
	boolean IsInvalidConsonant(String word) {

		boolean containsConsonants = false;

		Set<String> consonants = new HashSet<String>();
		consonants.add("b");
		consonants.add("c");
		consonants.add("d");
		consonants.add("f");
		consonants.add("g");
		consonants.add("j");
		consonants.add("q");
		consonants.add("r");
		consonants.add("s");
		consonants.add("t");
		consonants.add("v");
		consonants.add("x");
		consonants.add("y");
		consonants.add("z");

		for (int i = 0; i < word.length(); i++) {
			for (int x = 0; x < consonants.size(); x++) {
				char word_char = word.toCharArray()[i];
				String word_string = String.valueOf(word_char);
				containsConsonants = consonants.contains(word_string);
			}
		}

		return containsConsonants;

	}

	/**
	 * 
	 * This function takes the reply from the repeat answer and checks if the content
	 * is a valid answer or not. If the answer is invalid an Exception will be thrown. 
	 * 
	 * @param answer_low
	 * @throws AnswerNotValidException
	 */
	
	public void isValidAnswer(String answer_low) throws AnswerNotValidException {
		if ((answer_low.contentEquals("y")) || (answer_low.contentEquals("yes")) || (answer_low.contains("n"))
				|| (answer_low.contains("no"))) {
		} else {
			JOptionPane.showMessageDialog(null, "Invalid Answer. The Program will now be closed");
			throw new AnswerNotValidException("Please give us a valid answer");
			
		}

	}

}