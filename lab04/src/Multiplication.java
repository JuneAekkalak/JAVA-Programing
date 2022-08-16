import java.util.Scanner;
public class Multiplication {
	
	public static void displayMul(int n) {
		for(int i=1; i<=12; i++){
            System.out.println(n+ "*" + i + " = " + n * i);  
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num ;
		char ch = 'y'; 
		while(ch == 'y') {
			System.out.print("Number [2 to 12] :");
			num = input.nextInt();
			while(num < 2 || num > 12) {
				System.out.println("Invalid data, please try again.");
				System.out.print("Number [2 to 12] :");
				num = input.nextInt();
			}
			displayMul(num);
			System.out.print("Do you want to continue [y/n] : ");
			ch = input.next().charAt(0);
		}
		System.out.println("Bye Bye !!");
	}
}
