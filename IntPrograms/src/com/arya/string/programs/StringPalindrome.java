package com.arya.string.programs;

public class StringPalindrome {

	public static void main(String[] args) {

		String s1 = "imi";
		
		String s2 = reverse(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
	}

	public static String reverse(String source) {
		if (source == null || source.isEmpty()) {
			return source;
		}
		String reverse = "";
		for (int i = source.length() - 1; i >= 0; i--) {
			reverse = reverse + source.charAt(i);
		}

		return reverse;
	}

}
