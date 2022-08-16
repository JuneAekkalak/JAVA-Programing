import java.util.Scanner;
public class TestCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calculator cal = new Calculator();
		char yn = 'y';
		System.out.println("Welcoum to caculator program");
		while(yn == 'y') {
			double ans = 0.0 ;
			System.out.print("Enter x : ");
			int x = input.nextInt();
			System.out.print("Enter y : ");
			int y = input.nextInt();
			cal.setXY(x, y);
			
			System.out.print("select operation [+,-,*,/,c] : ");
			char ch = input.next().charAt(0);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				if(ch == '+') ans = cal.add();
				else if (ch == '-') ans = cal.subtract();
				else if (ch == '*') ans = cal.multiply();
				else ans = cal.divide();
				
				System.out.println("Answer of "+x+" "+ch + " "+y+" = "+(int)ans);
				System.out.print("Do you want to continue [y/n]: ");
				yn = input.next().charAt(0);
			}
			else if (ch == 'c') cal.clear();
			else System.out.println("Invalid");
		}
		System.out.println("Bye Bye !!!");
	}
}
