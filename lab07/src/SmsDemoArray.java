import java.util.Scanner;
public class SmsDemoArray {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of SMS: ");
		int n = input.nextInt();
		SMS[] number = new SMS[n];
		for(int i = 0 ; i < n ; i++ ) {
			System.out.print(i+1 + ". SMS Number: ");
			number[i] = new SMS(input.next());
		} 
		System.out.println("================================");
		for(int i = 0 ; i < n ; i++ ) {
			System.out.println("SMS Number " + (i+1) + " :");
			number[i].readAs();
		}
		System.out.println("================================");
		SMS.printDigit();
		System.out.println("Bye Bye !!!");
	}
}
