package com.hefshine.constructor;

public class Hw1 {
	int length,breadth;
	Hw1(){
		this.length=0;
		this.breadth=0;
	}
	
	Hw1(int area){
		this.length=area;
		this.breadth=area;
	}
	
	Hw1(int len,int breadth){
		this.length=len;
		this.breadth=breadth;
	}
	
	int calculate() {
		int area=length*breadth;
		System.out.println("area of rectangle ");
		return area;
	}

	public static void main(String[] args) {

		Hw1 obj1= new Hw1();
		Hw1 obj2= new Hw1(2);
		Hw1 obj3= new Hw1(2,4);
		System.out.println(obj1);
		System.out.println(obj2.calculate());
		System.out.println(obj3.calculate());

	}

	@Override
	public String toString() {
		return "Hw1 [length=" + length + ", breadth=" + breadth + "]";
	}

}
