package com.company;

import javax.swing.JOptionPane;

public class WordInput {

	String input() {
		String hawaiian_word = JOptionPane.showInputDialog("Enter a hawaiian word to pronounce: ");
		String hawaiian_word_low = hawaiian_word.toLowerCase();
		return hawaiian_word_low;
	}

}