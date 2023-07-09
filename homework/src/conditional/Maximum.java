package conditional;

public class Maximum {

	public static void main(String[] args) {
		int a=10,b=40,c=20;
		if(a>b&&a>c)
		{
			System.out.println("Maximum number is\t"+a);
		}
		else if(b>a&&b>c)
		{
			System.out.println("Maximum number is\t"+b);
		}
		else
		{
			System.out.println("Maximum number is\t"+c);
		}
	}

}
