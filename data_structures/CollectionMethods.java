package com.jsp.data_structures;
import java.util.ArrayList;

public class CollectionMethods {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(75);
		al.add(66);
		al.add(12);
		al.add(28);
		al.add(18);
		al.add(18);
		System.out.println(al);
		
		ArrayList al2=new ArrayList();
		al2.add(1);
		al2.add(2);
		al2.add(3);
		al2.addAll(al);
		System.out.println(al2);
		
		al2.remove(2);
		System.out.println(al2);
		
		al2.retainAll(al);
		System.out.println(al2);
		
		al2.clear();
		System.out.println(al2);

	}
}
