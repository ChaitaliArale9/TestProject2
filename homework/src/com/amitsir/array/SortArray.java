package com.amitsir.array;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		int size;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr Array size");
		size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
		
		
		for(int i=0;i<size;i++) {
				System.out.println(" "+arr[i]);
			}
			//System.out.println(" ");

		
		Arrays.sort(arr);
		
		System.out.println("Sorted Array is" +Arrays.toString(arr));
	}

}
