package conditional;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int num1,num2,result;
		 int ch;
		Scanner sc= new Scanner(System.in);
		 System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		 System.out.println("\nEnetr your Choice");
		 ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Emetr Number");
			num1=sc.nextInt();
			num2=sc.nextInt();
			
			result=num1+num2;
			System.out.println("Addition is "+result);
			break;
			
		case 2:
			System.out.println("Emetr Number");
			num1=sc.nextInt();
			num2=sc.nextInt();
			
			result=num1-num2;
			System.out.println("Subtraction is "+result);
			break;

		case 3:
			System.out.println("Emetr Number");
			num1=sc.nextInt();
			num2=sc.nextInt();
			
			result=num1*num2;
			System.out.println("Multiplication is "+result);
			break;

		case 4:
			System.out.println("Emetr Number");
			num1=sc.nextInt();
			num2=sc.nextInt();
			
			result=num1/num2;
			System.out.println("Division is "+result);
			break;
			
			default:
				System.out.println("Invalid");

		}
		
	}

}
