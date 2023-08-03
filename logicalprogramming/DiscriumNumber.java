package com.jsp.logicalprogramming;

public class DiscriumNumber {
	public static String isDiscrium(int n) {
		int temp=n;
		int sum=0;
		int count=0;
		
		//count no. of digits
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		temp=n;
		while(temp>0) {
			int lastdigit=temp%10;
			int pro=1;
			for(int i=1;i<=count;i++) {
				pro=pro*lastdigit;
			}
			count--;
			sum=sum+pro;
			temp=temp/10;
		}
		if(sum==n) {
			return "Is Discrium number";
			
		}else {
			return "Not a Discrium Number";
		}	
	}
	public static void main(String args[]) {
		System.out.println(isDiscrium(175));
	}
}
