package com.hefshine.arithmetic;

public class Marksheet {

	public static void main(String[] args) {
		int marathi,english,hindi,hist,maths,scie;
		float total,avg;
		marathi=70;
		english=75;
		hindi=80;
		hist=85;
		maths=90;
		scie=95;
		
		System.out.println("Marks is Out of 100=\nmarathi  "+marathi+"/100 \nenglish  "+english+"/100 \nhindi  "+hindi+"/100\nhist  "+hist+"/100 \nmaths  "+maths+"/100 \nscience  "+scie+"/100");
		total= marathi+english+hindi+hist+maths+scie;
		System.out.println("\nTotal Marks is ="+total);
		
		avg=(total/600)*100;
		System.out.println("\nAverage of 6 subject is ="+avg+"%");
		

	}

}
