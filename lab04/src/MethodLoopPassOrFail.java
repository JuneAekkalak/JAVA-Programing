import java.util.Scanner;
public class MethodLoopPassOrFail {
	
	public static boolean PassOrFail(int s1,int s2,int s3) {
		 if (s1 >= 50 && s2 >= 50 && s3 >= 50 ) return true ; 
		 else return false ;
	}
	
	public static char getGrade(double avg) {
		if (avg >= 86) return 'A';
		else if (avg >= 66) return 'B';
		else return 'C';
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1,n2,n3 ; 
		double mean ;
		char ch = 'y' ; 
		
		while(ch == 'y') {
			System.out.print("Enter score 1 (1 - 100) : ");
			n1 = input.nextInt();
			System.out.print("Enter score 2 (1 - 100) : ");
			n2 = input.nextInt();
			System.out.print("Enter score 3 (1 - 100) : ");
			n3 = input.nextInt();
			if (PassOrFail(n1,n2,n3)) {
				mean = (n1 + n2 + n3) / 3;
				System.out.println("Mean = "+mean);
				System.out.println("Grad : " +getGrade(mean));
			}
			else System.out.println("Fail");
			System.out.print("Do you want to continue [y/n]: ");
			ch = input.next().charAt(0);
		}
		System.out.println("Bye Bye !!! ");
	}
}
