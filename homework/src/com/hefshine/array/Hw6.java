package com.hefshine.array;
import java.util.Scanner;
public class Hw6 {

	public static void main(String[] args) {
		int size,temp;
		System.out.println("Enter Array size");
		Scanner sc= new Scanner(System.in);
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Array Element");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("\n----------------------------------------------------------");
		for(int i=0,j=size-1;i<j;i++,j--) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		for(int i=0;i<size;i++) {
		System.out.print(arr[i]+" ");
		}
		
	}

}
