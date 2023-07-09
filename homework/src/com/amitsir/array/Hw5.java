package com.amitsir.array;
import java.util.Scanner;

public class Hw5 {

	public static void main(String[] args) {
		int size;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter array size");
     size=sc.nextInt();
     int arr[][]=new int [size][size];
     System.out.println("Enter Array Elemnt");
     for(int i=0;i<size;i++) {
    	 for(int j=0;j<size;j++) {
    		 arr[i][j]=sc.nextInt();
    	 }
     }
     for(int i=0;i<size;i++) {
    	 for(int j=0;j<size;j++) {
    		 System.out.print(" "+arr[i][j]);
    	 }
    	 System.out.println(" ");
     }
     
    int sum=0;
     for(int i=0;i<size;i++) {
    	 for(int j=0;j<size;j++) {
    		 if((i+j==size-1)) {
    			sum=sum+arr[i][j]; 
    		 }
    	 }

     }
     System.out.println("sum of right diagonal "+sum);
     
	}

}
