package com.arya.simple.programs;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		
		String name[] = { "muni", "swamy", "arya", "ramesh" };

		List<String> l = Arrays.asList(name);

		System.out.println(l);
	}

}
