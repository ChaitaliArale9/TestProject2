package com.hefshine.iteration;
import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,temp,flag=0;
		System.out.println("Enetr Number");
		Scanner sc = new Scanner(System.in);
		 n=sc.nextInt();
		 temp=n/2;
		 if(n==0||n==1) {
			 System.out.println("Number is not Prime");
		 }
		 else {
			 for(i=2;i<=temp;i++) {
				 if(n%i==0) {
					 System.out.println(n+" is not prime");
					 flag=1;
					 break;
				 }
			 }
			 if(flag==0) {
				 System.out.println(n+" Is prime number");
			 }
		 }

	}

}
