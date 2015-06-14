package com.flores.palindrome;


/**
 * A palindrome is a word, phrase, number, or other 
 * sequence of characters which reads the same backward 
 * or forward.
 * @author Jason Flores
 */
public class Palindrome {

	public static boolean test(String word) {
		char data[] = clean(word);
		int i, j;
		for(i = (data.length -1), j = 0; i >= 0; i--, j++) {
			if(data[i] != data[j])
				return false;
			else if(i == j)
				break;
		}
		return true;
	}
	
	private static char[] clean(String wordOrSentence) {
		return wordOrSentence.replaceAll("[!?_ ,-.*&$]", "")
				.toLowerCase().toCharArray();
	}
}