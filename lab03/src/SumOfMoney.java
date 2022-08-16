import java.util.Scanner;
public class SumOfMoney {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double bath,sum = 0;
		
		System.out.print("Enter numbers [Exit press number <=0 ] : ");
		bath = input.nextDouble();
		while(bath > 0) {
			System.out.println( bath + "nearest Integer " + (int)(bath = Math.round(bath)));
			sum = sum + bath;
			bath = input.nextDouble();
		}
		System.out.print("Summary is " + (int)sum);
	}
}
