package com.amitsir.complexpattern;

public class HwPattern1 {

	public static void main(String[] args) {
         int i,j,count=0;
         
         for(i=1;i<=3;i++) {
        	 for(j=1;j<=3;j++)
        	 {
        		 count=count+1;
        		 System.out.print(count);
        	 }
        	 System.out.println(" ");
         }
		
	}

}
