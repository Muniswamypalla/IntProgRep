package com.arya.simple.programs;

public class DecToBinary {

	public static void main(String[] args) {
		int a = 7;
		
		/*String num = Integer.toBinaryString(a);
		System.out.println(num);
		*/
		int b[] = new int[10];
		int i=0;
		while(a>0)
		{
			b[++i] = i%2;
			a = a/2;
		}
		
		int n = b.length;
		
		for(int j=i;j>=0;j--)
			System.out.print(b[j]);
	}

}
