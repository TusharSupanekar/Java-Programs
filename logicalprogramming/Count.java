package com.jsp.logicalprogramming;
import java.util.Scanner;

public class Count {
	public static int Count(int n){
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		
//		for(;n>0;n=n/10) {
//			count++;			//Using For loop
//		}
		return count;
	}	
		public static void main(String args[]) {
			System.out.println(Count(1124));
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n=sc.nextInt();
//		Count c =new Count();
//		System.out.println(c.Count(n));	
		}	
	}


