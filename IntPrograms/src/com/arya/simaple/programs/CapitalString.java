package com.arya.simaple.programs;

public class CapitalString {
	
	
	public static void main(String[] args) {
		
		String input = "muni swamy palla";
		
		String names[] = input.split(" ");
		
		int n = names.length; 
		
		String output = "";
		
		for(int i=0;i<n;i++)
		{
			output = output +" " + names[i].substring(0, 1).toUpperCase() + names[i].substring(1);
			 
		}
		
		System.out.println(output);  
		
		
	}

}
