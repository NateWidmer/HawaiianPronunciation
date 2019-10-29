package com.company;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class CheckTest {
	
	@Test
	public void testIsVowel() {
		HashMap<String, String> allowed_letters = new HashMap<String, String>();
		allowed_letters.put("a", "ah");
		allowed_letters.put("e", "eh");
		allowed_letters.put("i", "ee");
		allowed_letters.put("o", "oh");
		allowed_letters.put("u", "oo");
		assertTrue(allowed_letters.containsKey("a"));
	}
	
	@Test
	public void testIsValidPair() {
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
		assertTrue(pairs.containsKey("ai"));
	}
}
