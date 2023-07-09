package com.hefshine.oops;

public class PrimitiveToObject {

	public static void main(String[] args) {
		byte x=10;
		int i=20;
		short s=50;
		long l=70;
		
		char c='a';
		
		float f=30.0f;
		double d=40.0;
		boolean b=true;
		
		Byte byt= new Byte(x);
		Integer intobj=new Integer(i);
		Short shortobj=s;
		Long longobj=l;
		Character charobj=c;
		Float floatobject=f;
		Double doublobj=d;
		Boolean boolobj=b;
		
		System.out.println("Value of Objects");
		System.out.println("Byte= "+byt);
		System.out.println("Integer= "+intobj);
		System.out.println("Short= "+shortobj);
		System.out.println("Long= "+longobj);
		System.out.println("Character= "+charobj);
		System.out.println("Flaot= "+floatobject);
		System.out.println("Double= "+doublobj);
		System.out.println("Boolean= "+boolobj);

		


		
		// TODO Auto-generated method stub

	}

}
