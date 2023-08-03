package com.jsp.variables;

public class Programs {
	public static void main(String args[]) {
		int sum=0;
		int pro=1;
		int n =10;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum=sum+i;
			}else {
				pro=pro*i;
			}
			System.out.println(pro);
			System.out.println(sum);
		}
		
//		{
//			p=p*i;	
//		}
//		System.out.println(p);
		
//		{
//			sum=sum+i;
//			System.out.println(sum);
//
//		}
//		
//		for(i=1;i<=50;i++) {
//			if(i%2==0) {
//				System.out.print(i+"  ");
//			}
//		}
		
		
	}

}
