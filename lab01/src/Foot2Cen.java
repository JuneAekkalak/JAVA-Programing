import java.util.Scanner;
public class Foot2Cen {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter feet and inch: ");
		int feet = in.nextInt();
		int inch = in.nextInt();
		System.out.println("You are " + feet + " feet ," + inch + " inches tall. ");
		
		int TotalInch = (feet * 12) + inch;
		System.out.println("Total inches: " + TotalInch);
		
		double cm = TotalInch * 2.54;
		System.out.println("Total centimeter: " + cm + "cm");
	}

}
