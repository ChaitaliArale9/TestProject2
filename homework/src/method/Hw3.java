package method;

public class Hw3 {

	int calculateSum(int num1,int num2) {
		return num1+num2;
	}

	int calculateDiff(int num1,int num2) {
		return num1-num2;
	}

	public static void main(String[] args) {

		Hw3 obj = new Hw3();
		System.out.println(obj.calculateSum(10, 20));
		System.out.println(obj.calculateDiff(40,10));
	}

}
