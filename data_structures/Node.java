package com.jsp.data_structures;

public class Node <T> {
	T data;
	Node next;
	
	Node(T data){
		this.data=data;
		this.next=null;
	}
}
