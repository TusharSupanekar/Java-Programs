package com.jsp.data_structures;

public class NodeDriver {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		Node<Integer> head= new Node<Integer>(50);
		ll.add(head,20);
		ll.add(head,30);
		ll.add(head,40);
		ll.add(head,60);
		ll.add(head,70);
		ll.add(head,80);
		ll.add(head,90);
		ll.add(head,100);
		ll.add(head,110);
		ll.add(head,120);
		
		ll.print(head);
		
	}

}
