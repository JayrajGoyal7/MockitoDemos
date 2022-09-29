package com.example.Junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysTest {

	@Test
	public void test() {
		
		int[] arr1 = {12,23,43,1,11,8,65,34};
		int[] arr2 = {1,8,11,12,23,34,43,65};
		Arrays.sort(arr1);
		
		assertArrayEquals(arr2,arr1);
	}
	
	@Test(expected =NullPointerException.class)
	public void NullArrayTest() {
//		int[] arr = {};
		int[] arr = null;
		Arrays.sort(arr);
	}

	
	@Test(timeout = 20)
	public void TestTimeoutPerformanceOfArray() {
		int[] arr = {1,2,3,4};
		for(int i=0; i<=1000000;i++) {
			arr[0]=i;
			Arrays.sort(arr);
		}
		
	}
}
