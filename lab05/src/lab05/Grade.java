package lab05;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		final int COL = 4 ,ROW = 4 ; 
		int[][] grade = new int[ROW][COL];
		double[] avg = new double[ROW] ;
		int sum = 0;
		Scanner input = new Scanner (System.in);
		for(int i = 0 ; i < COL ; i++) {
			for(int j = 0 ; j < ROW ; j++) {
				System.out.printf("Enter score . :  ");
				grade[i][j] = input.nextInt();
				
			}
		}
		for(int i = 0 ; i < grade.length; i++) {
			for(int j = 0 ; j < grade[0].length ; j++) {
				sum = sum + grade[i][j];
				avg[i] = (double)sum/4;
			}
		}
		System.out.print("Display data \n");
		System.out.printf("No .");
		System.out.printf("LAB(30) " );
		System.out.printf("Attend (5)  ");
		System.out.printf("Mid(30)  ");
		System.out.printf("Final (35) \n");
		for(int i = 0 ; i < grade.length ; i++) {
			System.out.printf("%d", i+1);
			for(int j = 0 ; j < grade.length ; j++) {
				System.out.printf("\t %d \t",grade[i][j]);
			}
			System.out.printf("%.2f", avg[i]);
			System.out.println("");
		}
		System.out.println("Lab(30)=====Attend(5)======Mid(30)=====Final(35)");
		for(int i = 0 ; i < avg.length ; i++) {
			System.out.printf("%.2f \t\t",avg[i] );
		}
	}
}
