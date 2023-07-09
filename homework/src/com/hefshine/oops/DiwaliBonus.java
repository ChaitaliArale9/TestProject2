package com.hefshine.oops;
import java.util.Scanner;

public class DiwaliBonus {

	public static void main(String[] args) {
     int year;
     double salary,bonus;
     System.out.println("Enter Year\n");
     Scanner sc = new Scanner(System.in);
     year=sc.nextInt();
     System.out.println("Enter Salary");
     salary=sc.nextFloat();
     if(year>5)
     {
    	 bonus=salary*.35;
    	 System.out.println("Bonus is "+bonus);
     }
     else
     {
    	 bonus=salary*.15;
    	 System.out.println("Bonus is "+bonus);
     }
	}

}
