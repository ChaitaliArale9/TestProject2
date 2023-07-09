package com.hefshine.array;
import java.util.Scanner;

//copy an array by iterating array
public class Hw4 {

	public static void main(String[] args) {
		int size;
         System.out.println("Enetr array Size");
         Scanner sc = new Scanner(System.in);
         size=sc.nextInt();
         int arr1[]= new int[size];
         int arr2[]= new int[size];
         System.out.println("Enter array Elements ");
         for(int i=0;i<size;i++) {
        	 arr1[i]=sc.nextInt();
        	 arr2[i]=arr1[i];
         }
         
    	 System.out.println("\nOriginal Array is");
         for(int i=0;i<size;i++) {
        	 System.out.print(" "+arr1[i]);
         }
         
    	 System.out.println("\nCopied array is");
         for(int i=0;i<size;i++) {
        	 System.out.print(" "+arr2[i]);
         }
	}

}
