package com.arya.simple.programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class CommonElementsInArray {

	public static void main(String[] args) {
		int[] arr1 = { 4, 7, 3, 9, 2 };
		int[] arr2 = { 3, 2, 12, 9, 40, 32, 4 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
		
		System.out.println("----------------");
		
		Integer[] arr3 = { 4, 7, 3, 9, 2 };
		Integer[] arr4 = { 3, 2, 12, 9, 40, 32, 4 };
		
		
		Set<Integer> crunchifySet1 = new LinkedHashSet<Integer>(Arrays.asList(arr3));
		Set<Integer> crunchifySet2 = new LinkedHashSet<Integer>(Arrays.asList(arr4));
 
		for (Integer crunchify : crunchifySet1) {
			if (!crunchifySet2.add(crunchify)) {
				System.out.println(" " + crunchify);
			}
		}
	}

}
