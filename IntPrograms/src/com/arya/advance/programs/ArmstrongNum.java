package com.arya.advance.programs;

public class ArmstrongNum {

	public static void main(String[] args) {

		int num = 153;
		double sum = 0;

		int temp = num;

		while (num > 0) {
			sum = sum + Math.pow((num % 10), 3);
			num = num / 10;
		}

		if (sum == temp)
			System.out.println("true");
	}
}
