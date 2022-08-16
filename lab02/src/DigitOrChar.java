import java.util.Scanner;
public class DigitOrChar {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number ;
		
		System.out.print("Enter integer : ");
		number  = input.nextInt();
		
		if (number > 9) {
			number = number + 55 ;
			System.out.println("Charactor is : "+(char) number);
		}
		else {
			System.out.println("Digit is : " + number );
		}
	}
}