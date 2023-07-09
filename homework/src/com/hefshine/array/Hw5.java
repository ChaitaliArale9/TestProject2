package com.hefshine.array;
import java.util.Scanner;
//Reverse of Array
public class Hw5 {

	public static void main(String[] args) {
		int size;
		System.out.println("Enetr Array size");
		Scanner sc = new Scanner(System.in);
		size=sc.nextInt();
		int arr[]=new int[size];
		//int arr2[]=new int[size];
		System.out.println("Enter Array Element");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array is");
		for(int i=0;i<size;i++) {
			System.out.print(" "+arr[i]);
		}
		
		System.out.println("\n===============================================");
		System.out.println("\nReversed Array is");
		for(int i=size-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
