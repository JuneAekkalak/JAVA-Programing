import java.util.Scanner;
public class CountNoOfGrade {
	
	public static void printChar(int n) {
		for(int i = 0 ; i< n ; i++) {
			System.out.printf("*");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 5 ,count;
		char ch ;
		int[] grade = new int[n];
		System.out.printf("Enter number of student : ");
		count = input.nextInt();
		for(int i = 1 ; i <= count ; i++) {
			System.out.printf("Enter grade of student %d: ", i);
			ch = input.next().charAt(0);
			if (ch == 'A') grade[0]++;
			else if (ch == 'B') grade[1]++;
			else if (ch == 'C') grade[2]++;
			else if (ch == 'D') grade[3]++;
			else grade[4]++;
		}
		System.out.printf("Grade summary \n");
		System.out.print("A ");
		printChar(grade[0]);
		System.out.print("B ");
		printChar(grade[1]);
		System.out.print("C ");
		printChar(grade[2]);
		System.out.print("D ");
		printChar(grade[3]);
		System.out.print("F ");
		printChar(grade[4]);
	}
}
