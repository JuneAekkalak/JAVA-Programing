import java.util.Scanner;
public class MethodCalGPA {
	
	public static char grading(int n) {
		char ch ;
		if(n >= 80 ) ch = 'A';
		else if  (n >= 70) ch = 'B';
		else if (n >= 60) ch = 'C';
		else if (n >= 50) ch = 'D';
		else ch = 'F';
		return ch ;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch ;
		double gpa = 0 ,unit,sumunit = 0;
		int num , n , score,grad ;
		System.out.print("Enter number of subject : ");
		num = input.nextInt();
		for (int i = 1;i<=num;i++) {
			System.out.print("Enter Score of subject "+ i + ": ");
			score = input.nextInt();
			System.out.print("Enter course unit : ");
			unit = input.nextDouble();
			ch = grading(score);
			System.out.println("Grade : " + ch);
			if (ch == 'A') grad = 4;
			else if (ch == 'B') grad = 3;
			else if (ch == 'C') grad = 2;
			else if (ch == 'D') grad = 1;
			else grad = 0;
			sumunit = sumunit + unit;
			gpa = gpa + (grad*unit); 
		}
		gpa = gpa/sumunit;
		System.out.printf("GPA : %.2f " ,gpa);
	}
}
