package conditional;
import java.util.Scanner;
public class PercentageGrade {

	public static void main(String[] args) {
		float total,average;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Subject Marks");
		 int sub1=sc.nextInt();
		 int sub2=sc.nextInt();
		 int sub3=sc.nextInt();
		 int sub4=sc.nextInt();
		 int sub5=sc.nextInt();

	  System.out.println("5 Subject Marks \n"+sub1+"\n"+sub2+"\n"+sub3+"\n"+sub4+"\n"+sub5);
	   
	  total = sub1+sub2+sub3+sub4+sub5;
	   System.out.println("Total is ="+total);

	   average=(total/500)*100;
	   System.out.println("Percentage is ="+average);

	   if(average<40)
	   {
		   System.out.println("Grade F");
	   }
	   else if(average>=40&&average<60)
	   {
		   System.out.println("Grade E");
	   }
	   else if(average>=60&&average<70)
	   {
		   System.out.println("Grade D");
	   }
	   else if(average>=70&&average<80)
	   {
		   System.out.println("Grade C");
	   }
	   else if(average>=80&&average<90)
	   {
		   System.out.println("Grade B");
	   }
	   else if(average>=90&&average<=100)
	   {
		   System.out.println("Grade A");
	   }
	  
	   
	   
	   
	   
	   
	}

}
