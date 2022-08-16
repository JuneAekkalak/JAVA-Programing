package lab05;
import java.util.Scanner;

public class Midterm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char ch ='y';
		while(ch == 'y') {
			int num = 1 ;
			System.out.printf("Enter N : ");
			int n = input.nextInt();
			System.out.printf("Enter M : ");
			int m = input.nextInt();
			System.out.printf("Matix %d x %d :\n",n , m);
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < m ; j++) {
					System.out.print(" " +num);
					if(j == m-1) {
						System.out.println("");
					}
					num++;
				}
			}
			System.out.print("Do you want to continue [y/n] : ");
			ch = input.next().charAt(0);
		}
		System.out.println("Bye Bye..");
	}
}
