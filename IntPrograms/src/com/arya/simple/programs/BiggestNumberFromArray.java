package com.arya.simple.programs;

import java.util.*;

class BiggestNumberFromArray {

	static void printLargest(List<String> arr) {

		Collections.sort(arr, (X, Y) -> {

			String XY = X + Y;
			String YX = Y + X;

			return XY.compareTo(YX) > 0 ? -1 : 1;//We need decending order to get max.
		});

		Iterator<String> it = arr.iterator();

		while (it.hasNext())
			System.out.print(it.next());

	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		// output should be 6054854654
		list.add("54");
		list.add("546");
		list.add("548");
		list.add("60");
		printLargest(list);

		// output should be 777776
		/*
		 * list.add("7"); list.add("776"); list.add("7"); list.add("7");
		 */

		// output should be 998764543431
		/*
		 * list.add("1"); list.add("34"); list.add("3"); list.add("98"); list.add("9");
		 * list.add("76"); list.add("45"); list.add("4");
		 */
	}
}