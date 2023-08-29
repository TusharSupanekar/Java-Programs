package com.jsp.data_structures;

public class ArrayListDriver {

	public static void main(String[] args) {
		ArrayList2 ArrayList2=new ArrayList2();
		System.out.println(ArrayList2.isEmpty());
		System.out.println(ArrayList2.size());
		ArrayList2.add(50);
		ArrayList2.add(51);
		ArrayList2.add(52);
		ArrayList2.add(53);
		ArrayList2.add(54);
		ArrayList2.add(55);
		ArrayList2.add(56);
		ArrayList2.add(57);
		
		System.out.println(ArrayList2);
		
		System.out.println(ArrayList2.isEmpty());
		System.out.println(ArrayList2.size());
		
		ArrayList2.removeLast();
		System.out.println(ArrayList2);
		
		ArrayList2.add(57);
		System.out.println(ArrayList2);
		
		
	}
}
