package com.arya.test;

import java.util.Arrays;

public class QuickSort {

	private int array[];

	public void sort(int... arr) {
		if (arr == null || arr.length == 0) {
			return;
		}

		this.array = arr;
		quickSort(0, arr.length - 1);
	}

	private void quickSort(int startIndex, int endIndex) {
		
		int i = startIndex;
		int j = endIndex;
		int pivot = array[startIndex+(endIndex-startIndex)/2];
		while(i<=j)
		{
			
			while(array[i] < pivot)
				i++;
				
			while(array[j]>pivot)
				j--;
			
			if(i<=j)
			{
				exchangeNumbers(i, j);
				i++;
				j--;
			}
				
		}
		
		if(startIndex < j)
			quickSort(startIndex, j);
		if(i<endIndex)
			quickSort(i, endIndex);

	}
	
	private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

	public static void main(String[] args) {

		int arr[] = {24,2,45,20,56,75,2,56,99,53,12};

		new QuickSort().sort(arr);

		System.out.println(Arrays.toString(arr));

	}
}
