import java.util.Scanner;
public class CalGPA {

	public static void main(String[] args) {
		char ch ;
		double gpa = 0;
		Scanner input = new Scanner(System.in);
		for(int i = 1 ; i < 6; i++) {
			System.out.print("Enter Grade no."+ i +": ");
			ch = input.next().charAt(0);
			if(ch == 'A') {
				gpa = gpa + 4 ;
			}
			else if  (ch == 'B'){
				gpa = gpa + 3 ;
			}
			else if (ch == 'C'){
				gpa = gpa + 2 ;
			}
			else if (ch == 'D'){
				gpa = gpa + 1 ;
			}
			else {
				gpa = gpa + 0;
			}
		}
		double sumGpa = gpa/5;
		System.out.println(" GPA : "+sumGpa);
	}
}

