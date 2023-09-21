package com.jsp.logicalprogramming;

public class ArmstrongNumber {
	public static String isArmstrong(int n) {
		int temp = n;
		int sum = 0;
		int count = 0;
		// count the digits
		while (temp > 0) {
			temp = temp / 10;
			count++;
		}
		temp = n;
		while (temp > 0) {
			int lastdigit = temp % 10;
			int pro = 1;
			for (int i = 1; i <= count; i++) {
				pro = pro * lastdigit;
			}
			sum = sum + pro;
			temp = temp / 10;
		}
		if (sum == n) {
			return "Is Armstrong number";

		} else {
			return "Not an Armstrong Number";
		}
	}

	public static void main(String args[]) {
		System.out.println(isArmstrong(153));
	}

}
