package com.hefshine.array;
import java.util.Scanner;

public class Hw7 {

	public static void main(String[] args) {
			int size,temp,flag;
			System.out.println("Enter Array Size");
			Scanner sc=new Scanner(System.in);
			size=sc.nextInt();
			int arr[]=new int[size];
			
			System.out.println("Enter Array Element");
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			
			for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
			}
			System.out.println("\n======================================");
			for(int i=0;i<size-1;i++) {
				flag=0;
				for(int j=0;j<size-1-i;j++) {
				    if(arr[j]>arr[j+1]) {
					   temp=arr[j];
					   arr[j]=arr[j+1];
					   arr[j+1]=temp;
					   flag=1;
				    }
				}
				// System.out.print(arr[i]+" ");
				 if(flag==0) {
					 break;
				 }
			}
			System.out.println("sorted array is");
			for(int i=0;i<size;i++) {
				System.out.print(arr[i]+" ");
			}
	}

}
