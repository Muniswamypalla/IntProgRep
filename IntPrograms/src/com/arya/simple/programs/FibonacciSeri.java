package com.arya.simple.programs;

public class FibonacciSeri {

	public static void main(String[] args) {
		
		int a[] = new int[15];
		
		a[0]=0;
		a[1]=1;
		
		for (int i = 2; i < a.length; i++) {
			
			a[i] = a[i-1]+a[i-2];
		}
		
		for(int i=0; i< 15; i++){
            System.out.print(a[i] + " ");
    }
		
	}
}
