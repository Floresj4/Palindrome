package com.flores.palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {
	@Test
	public void test() {
		assertTrue(Palindrome.test("radar"));
		assertFalse(Palindrome.test("abaaansdn"));
		assertTrue(Palindrome.test("tacocat"));
		assertFalse(Palindrome.test("ra"));
		assertTrue(Palindrome.test("Eva, can I stab bats in a cave?"));
	}
}
