package com.hefshine.constructor;

 class AddAmount {
float amount=5000.0f;
	
AddAmount(){
		//this.amount=5000;
	System.out.println("Amount is not added");
	}
	
AddAmount(float add_money){
		//this.amount=amount;
		this.amount=add_money;
	}
	
	float finalAmount()
	{
		return amount=amount+5000;
	}
	

}
public class Hw2Bank  extends AddAmount{
	public static void main(String[] args) {
		AddAmount obj1 = new AddAmount();
		//System.out.println(obj1);
		AddAmount obj2 = new AddAmount(10000);
		//System.out.println(obj1);

		System.out.println(obj2.finalAmount());


	}

}
