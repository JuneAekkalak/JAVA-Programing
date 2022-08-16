import java.util.Scanner;
public class TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a,b,c : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double s = 1/2.0*(a+b+c);
		double A = s*(s-a) * (s-b) * (s-c);
		double area = Math.sqrt(A);
		System.out.println("Area = "+area);
	}
}
