package com.arya.simaple.programs;

public class AmStrongNum {

	public static void main(String[] args) {
		int n = 371, sum = 0, rem = 0,temp = n;

		while (n > 0) {
			rem = n % 10;
			sum = (int) (sum + Math.pow(rem, 3));
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("amstrong");
		else
			System.out.println("not");
	}

}