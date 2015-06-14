package com.flores.palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {
	@Test
	public void test() {
		assertTrue(Palindrome.test("radar"));
		assertFalse(Palindrome.test("abaaansdn"));
		assertTrue(Palindrome.test("tacocat"));
		assertFalse(Palindrome.test("sd.lcjnvliar;ovar"));
		assertTrue(Palindrome.test("Mr. Owl ate my metal worm"));
		assertFalse(Palindrome.test("ra"));
		assertTrue(Palindrome.test("Eva, can I stab bats in a cave?"));
		assertFalse(Palindrome.test("qwerty"));
		assertTrue(Palindrome.test("A Toyota's a Toyota"));
	}
}
