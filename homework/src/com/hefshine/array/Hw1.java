package com.hefshine.array;
import java.util.Scanner;
//to get index of element of array 

public class Hw1 {

	public static void main(String[] args) {
		int num=0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enetr array size");
       int size=sc.nextInt();
       //int num[]=new int[size];
       int a[]= new int[size];
       System.out.println("Enter array Element");
       for(int i=0;i<size;i++) {
    	   a[i]=sc.nextInt();
    	 //  num[i]=a[i];

       }
       
       for(int i=0;i<size;i++) {
    	   System.out.print(" "+a[i]);
    	 //  System.out.print("\n "+num[i]);

       }
       System.out.println("\nEnetr no which you want index of that no");
         num=sc.nextInt();
       for(int i=0;i<size;i++) {
    	   if(num==a[i]) {
    		   System.out.println(a[i]+" is at index "+i);
    	   }
       }
      // a[]
	}

}
