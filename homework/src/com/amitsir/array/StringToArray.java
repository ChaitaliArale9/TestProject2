package com.amitsir.array;

public class StringToArray {

	public static void main(String[] args) {
       String s1 = new String("ABCDEF");
       //System.out.println(s1);
       char arr[]=s1.toCharArray();
       
       for(int i=0;i<arr.length;i++) {
    	   System.out.print(arr[i]);
       }
       for(int i=0;i<arr.length;i++) {
    	   if(i%2!=0) {
    		   System.out.println("\nindex at "+i+" char is "+arr[i]);
    	   }
       }
	}

}
