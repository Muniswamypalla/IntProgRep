package com.arya.simple.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonEleInTwoArrays {

	public static void main(String[] args) {

		/*int a[] = new int[] { 1, 4, 5, 6, 3, 2 };

		int b[] = new int[] { 4, 7, 2, 9, 3, 8, 5 };

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j])
					System.out.println(a[i]);

			}
		}*/

		Integer a[] = new Integer[] { 1, 4, 5, 6, 3, 2 };

		Integer b[] = new Integer[] { 4, 7, 2, 9, 3, 8, 5 };

		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(a));

		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(b));

		list1.retainAll(list2);

		System.out.println(list1);

	}
}
