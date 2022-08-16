import java.util.Scanner;
public class TestX {

	public static void main(String[] args) {
		double a = 8 , b =16 , c = 7 , d = 5;
		int x;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter X : ");
		x = input.nextInt();
		double z;
		if (x == 0) {
			z = (a/b) + (c / (2 * d));
		}
		else if(x % 2 == 0) {
			z = (Math.pow(a,2) + Math.pow(b, 2)) / Math.abs(a-b);
		}
		else {
			z = ((a/b) * c)+d;
		}
		System.out.println("Area = "+z);
		
	}

}
