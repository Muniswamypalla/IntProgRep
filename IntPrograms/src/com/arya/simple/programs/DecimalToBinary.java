package com.arya.simple.programs;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		        int a;
		        int i = 0;
		        int b[] = new int[10];

		        a = 10;         //taking command line input
		        while (a != 0)
		        {
		            i++;
		            b[i] = a % 2;
		            a = a / 2;
		        }
		        StringBuffer sb = new StringBuffer();
		        for (int j = i; j > 0; j--)
		        {
		            sb.append(b[j]);
		        }
		        
		        int c = Integer.parseInt(sb.toString());
		        System.out.println(c);
		    }

}
