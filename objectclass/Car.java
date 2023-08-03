package com.jsp.objectclass;
import java.util.Objects;

public class Car {
	
	String brand;
	String name;
	double price;
	
	public Car(String brand,String name,double price) {
		this.brand=brand;
		this.name=name;
		this.price=price;
	}
	
	@Override
	public String toString() {
		return brand+" is car brand " +  name+" is car name "+price+" is car price";
	}
	
	@Override
	public boolean equals(Object obj) {
		Car c=(Car)obj;
		
		if(this.brand==c.brand && this.name==c.name && this.price==c.price) {
			return true;
		}else {
			return false;
		}
		
	}
	@Override
	public int hashCode(){
		return Objects.hash(brand,name,price);
	}

}
