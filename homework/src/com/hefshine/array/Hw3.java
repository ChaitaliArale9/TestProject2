package com.hefshine.array;
import java.util.Scanner;

//remove specific element from the array
public class Hw3 {

	public static void main(String[] args) {
		int size,count=0;
    System.out.println("Enter array size");
    Scanner sc= new Scanner(System.in);
    size=sc.nextInt();
    int a[]= new int[size];
    System.out.println("Enter array element");
    for(int i=0;i<size;i++) {
    	a[i]=sc.nextInt();
    }
    
    for(int i=0;i<size;i++) {
    	System.out.print(" "+a[i]);
    }
   
    System.out.println("\nEnter number to be deleted");
    int num=sc.nextInt();
    
    for(int i=0;i<size;i++) {
    	if(a[i]==num) {
           for(int j=i;j<size-1;j++) {
    	       a[j]=a[j+1];
            }
           count=1;
            break;
    		//a[i]=a[i]+1;
	    }
	}
    if(count==0) {
    	System.out.println("Element Not Found");
    }
    else {
         System.out.println("Element deleted successfully ----");
         for(int i=0;i<size-1;i++) {
    	    System.out.print(" "+a[i]);
    }
    }
  }
}