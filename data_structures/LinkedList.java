package com.jsp.data_structures;

public class LinkedList {
//	Node head;
	public static Node add(Node head,int data) {
		Node new_node=new Node<Integer>(data);
		if(head==null) {
			head=new_node;
			return head;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=new_node; 
		return head;
	}
	public static void print(Node head) {
		
		Node temp=head;
		System.out.print("[");
		while(temp!=null) {
			System.out.print(temp.data+",");
			temp=temp.next;
		}
		System.out.print("]");
	}

}
