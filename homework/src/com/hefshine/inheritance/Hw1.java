package com.hefshine.inheritance;

class Arithmetic{
	void calculate(int num1,int num2) {
		
	}
}

class Addition extends Arithmetic{
	void calculate(int num1,int num2) {
       int resul=num1+num2;
}
}

class Subtraction extends Arithmetic{
	void calculate(int num1,int num2) {
	       int resul=num1-num2;

	}
}

class Multiplication extends Arithmetic{
	void calculate(int num1,int num2) {
	       int resul=num1*num2;

	}
}

public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition add= new Addition();
		add.calculate(10, 20);
	    Multiplication obj1= new Multiplication();
	    obj1.calculate(30,2);

	}

}
