package com.hefshine.inheritance;

public class Hw3Final {
	final float pi=3.14f;
	
	final float circle_area(float radius) {
		 return pi*radius*radius;
	}

	public static void main(String[] args) {

		Hw3Final obj = new Hw3Final();
		System.out.println(obj.circle_area(2));
	}

}
