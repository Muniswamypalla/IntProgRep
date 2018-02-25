package com.arya.simple.programs;

import java.util.HashMap;
import java.util.Map;

public class CountOfWords {

	public static void main(String[] args) {

		// LOGIC FOR COUNT OF REPEATED WORDS IN A STRING
		String text = "muni swamy palla muni muni";
		Map<String, Integer> m = new HashMap<String, Integer>();

		String names[] = text.split(" ");
		/*
		for (int i = 0; i < names.length; i++) {
			if (m.containsKey(names[i])) {
				int count = m.get(names[i]);
				count++;
				m.put(names[i], count);
			} else
				m.put(names[i], 1);
		}

		for (Map.Entry<String, Integer> entry : m.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}*/
		 

		int count = 1;

		for (int i = 0; i < names.length; i++) {
			if (names[i] != "*") 
			{
				for (int j = i + 1; j < names.length; j++) 
				{
					if (names[i].equals(names[j])) 
					{
						count++;
						names[j] = "*";
					}
				}
			}

			if (names[i] != "*")
				System.out.println(names[i] + " " + count);
			count = 1;
		}

	}
}