package com.amitsir.complexpattern;

public class HwPattern2 {

	public static void main(String[] args) {
     int i,j,count=0,sum=0; 
     for(i=1;i<=4;i++) {
    	 for(j=1;j<=4;j++)
    	 {
    		 count=count+1;
    		 if(i==1) {
    			 sum=sum+count;
    		 }
    		 System.out.print(count+" ");
    	 }
    	   System.out.println();
       }
	   System.out.println("the value of sum "+sum);
	}

}

