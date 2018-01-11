package com.arya.simple.programs;

public class CapitalString {

	public static void main(String[] args) {

		String input = "muni swamy palla";

		String names[] = input.split(" ");

		StringBuilder output = new StringBuilder();

		for (int i = 0; i < names.length; i++) {
			output.append(Character.toUpperCase(names[i].charAt(0)) + names[i].substring(1));
		}

		System.out.println(output);

		//System.out.println(capitalize(" muni swamy palla"));

	}

	public static String capitalize(String name) {
		char[] charArray = name.trim().toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == ' ') {
				charArray[i + 1] = Character.toUpperCase(charArray[i + 1]);
			}
		}

		charArray[0] = Character.toUpperCase(charArray[0]);

		return String.valueOf(charArray);
	}

}
