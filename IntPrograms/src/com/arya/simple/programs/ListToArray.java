package com.arya.simple.programs;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		 
	    al.add(1);
	    al.add(2);
	    al.add(3);
	    al.add(4);
	    al.add(5);
	 
	    Integer[] stringArrayObject = new Integer[al.size()];
	    al.toArray(stringArrayObject);
	 
	    for(Integer temp : stringArrayObject)
	    System.out.println(temp);
	 
	}

}
