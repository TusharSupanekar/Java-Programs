package com.jsp.logicalprogramming;

public class SwapTwoNumbers {
	public static void main(String args[]){
		
//		without using temp variable
		int a =10;
		int b =20;
		
	a=a+b;
	b=a-b;
	a=a-b;
	
		System.out.println(a);
		System.out.println(b);
			
		
//		using temp variable
//	int a=10;
//	int b=20;
//	int t;
//	System.out.println(a);
//	System.out.println(b);
//	t=a;
//	a=b;
//	b=t;
//	System.out.println(a);
//	System.out.println(b);
	}
}
