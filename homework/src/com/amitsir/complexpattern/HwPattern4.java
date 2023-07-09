package com.amitsir.complexpattern;

public class HwPattern4 {

	public static void main(String[] args) {
	     int i,j,count=0,sum=0; 
	     for(i=0;i<=3;i++) {
	    	 for(j=0;j<=3;j++)
	    	 {
	    		 count=count+1;
	    		 if(j==0) {
	    			 sum=sum+count;
	    		 }
	    		 System.out.print(count+" ");
	    	 }
	    	   System.out.println();
	       }
		   System.out.println("the value of sum "+sum);

	}

}
