package com.hefshine.array;
import java.util.Scanner;

//element present or not in array
public class Hw2 {

	public static void main(String[] args) {
		int num=0,count=0;
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enetr array size");
	       int size=sc.nextInt();
	       int a[]= new int[size];
	       System.out.println("Enter array Element");
	       for(int i=0;i<size;i++) {
	    	   a[i]=sc.nextInt();
	    	

	       }
	       
	       for(int i=0;i<size;i++) {
	    	   System.out.print(" "+a[i]);

	       }
	       System.out.println("\nEnetr no to check wether it is present or not");
	         num=sc.nextInt();
	       for(int i=0;i<size;i++) {
	    	   if(a[i]==num) {
	    		   System.out.println(a[i]+" is present ");
	    		   count=1;
	    		   break;
	    	   }
	       }
	       
	       if(count==0) {
	    	   System.out.println("Not present");
	       }
     	   // System.out.println("not present");
	}

}
