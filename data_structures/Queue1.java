package com.jsp.data_structures;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
	public static void main(String[] args) {
		Queue queue= new LinkedList<>();
		queue.add("Person 1");
		queue.add("Person 1");
		queue.add("Person 1");
		queue.add("Person 1");
		queue.add("Person 1");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}

}
