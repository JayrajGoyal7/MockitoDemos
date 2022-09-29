package com.in28minutes.business;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void testListMockMethodIsCalled_AndReturningTheValue() {
		List listMock = mock(List.class);
	
		when(listMock.size()).thenReturn(2);
		assertEquals(2,listMock.size());
	
	}
	
	
	@Test
	public void testListMockMethodIsCalled_AndReturningMultipleValues() {
		List listMock = mock(List.class);
	
		when(listMock.size()).thenReturn(2).thenReturn(3);
		//calling first time returns the value of 2
		assertEquals(2,listMock.size());
		// calling the second time returns the value of 3.
		assertEquals(3,listMock.size());
	
	}


	@Test(expected = RuntimeException.class)
	public void testListMockGetMethod() {
		List listMock = mock(List.class);
	
		
		when(listMock.get(0)).thenThrow(new RuntimeException("Run time Exception"));
		
		listMock.get(0);
		/*
		// anyInt() => is Argument Matcher
		when(listMock.get(anyInt())).thenReturn("Jayraj");
		assertEquals("Jayraj",listMock.get(0));
		assertEquals("Jayraj",listMock.get(1));
		assertEquals("Jayraj",listMock.get(2));
		assertEquals("Jayraj",listMock.get(3));
		*/
		/*
		  	Mocks are returning the null value if no value is determined by the user.
			assertEquals(null,listMock.get(1));
		*/
		
	}
	
}
