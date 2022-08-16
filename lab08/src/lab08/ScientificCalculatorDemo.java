package lab08;
import java.util.Scanner;
public class ScientificCalculatorDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ScientificCalculator sci = new ScientificCalculator ();
		char yn = 'y';
		System.out.println("Welcoum to caculator program");
		System.out.println("[+,-,*,/,c,p,m] : ");
		while(yn == 'y') {
			double ans = 0.0 ;
			System.out.print("Enter x : ");
			int x = input.nextInt();
			System.out.print("Enter y : ");
			int y = input.nextInt();
			sci.setXY(x, y);
			System.out.print("select operation : ");
			char ch = input.next().charAt(0);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == 'm' || ch == 'p') {
				if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
					if(ch == '+') ans = sci.add();
					else if (ch == '-') ans = sci.subtract();
					else if (ch == '*') ans = sci.multiply();
					else if (ch == '/') ans = sci.divide();
					System.out.println("Answer of "+x+" "+ch + " "+y+" = "+(int)ans);
				}
				else {
					if (ch == 'p') {
						ans = sci.power();
						System.out.println("Answer of "+x+" ^ "+y+" = "+(int)ans);
					}
					else {
						ans = sci.mod();
						System.out.println("Answer of "+x+" % "+y+" = "+(int)ans);
					}
				}
				System.out.print("Do you want to continue [y/n]: ");
				yn = input.next().charAt(0);
			}
			else if (ch == 'c') sci.clear();
			else System.out.println("Invalid");
		}
		System.out.println("Bye Bye !!!");
	}
}

