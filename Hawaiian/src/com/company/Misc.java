package com.company;

import javax.swing.JOptionPane;

public class Misc {

	void outputSentence(String word) {
		String word_low = word.toUpperCase();
		JOptionPane.showMessageDialog(null, word_low + " is pronounced:");
	}

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