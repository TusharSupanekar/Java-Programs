package com.jsp.data_structures;

public class ArrayList2 {
	private int data[];
	private int nextElement;
	
	//constructor
	public ArrayList2() {
		data=new int[10];
		nextElement=0;	
	}
	
	//override toString()
	@Override
	public String toString() {
		System.out.print("[");
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+",");
		}
		return "]";
	}
	
	public boolean isEmpty() {
		return nextElement==0;
	}
	public int size() {
		return nextElement;
	}
	
	//to add element in Arraylist2
	public void add(int element) {
		if(nextElement==data.length) {
			incrementCapacity();
		}
		data[nextElement]=element;
		nextElement++;
	}

	final private void incrementCapacity() {
		int temp[]=data;
		data=new int[temp.length*(3/2)+1];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
	}
}
