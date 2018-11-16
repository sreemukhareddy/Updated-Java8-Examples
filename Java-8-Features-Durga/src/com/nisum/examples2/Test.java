package com.nisum.examples2;

public class Test {

	public static void main(String[] args) {
		Interf1 i1= (int a, int b) -> System.out.println(a+b + " is the Sum from (int a, int b)" );
		i1.m1(1, 2);
		
		Interf1 i2= (a, b) -> System.out.println(a+b + " is the Sum from (a, b)" );
		i2.m1(1, 2);
		
				
	}
	
	
}
