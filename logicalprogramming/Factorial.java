package com.jsp.logicalprogramming;

public class Factorial
{
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
//		while(n>0) {
//			fact=fact*n;
//			n--;	
//		}
		return fact;
	}
	public static void main(String args[]) {
		System.out.println(factorial(5));
	}	
}
