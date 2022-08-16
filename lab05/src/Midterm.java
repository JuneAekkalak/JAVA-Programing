import java.util.Scanner;

public class Midterm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter N : ");
		int n = input.nextInt();
		System.out.printf("Enter M : ");
		int m = input.nextInt();
		
		int[] N = new int[n];
		int[] M = new int[m];
		
		for(int i = 0 ; i < N.length ; i++) {
			for(int j = 0 ; j < M.length ; j++) {
				System.out.println(" " + (i + 1));
			}
		}

	}

}
