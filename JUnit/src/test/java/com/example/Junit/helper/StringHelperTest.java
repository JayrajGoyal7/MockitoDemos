package com.example.Junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void testTruncateAInFirst2Positions() {
		StringHelper helper = new StringHelper();
		//AACD => CD , ACD => CD , EECD => EECD , CDAA => CDAA.
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test 
	public void Test2() {
		StringHelper helper = new StringHelper();
		assertEquals("EECD",helper.truncateAInFirst2Positions("EECD"));
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
		
	}
	
	@Test
	public void Test3() {
		// ABAB=> true, ABCD => false , ABA => false , AB => true, ABCBA =>true
		StringHelper helper = new StringHelper();
		assertEquals(helper.areFirstAndLastTwoCharactersTheSame("ABAB"), true);
	}
	
	@Test
	public void Test4() {
		// ABAB=> true, ABCD => false , ABA => false , AB => true, ABCBA =>true
		StringHelper helper = new StringHelper();
		assertEquals(helper.areFirstAndLastTwoCharactersTheSame("ABCD"), false);
	}
	
	@Test
	public void Test5() {
		// ABAB=> true, ABCD => false , ABA => false , AB => true, ABCBA =>true
		StringHelper helper = new StringHelper();
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABA"));
	}
	
	@Test
	public void Test6() {
		// ABAB=> true, ABCD => false , ABA => false , AB => true, ABCBA =>true
		StringHelper helper = new StringHelper();
		assertEquals(helper.areFirstAndLastTwoCharactersTheSame("AB"), true);
	}
	
	@Test
	public void Test7() {
		// ABAB=> true, ABCD => false , ABA => false , AB => true, ABCBA =>true
		StringHelper helper = new StringHelper();
		assertEquals(helper.areFirstAndLastTwoCharactersTheSame("ABCAB"), true);
	}
	
	@Test
	public void Test8() {
		// ABAB=> true, ABCD => false , ABA => false , AB => true, ABCBA =>true
		StringHelper helper = new StringHelper();
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCBA"));
	}
	
	@Test
	public void Test9() {
		// ABAB=> true, ABCD => false , ABA => false , AB => true, ABCBA =>true
		StringHelper helper = new StringHelper();
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
		
		//this will always fail the test.
//		assertFalse("This Condition failed.",true);
	}

}
