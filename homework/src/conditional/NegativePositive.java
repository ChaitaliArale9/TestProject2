package conditional;
import java.util.Scanner;

public class NegativePositive {

	public static void main(String[] args) {
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enetr Number");
	 
	 int num= sc.nextInt();
	 
	 if(num==0)
	 {
		 System.out.println("Number is Zero");
	 }
	 else if(num>0)
	 {
		 System.out.println("Number is Positive");
	 }

	 else if(num<0)
	 {
		 System.out.println("Number is Negative");
	 }
	}

}
