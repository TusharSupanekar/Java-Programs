package com.jsp.left_angled_triangle_patterns;

public class TrianglePattern10 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==j||j==1||i==n) {
				System.out.print("*");
				}else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}

}
