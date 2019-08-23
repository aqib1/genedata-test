package com.genedata.test;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {
	
	
	@Test
	public void testReverseArrayNormalWithOneValues() {
		int[] reverse = Application.reverseArray(new int[] {1});
		int [] result = new int [] {1};
		Assert.assertArrayEquals(result, reverse);
	}
	
	
	@Test
	public void testReverseArrayNormalWithTwoValues() {
		int[] reverse = Application.reverseArray(new int[] {1,2});
		int [] result = new int [] {2,1};
		Assert.assertArrayEquals(result, reverse);
	}
	
	
	@Test
	public void testReverseArrayNormal() {
		int[] reverse = Application.reverseArray(new int[] {1,2,3});
		int [] result = new int [] {3,2,1};
		Assert.assertArrayEquals(result, reverse);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testReverseArrayWithNull() {
		Application.reverseArray(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testReverseArrayWithEmpty() {
		Application.reverseArray(new int [] {});
	}

	@Test
	public void testReverseArrayNegitive() {
		int[] reverse = Application.reverseArray(new int[] {1,2,3});
		int [] result = new int [] {3,3,1};
		Assert.assertNotSame(result, reverse);
	}
}
