package com.arya.simaple.programs;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		String name[] = {"muni", "swamy", "arya","ramesh"};
		
		List l = Arrays.asList(name);
		
		System.out.println(l);
	}

}
