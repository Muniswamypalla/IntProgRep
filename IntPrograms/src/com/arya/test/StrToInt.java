package com.arya.test;


public class StrToInt {

	public static void main(String[] args) {
		
		String numStr = "3256";
		
		char ch[] = numStr.toCharArray();
        int sum = 0;
        //get ascii value for zero
        int zeroAscii = (int)'0';
        for(char c:ch){
            int tmpAscii = (int)c;
            sum = (sum*10)+(tmpAscii-zeroAscii);
        }
        
        System.out.println(sum);
	}
}
