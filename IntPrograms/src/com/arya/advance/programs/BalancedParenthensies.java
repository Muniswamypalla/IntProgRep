package com.arya.advance.programs;

import java.util.Stack;

public class BalancedParenthensies {

	public static void main(String args[]) {

		System.out.println(balancedParenthensies("{(a,b)}"));
		System.out.println(balancedParenthensies("{(a},b)"));
		System.out.println(balancedParenthensies("{)(a,b}"));
	}

	public static boolean balancedParenthensies(String s) {
		char charArray[] = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '{' || charArray[i] == '[' || charArray[i] == '(') {
				stack.push(charArray[i]);
			} else if (charArray[i] == '}' || charArray[i] == ']' || charArray[i] == ')') {
				char ch = stack.pop();
				if (ch == '{' && charArray[i] != '}')
					return false;
				else if (ch == '[' && charArray[i] != ']')
					return false;
				else if (ch == '(' && charArray[i] != ')')
					return false;
			}
		}

		if (stack.isEmpty())
			return true;
		else
			return false;
	}

}
