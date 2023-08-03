package com.jsp.variables;

public class switchcase {
	public static void main(String args[]) {
		int a=21; int b=31;
		int choice=0;
		switch(choice){
		
		case 0:{
			System.out.println((a+b)+"sum of two numbers");
		}break;
		case 1:{
			System.out.println((a-b)+"difference of two numbers");
		}break;
		case 2:{
			System.out.println((a*b)+"multiplication of two numbers");
		}break;
		case 3:{
			System.out.println((a/b)+"division of two numbers");
		}break;
		default:{
			System.out.println("Enter choice between 0 and 3");
		}break;
		
		}
	}

}
