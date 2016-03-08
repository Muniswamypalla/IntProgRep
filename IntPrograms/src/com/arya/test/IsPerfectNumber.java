package com.arya.test;

public class IsPerfectNumber {

	public static void main(String[] args) {

		int number = 6;
		int temp = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				temp += i;
			}
		}
		if (temp == number*2) {
			System.out.println("It is a perfect number");
		} else {
			System.out.println("It is not a perfect number");
		}

	}

}
