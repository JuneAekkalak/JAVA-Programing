import java.util.Scanner;
public class NumberOfHour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number of seconds : ");
		int sec = input.nextInt();
		
		int h = sec / 3600;
		int m = (sec % 3600) / 60;
		int s = sec % 60;
		
		System.out.println(+sec + " seconds is approximately " + h + " hours," + m +" minute and " + s + " seconds ");

	}

}
