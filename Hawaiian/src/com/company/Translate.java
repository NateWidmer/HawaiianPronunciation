package com.company;

import java.util.HashMap;

public class Translate {

	String TranslateVowelPair(String vowelPair, HashMap<String, String> pairs) {
		String pair = pairs.get(vowelPair).toString();
		return pair;
		// return pairs.get(vowelPair);
	}

	String TranslateLetter(String letter, HashMap<String, String> allowed_letters) {
		String translated_letter = allowed_letters.get(letter).toString();
		return translated_letter;
	}

}