package com.company;

import java.awt.HeadlessException;
import java.util.*;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		HashMap<String, String> allowed_letters = new HashMap<String, String>();
		allowed_letters.put("a", "ah");
		allowed_letters.put("e", "eh");
		allowed_letters.put("i", "ee");
		allowed_letters.put("o", "oh");
		allowed_letters.put("u", "oo");

		HashMap<String, String> pairs = new HashMap<String, String>();
		pairs.put("ai", "eye");
		pairs.put("ae", "eye");
		pairs.put("ao", "ow");
		pairs.put("au", "ow");
		pairs.put("ei", "ay");
		pairs.put("eu", "eh-oo");
		pairs.put("iu", "ew");
		pairs.put("oi", "oy");
		pairs.put("ou", "ow");
		pairs.put("ui", "ooey");

		Set<String> consonants = new HashSet<String>();
		consonants.add("p");
		consonants.add("k");
		consonants.add("h");
		consonants.add("l");
		consonants.add("m");
		consonants.add("n");

		WordInput wordinput = new WordInput();
		Misc misc = new Misc();
		Check check = new Check();
		Translate translate = new Translate();
		boolean restart = false;

		try {
			do {
				String word = wordinput.input();

				if (check.IsInvalidConsonant(word)) {
					JOptionPane.showMessageDialog(null,
							"The word you entered is not hawaiian. The letters 'B, C, D, F, G, J, Q, S, T, V, X, Y, Z' are invalid.");
					restart = true;
				} else {
					restart = false;
				}

				while (!restart) {

					int index = 0;
					int word_size = word.length();
					misc.outputSentence(word);

					while (index < word.length()) {

						char current_char;
						current_char = word.toCharArray()[index];

						// Parsing char to string
						String current_char_string = String.valueOf(current_char);

						if (check.IsVowel(current_char_string, allowed_letters)) {

							if (index + 1 < word_size) {
								char next_char;
								next_char = word.toCharArray()[index + 1];
								String next_char_string = String.valueOf(next_char);

								// String next_char_string = wordArray[index + 1];

								if (check.IsVowel(next_char_string, allowed_letters)) {
									String vowel_pair;
									vowel_pair = current_char_string + next_char_string;

									if (check.IsValidPair(vowel_pair, pairs)) {

										if (index + 1 == word_size - 1) {
											JOptionPane.showMessageDialog(null,
													translate.TranslateVowelPair(vowel_pair, pairs));
										} else {
											JOptionPane.showMessageDialog(null,
													translate.TranslateVowelPair(vowel_pair, pairs));
										}

										index += 2;
										continue;
									}
								}

								if (check.IsLastCharacterInString(current_char_string, index, word_size)) {
									JOptionPane.showMessageDialog(null,
											translate.TranslateLetter(current_char_string, allowed_letters));
								} else {
									JOptionPane.showMessageDialog(null,
											translate.TranslateLetter(current_char_string, allowed_letters) + "-");
								}

							} else {
								if (check.IsLastCharacterInString(current_char_string, index, word_size)) {
									JOptionPane.showMessageDialog(null,
											translate.TranslateLetter(current_char_string, allowed_letters));
								} else {
									JOptionPane.showMessageDialog(null,
											translate.TranslateLetter(current_char_string, allowed_letters) + "-");
								}
							}
						} else if (check.IsConsonant(current_char_string)) {
							JOptionPane.showMessageDialog(null, current_char_string);
						}
						index += 1;
					}

					restart = true;
				}

			} while (misc.should_continue());
		} catch (HeadlessException e) {
			e.printStackTrace();
		} catch (AnswerNotValidException e) {
			e.printStackTrace();
		}

	}
}