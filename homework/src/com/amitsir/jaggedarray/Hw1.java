package com.amitsir.jaggedarray;

/*1
  2 2
  3 3 3
  4 4 4 4
  5 5 5 5 5
*/
public class Hw1 {

	public static void main(String[] args) {
		int arr[][] = new int[5][];
		arr[0]=new int[1];
		arr[1]=new int[2];
        arr[2]=new int[3];
		arr[3]=new int[4];
		arr[4]=new int[5];

		arr[0][0] = 1;

		arr[1][0] = 2;
		arr[1][1] = 2;

		arr[2][0] = 3;
		arr[2][1] = 3;
		arr[2][2] = 3;

		arr[3][0] = 4;
		arr[3][1] = 4;
		arr[3][2] = 4;
		arr[3][3] = 4;

		arr[4][0] = 5;
		arr[4][1] = 5;
		arr[4][2] = 5;
		arr[4][3] = 5;
		arr[4][4] = 5;

		// System.out.println(arr[5][5]);
		
		  for(int i=0;i<arr.length;i++) {
			  for(int j=0;j<arr[i].length;j++) {
		            System.out.print(arr[i][j]+" ");
		  
		  } 
			  System.out.println();
		  
		  }
		  
		  }

}
