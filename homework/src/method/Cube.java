package method;
import java.util.Scanner;


public class Cube {
 int volume,side;
void calculateVolume() {
	int volume= side*side*side;
}
	public static void main(String[] args) {
		Cube cube=new Cube();
		Scanner sc=new Scanner(System.in);
		cube.side=sc.nextInt();

	}

}
