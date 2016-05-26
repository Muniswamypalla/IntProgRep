package com.arya.simple.programs;

public class ExecutionTest {
	
	private static int a = m1();
	private int b = m2();
	
	static
	{
		System.out.println("in static");
		//m1();
	} 
	
	public static int m1()
	{
		System.out.println("in a static method");
		return 1;
	}
	
	
	public int m2()
	{
		System.out.println("instance method");
		return 2;
	}
	{
		System.out.println("instance block");
	}
	
	ExecutionTest()
	{
		System.out.println("contructor");
	}

	public static void main(String[] args) {
		
		ExecutionTest et = new ExecutionTest();
		
	}

}
