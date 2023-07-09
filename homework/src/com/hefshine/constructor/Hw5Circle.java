package com.hefshine.constructor;

public class Hw5Circle {
	float pi=3.14f;
	 void calArea(float radius) {
		 System.out.println("Area of Circle : "+pi*radius*radius);
	 }
	 
	 void CalCircumference(float radius) {
		 System.out.println("Circumference of Circle : "+2*radius*radius);

	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hw5Circle obj = new Hw5Circle();
		obj.calArea(2);
		obj.CalCircumference(2);
	}

}
