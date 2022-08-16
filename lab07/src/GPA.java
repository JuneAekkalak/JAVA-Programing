import java.util.Scanner;
public class GPA {
	public static void displayCourses(Course[] obj) {
		System.out.printf("Course\t\tUnit\tGrade \n");
		for(int i = 0 ; i < obj.length ; i++ ) {
			System.out.print(""+obj[i].toString());
			System.out.println("");
		}
	}
	public static void calGpa(Course[] obj) {
		double nGrade = 0 , sum = 0 , sumUnit = 0 ;
		for(int i = 0 ; i < obj.length ; i++) {
			if (obj[i].getGrade().equals("A")) nGrade = 4 ;
			else if (obj[i].getGrade().equals("B+")) nGrade = 3.5 ;
			else if (obj[i].getGrade().equals("B")) nGrade = 3 ;
			else if (obj[i].getGrade().equals("C+")) nGrade = 2.5 ;
			else if (obj[i].getGrade().equals("C")) nGrade = 2 ;
			else if (obj[i].getGrade().equals("D+")) nGrade = 1.5 ;
			else if (obj[i].getGrade().equals("D")) nGrade = 1 ;
			else if (obj[i].getGrade().equals("F")) nGrade = 0 ;
			else continue ;
			double unit = obj[i].getUnit();
			sum += nGrade * unit;
			sumUnit += unit;
		}
		double Gpa = sum/sumUnit ;
		System.out.printf("GPA = %.2f" ,Gpa);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter of course: ");
		int n = input.nextInt();
		Course[] obj = new Course[n];
		for(int i = 0 ; i < obj.length ; i++) {
			System.out.print("Enter information of course no." + (i+1));
			obj[i] = new Course(input.next() , input.nextInt() , input.next());
		}
		System.out.println("You enroll " + n + " courses:");
		displayCourses(obj);
		calGpa(obj);
	}
}
