package conditional;
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		System.out.println("Numbers are\n"+num1+"\n"+num2);
		if(num1>num2)
		{
			System.out.println(num1+" is Greater or Max");
		}
		else {
			System.out.println(num2+" is Minimum");
		}
		

	}

}
