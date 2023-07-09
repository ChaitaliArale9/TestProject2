package com.amitsir.jaggedarray;
/* 1 1 1 1 1
 * 2 2 2 2 2
 * 3 3 3 3 3
 * 4 4 4 4 4
 * 5 5 5 5 5 
 */

public class Hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[5][5];
		
		arr[0][0]=1;
		arr[0][1]=1;
		arr[0][2]=1;
		arr[0][3]=1;
		arr[0][4]=1;
	
		arr[1][0]=2;
		arr[1][1]=2;
		arr[1][2]=2;
		arr[1][3]=2;
		arr[1][4]=2;

		arr[2][0]=3;
		arr[2][1]=3;
		arr[2][2]=3;
		arr[2][3]=3;
		arr[2][4]=3;

		arr[3][0]=4;
		arr[3][1]=4;
		arr[3][2]=4;
		arr[3][3]=4;
		arr[3][4]=4;

		arr[4][0]=5;
		arr[4][1]=5;
		arr[4][2]=5;
		arr[4][3]=5;
		arr[4][4]=5;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}

	}

}
