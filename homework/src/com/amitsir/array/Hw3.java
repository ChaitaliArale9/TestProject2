package com.amitsir.array;
import java.util.Scanner;

//sum of 3rd row in an array

public class Hw3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int arr[][]=new int[size][size];
		System.out.println("Enter Array Elemnts");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr[i][j]=sc.nextInt();

			}
		}
		
		for(int i=0;i<size;i++) {
			int sum=0;
			for(int j=0;j<size;j++) {
				System.out.print(" "+arr[i][j]);

			}
			System.out.println();

		}
		for(int i=0;i<size;i++) {
			int sum=0;
			for(int j=0;j<size;j++) {
				if(i==2)
				{
				 sum=sum+arr[i][j];
				}

			}
			System.out.println(" Array of "+i+"row is "+sum);


		}

	}

}
