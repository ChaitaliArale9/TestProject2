package com.amitsir.jaggedarray;
/* 1  2  3  4  5
 * 6  7  8  9  10
 * 11 12 13 14 15
 * 16 17 18 19 20
 */

public class Hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int count=0;
		int arr[][]=new int[4][5];
		
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[0][3]=4;
		arr[0][4]=5;

		arr[1][0]=6;
		arr[1][1]=7;
		arr[1][2]=8;
		arr[1][3]=9;
		arr[1][4]=10;

		arr[2][0]=11;
		arr[2][1]=12;
		arr[2][2]=13;
		arr[2][3]=14;
		arr[2][4]=15;

		arr[3][0]=16;
		arr[3][1]=17;
		arr[3][2]=18;
		arr[3][3]=19;
		arr[3][4]=20;
		


		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
			//	count=count+1;
				//arr[i][j];
				System.out.print(" "+arr[i][j]);
				//System.out.print(" "+count);

			}
			System.out.println();
		}

	}

}
