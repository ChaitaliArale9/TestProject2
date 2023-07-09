package com.hefshine.iteration;

public class Pattern {
	/*9 8 7 
	6 5 4
	3 2 1*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int i,j,count=0;
    for (i=1;i<=3;i++)
    {
    	for(j=1;j<=3;j++) {
    		count++;

    		System.out.print(count);
    	}
    	System.out.println(" ");
    }
	}

}
