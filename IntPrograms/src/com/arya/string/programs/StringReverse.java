package com.arya.string.programs;

public class StringReverse {

	public static String reverse(String str) {
		StringBuilder strBuilder = new StringBuilder();
		char[] strChars = str.toCharArray();

		for (int i = strChars.length - 1; i >= 0; i--) {
			strBuilder.append(strChars[i]);
		}

		return strBuilder.toString();
	}

	public static void main(String[] args) {

		System.out.println("Reverse String in Java using StringBuffer: " + reverse("muni"));
		System.out.println("Reverse String in Java using StringBuffer: " + reverse("arya"));

	}

}
