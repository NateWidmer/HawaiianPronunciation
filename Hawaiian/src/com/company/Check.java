package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

public class Check {

	boolean IsVowel(String letter, HashMap<String, String> allowed_letters) {
		return allowed_letters.containsKey(letter);
	}

	boolean IsValidPair(String vowelPair, HashMap<String, String> pairs) {
		return pairs.containsKey(vowelPair);
	}

	boolean IsLastCharacterInString(String vowel, int index, int word_size) {
		return (index + 1 == word_size);
	}

	boolean IsConsonant(String letter) {
		Set<String> consonants = new HashSet<String>();
		consonants.add("p");
		consonants.add("k");
		consonants.add("h");
		consonants.add("l");
		consonants.add("m");
		consonants.add("n");

		// set<String> constants({"p", "k", "h", "l", "m", "n"});

		return consonants.contains(letter);
		// return ContainsKey(constants, letter);
	}

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

	public void isValidAnswer(String answer_low) throws AnswerNotValidException {
		if ((answer_low.contentEquals("y")) || (answer_low.contentEquals("yes")) || (answer_low.contains("n"))
				|| (answer_low.contains("no"))) {
		} else {
			JOptionPane.showMessageDialog(null, "Invalid Answer. The Program will now be closed");
			throw new AnswerNotValidException("Please give us a valid answer");
			
		}

	}

}