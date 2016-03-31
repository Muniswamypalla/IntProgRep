package com.arya.simaple.programs;

public class VowelInString {

	public static void main(String[] args) {
		
		String name = "muni swamy";
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u')
				System.out.println(name.charAt(i));
		}
		
	}

}
