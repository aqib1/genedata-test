package com.genedata.test;

import java.util.Arrays;
import java.util.Objects;

public class Application {

	// write a method which reverse array
	public static int[] reverseArray(int[] arr) {
		if (Objects.isNull(arr))
			throw new IllegalArgumentException("Data array is empty");
		if (arr.length == 0)
			return new int[] {};
		if (arr.length == 1)
			return arr;
		// OLog(n)
		int startIndex = 0;
		int lastIndex = arr.length - 1;
		for (; startIndex < lastIndex;) {
			// 1,2,3,4
			// 4,3,2,1
			int valLast = arr[lastIndex];
			arr[lastIndex] = arr[startIndex];
			arr[startIndex] = valLast;

			startIndex++;
			lastIndex--;
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(reverseArray(new int[] { 1, 2 })));
	}
}
