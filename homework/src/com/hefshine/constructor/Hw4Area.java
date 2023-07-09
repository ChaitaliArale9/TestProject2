package com.hefshine.constructor;
class Hw4ShapeCircle {
	 float pi;
	static float radius;

	Hw4ShapeCircle(float radius){
		this.radius= radius;
		
	}
	Hw4ShapeCircle(float radius,float pi){
		this(radius);
		this.pi=3.14f;
		this.radius=radius;
		System.out.println("2nd constructor radius : "+pi*radius*radius);
	}
	public Hw4ShapeCircle() {
		// TODO Auto-generated constructor stub
	}
}

public class Hw4Area extends Hw4ShapeCircle {
//    this();
	
	public static void main(String[] args) {
		//Hw4ShapeCircle obj= new Hw4ShapeCircle(4.0f);
		Hw4ShapeCircle obj1= new Hw4ShapeCircle(6.0f,3.14f);
		
		//System.out.println(obj);
		//System.out.println(obj1);


	}

}
