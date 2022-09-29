package com.example.Junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//Creating the parameterized test cases
@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	// of we wont initialize the string then the tests would get failed.
	private String input="";
	private String expectedOutput="";
	
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		input = this.input;
		expectedOutput = this.expectedOutput;
	}
	
	
	@Parameters
	public static Collection<String[]> testCondition() {
		
		String[][] expectedOutputs = {
				{"AACD","CD"},
				{"ACD","CD"},
				{"EECD","EECD"},
				{"CDAA","CDAA"}
				//input,expected Output
				};
		
		return Arrays.asList(expectedOutputs);
	}
	
	
	@Test
	public void testTruncateAInFirst2Positions() {
		StringHelper helper = new StringHelper();
		//AACD => CD , ACD => CD , EECD => EECD , CDAA => CDAA.
		assertEquals(expectedOutput,helper.truncateAInFirst2Positions(input));
		assertEquals(expectedOutput,helper.truncateAInFirst2Positions(input));
	}
	
	@Test 
	public void Test2() {
		StringHelper helper = new StringHelper();
		assertEquals(expectedOutput,helper.truncateAInFirst2Positions(input));
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
		
	}
	
}
