package lab11;
import java.util.Scanner;
public class ATMOperation {

	public static void main(String[] args) {
		Studentt student = new Studentt("AAA","60100000","SWE");
		Card card = new Card("5648",'D',"1234");
		BankAccount account = new BankAccount("828 4561 256",5000,"AAA");
		System.out.println("Student, Card and Bank info ");
		System.out.println(student.toString() +"\n" +card.toString()+"\n"+account.toString());
		Scanner input = new Scanner (System.in);
		System.out.println("Welcome to ATM Program");
		System.out.println("Please enter card no and pin: ");
		String cNo = input.next();
		String pNo = input.next();
		if(card.isValid(cNo, pNo)) {
			System.out.println(account.toString());
			char yn = 'y';
			while(yn == 'y') {
				System.out.print("Please select menu [D/W]:");
				char ch = input.next().charAt(0);
				System.out.print("Amount: ");
				int money = input.nextInt();
				if(ch == 'D') {
					account.deposit(money);
					System.out.println(account.toString());
				}
				else {
					if(account.withdrawn(money)) {
						System.out.println(account.toString());
					}
					else System.out.println("Cannot withdrawn");
				}
				System.out.print("Do you want to continue [y/n] ");
				yn = input.next().charAt(0);
			}
			System.out.println("Bye Bye !!");
		}
		else {
			System.out.println("Invalid card or pin "); 
			System.out.println("Bye Bye !!");
			System.exit(0);
		}
	}
}
