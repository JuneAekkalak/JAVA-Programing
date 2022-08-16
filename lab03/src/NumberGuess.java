import java.util.Scanner;
public class NumberGuess {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numBer,i=0;
		int secretNumber = (int)(Math.random()*100);
		
		System.out.println("random = "+ secretNumber);
		System.out.print("Key in your guess number: ");
		
		do {
			numBer = input.nextInt();
			i += 1;
			if(numBer > secretNumber) {
				System.out.println("Try lower");
			}
			else if (numBer < secretNumber) {
				System.out.println("Try higher");
			}
			else {
				System.out.println("Congratulation!" + secretNumber + " is Secret Number");
				System.out.println("You got it in " + i + " trials!");
			}
		}while(numBer != secretNumber);
	}

}
