package com.amitsir.array;
import java.util.Scanner;

public class ItemUpadation {
	int item_id;
	String item_name;
	String item_domf;
	String item_doe;

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getItem_domf() {
		return item_domf;
	}

	public void setItem_domf(String item_domf) {
		this.item_domf = item_domf;
	}

	public String getItem_doe() {
		return item_doe;
	}

	public void setItem_doe(String item_doe) {
		this.item_doe = item_doe;
	}

	@Override
	public String toString() {
		return "ItemUpadation [Item Id= " + item_id + ", Item Name= " + item_name + ", Item Domf= " + item_domf
				+ ", Item Doe= " + item_doe + "]";
	}

	public static void main(String[] args) {

		int size;
		System.out.println("Enter Nof items");
		Scanner sc = new Scanner(System.in);
		size=sc.nextInt();
		ItemUpadation arr[]=new ItemUpadation [size];
		
		for(int i=0;i<size;i++) {
			arr[i]=new ItemUpadation();
		}
		
		System.out.println("Enetr info of items");
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter Item id");
			arr[i].item_id=sc.nextInt();
			System.out.println("Enetr Item Name");
			arr[i].item_name=sc.next();
			System.out.println("Enetr Item Manufacturing Date");
			arr[i].item_domf=sc.next();
			System.out.println("Enetr Item Expiry Date");
			arr[i].item_doe=sc.next();

		}
		
		for(int i=0; i<size; i++) {
			System.out.println(" "+arr[i]);
		}
		
		System.out.println("Enter Item Id  that you want to Update");
		int new_id;
		new_id=sc.nextInt();
		for(int i=0;i<size;i++) {
		if(arr[i].item_id==new_id) {
			System.out.println("Enter Item new Name");
			arr[i].item_name=sc.next();
			System.out.println("Enetr Item new Manufact. date");
			arr[i].item_domf=sc.next();
			System.out.println("Enetr Item new DOE");
			arr[i].item_doe=sc.next();
		}
		else {
			System.out.println("There is no Id found That You have entered");
			break;
		}
		
		}
		for(int i=0; i<size; i++) {
			System.out.println(" "+arr[i]);
		}
	}

}
