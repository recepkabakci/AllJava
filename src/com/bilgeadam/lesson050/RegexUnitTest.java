package com.bilgeadam.lesson050;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

class RegexUnitTest {

	@Test
	public void givenText_whenSimpleRegexMatches_thenCorrect() {
		Pattern pattern = Pattern.compile("foo");
		Matcher matcher = pattern.matcher("foo");
		assertTrue(matcher.find());
	}
	@Test
	public void givenText_whenSimpleRegexMatchesTwice_thenCorrect() {
		Pattern pattern = Pattern.compile("foo");
		Matcher matcher = pattern.matcher("foofoo");
		int matches = 0;
		while(matcher.find()) {
			matches++;
		}
		assertEquals(matches, 2);
	}
	public static int  runTest(String regex,String text) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		int matches = 0;
		while(matcher.find()) {
			matches++;
		}
		return matches;
		
	}
	@Test
	public void givenText_whenMatchesWithDot_thenCorrect() {
		int matches =runTest(".","foo");
		assertEquals(matches,3);
	}
}
