package com.hefshine.constructor;

class Bank{
	int amount=5000;
	
	Bank(){
		//this.amount=amount;
System.out.println("Default ");
	}
	
	Bank(int addMoney){
		this.amount=addMoney;
	}
	
	float finalAmount() {
		int famount=amount+5000;
		return famount;
	}
}
public class AddAmount1 extends Bank{
	AddAmount1(){
		 super();

	}
	
	 AddAmount1(int add){
		 super(add);
 
	 }
	public static void main(String[] args) {
        AddAmount1 obj= new AddAmount1();
        System.out.println(obj);

        AddAmount1 obj1= new AddAmount1(1000);
      
        System.out.println(obj1.finalAmount());


		}

}
