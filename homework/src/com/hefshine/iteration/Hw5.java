package com.hefshine.iteration;

public class Hw5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=16461,reverse=0,remainder,oriInt;
        oriInt=num;
        for(;num!=0;num/=10) {
        	remainder=num%10;
        	reverse=reverse*10*remainder;
        }
        if(oriInt==reverse) {
        	System.out.println(oriInt+"is a palindrome");
        }
        else {
        	System.out.println(oriInt+"is not a palindrome");

        }
	}

}
