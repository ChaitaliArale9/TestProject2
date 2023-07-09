package com.hefshine.abstrct;
import java.util.Scanner;

interface VotingApp{
	
	public void registerUser(); 
    public void requestVotingNumber(); 
		
}
 class Kids implements VotingApp{
	 int age;
	 String fname,lname;
	@Override
	public void registerUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr First Name ");
		fname=sc.next();
		System.out.println("Enetr Last Name");
		lname=sc.next();
		System.out.println("Eneter Age of the Candidate");
		age=sc.nextInt();
		
		if(age<12) {
			System.out.println("You have successfully registered under kids");
			
		}
		else {
			System.out.println("You have not successfully registered");
		}
		
	}

	@Override
	public void requestVotingNumber() {
		if(age<12) {
			System.out.println("Sorry cannot go for voting B'coz age must be greater than 12 to vote");
		}
		
	}
}
 
 class Adult implements VotingApp{
	 int age;
	 String fname,lname;

	@Override
	public void registerUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr First Name ");
		fname=sc.next();
		System.out.println("Enetr Last Name");
		lname=sc.next();
		System.out.println("Eneter Age of the Candidate");
		age=sc.nextInt();

		if(age>12) {
			System.out.println("You have successfully registered under an Adult");
		}
		else {
			System.out.println("You have not successfully registered under an Adult");
		}
	}

	@Override
	public void requestVotingNumber() {
    if(age>12) {
    	System.out.println("Your voting Id will be generated within a day");
    }
    else {
    	System.out.println("Oops you are not");
    }
	}
	 
 }
public class Hw1VotingApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    VotingApp kid= new Kids();
    kid.registerUser();
    kid.requestVotingNumber();
    
    VotingApp adult = new Adult();
    adult.registerUser();
    adult.requestVotingNumber();
	}

}
