import java.util.Scanner;
public class Grade {
	
	public static void printGrade(int[][] arr) {
		System.out.printf("Display Grade\n");
		System.out.printf("No.\tLab(30)\t\tAttend(5)\tMid(30)\t\tFinal(35) Total(100)\tGrade\n");
		for(int i = 0 ; i < arr.length ; i++) {
			int total = 0 ; 
			char ch = '\0';
			System.out.printf("%d", i+1);
			for(int j = 0 ; j < arr[0].length ; j++) {
				total += arr[i][j];
				if(total >= 80) ch = 'A';
				else if (total >= 70) ch = 'B';
				else if (total >= 60) ch = 'C';
				else if (total >= 50) ch = 'D';
				else ch = 'F';
				System.out.printf("\t%d\t",arr[i][j]);
			}
			System.out.printf("\t%d\t%c\t",total,ch);
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		final int COL = 4 ,ROW = 5 ; 
		int[][] grade = new int[ROW][COL];
		
		Scanner input = new Scanner (System.in);
		for(int i = 0 ; i < ROW ; i++) {
			for(int j = 0 ; j < COL ; j++) {
				System.out.printf("Enter score student No . %d :  ",i+1);
				grade[i][j] = input.nextInt();
			}
		}
		printGrade(grade);
	}
}
