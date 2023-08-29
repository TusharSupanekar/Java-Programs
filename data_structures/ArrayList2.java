package com.jsp.data_structures;

public class ArrayList2 {
	private int data[];
	private int nextElement;
	
	//constructor
	public ArrayList2() {
		data=new int[10];
		nextElement=0;	
	}
	
	//Constructor type 2
//	public ArrayList2(int newData[]) {
//	data=new int[newData.length];
//	for(int i=0;i<newData.length;i++) {
//		data[i]=newData[i];
//		nextElement=0;
//	}
//}
	
	
	//to add user-defined array size (Constructor type 3)
//	public ArrayList2(int size) {
//		data=new int[size];
//		nextElement=0;	
//	}
	

	
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
	
	
	//to increment array capacity
	final private void incrementCapacity() {
		int temp[]=data;
		data=new int[temp.length*(3/2)+1];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
	}
	
	//to remove an element
	public int removeLast() {
		int temp=data[nextElement-1];
		data[nextElement-1]=0;
		nextElement--;
		return temp;
	}
}
