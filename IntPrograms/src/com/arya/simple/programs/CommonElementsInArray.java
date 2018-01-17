package com.arya.simple.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsInArray {

	public static void main(String[] args) {
		int[] arr1 = { 4, 7, 3, 9, 2 };
		int[] arr2 = { 3, 2, 12, 9, 40, 32, 4 };
		commonElements1(arr1, arr2);
		
		Integer[] arr3 = { 4, 7, 3, 9, 2 };
		Integer[] arr4 = { 3, 2, 12, 9, 40, 32, 4 };
		commonElements2(arr3, arr4);
		
		commonElements3(arr3, arr4);
	}
	
	private static void commonElements1(int[] arr1, int[] arr2)
	{
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
		
		System.out.println("----------------");
	}
	
	private static void commonElements2(Integer[] arr1, Integer[] arr2)
	{
		Set<Integer> crunchifySet1 = new LinkedHashSet<Integer>(Arrays.asList(arr1));
		Set<Integer> crunchifySet2 = new LinkedHashSet<Integer>(Arrays.asList(arr2));
 
		for (Integer crunchify : crunchifySet1) {
			if (!crunchifySet2.add(crunchify)) {
				System.out.println(crunchify);
			}
		}
		
		System.out.println("----------------");
	}

	private static void commonElements3(Integer[] arr3, Integer[] arr4)
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr3));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(arr4));
		
		list1.retainAll(list2);
		System.out.println(list1);
	}
}
