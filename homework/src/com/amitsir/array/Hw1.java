package com.amitsir.array;
import java.util.Scanner;
//Read and Display 2D array

public class Hw1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter array size");
		int size=sc.nextInt();
		int arr[][]=new int[size][size];
		System.out.println("Enter Array Elemnts");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr[i][j]=sc.nextInt();

			}
		}
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(" "+arr[i][j]);

			}
			System.out.println();*/

		//}5

		
		
		
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array Elements");
		for(int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number to find values from array");
		int num=sc.nextInt();
		
		for(int i=0;i<size;i++) {
			if(arr[i]==num){
				System.out.println("number is "+arr[i]);
			}
			else {
				
				int temp=arr[i];
				for(int j=0;j<size;j++) {
			 if((temp*arr[j])==num) {
					System.out.println("Numbers are "+temp+"  "+arr[j]);
			 }
				}
			}
			}
		//System.out.println("Not found");
		
       
	}

}
