package com.arya.test;

import java.util.Arrays;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {

	/*	//1.standard way
		int array[] = new int[] { 1, 2, 1, 4, 3, 4, 3, 2 };

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j])
					array[i] = -1;

			}
		}
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] != -1)
			System.out.println(array[i]);
		}*/
		
		
		// 2.use quick sort then use below logic
		int[] arr = new int[] { 1, 1, 1, 2, 2, 3, 4, 5 };
		int[] result = new int[arr.length];
		/*int previous = arr[0];
		result[0] = previous;
		int count =0;

		for (int i = 1; i < arr.length; i++) {
			int ch = arr[i];

			if (previous != ch) {
				result[count++] = previous;
			}
			previous = ch;
		}

		System.out.println(Arrays.toString(result));*/
		
		for (int i = 1; i < result.length; i++) {
			
			if(arr[i] == arr[i-1])
			{
				result[i-1] = arr[i];
				i+=1;
			}
			else
				result[i-1] = arr[i];
		}
		
		System.out.println(Arrays.toString(result));
		
	}

}
