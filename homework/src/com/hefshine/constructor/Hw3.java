package com.hefshine.constructor;

public class Hw3 {
	String var;
 Hw3() {
	System.out.println("In Want to Learn Language");
}
  Hw3(String s) {
	  this.var=s;

}
	@Override
public String toString() {
	return  var  ;
}
	public static void main(String[] args) {
		//Hw3 obj=new Hw3();
		Hw3 obj1=new Hw3("Java");

		System.out.println("In Want to Learn "+obj1.toString());
	}

}
