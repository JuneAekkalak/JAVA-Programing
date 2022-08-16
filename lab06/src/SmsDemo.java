import java.util.Scanner;
public class SmsDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of SMS: ");
		int n = input.nextInt();
		int i = 1;
		while(i <= n) {
			System.out.print(i+". SMS Number: ");
			SMS s = new SMS(input.next());
			System.out.print("SMS number "+i+" :");
			s.readAs();
			i++;
		}
		System.out.println("Bye Bye!!!");
	}
}
