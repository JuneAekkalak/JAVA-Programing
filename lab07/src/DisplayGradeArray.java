import java.util.Scanner;
public class DisplayGradeArray {
	public static void display(Score[] score) {
		System.out.println("Display Grade");
		System.out.printf("No.\tLab(30)\t\tAttend(5)\tMid(30)\t\tFinal(35) \tTotal(100)\tGrade\n");
		for(int i = 0 ; i < score.length ; i++ ) {
			score[i].setGrade();
			System.out.print(i+1 + "\t "+score[i].toString() );
			System.out.println("");
		}
	}
	public static int[] calGradeSummary(Score[] score) {
		int[] sumGrade = new int[score.length];
		for(int i = 0 ; i < score.length ; i++) {
			if(score[i].grade == 'A') sumGrade[0]++;
			else if(score[i].grade == 'B') sumGrade[1]++;
			else if(score[i].grade == 'C') sumGrade[2]++;
			else if(score[i].grade == 'D') sumGrade[3]++;
			else sumGrade[4]++;
		}
		return sumGrade;
	}
	public static void displayGradeSummary(int[] freq) {
		String[] ch = {"A" , "B" , "C" , "D" , "F"};
		System.out.println("Grade Summary");
		for(int i = 0 ; i < freq.length; i++) {
			if(freq[i] != 0) {
				System.out.print(ch[i]+ "\t");
					for(int j = 0 ; j < freq[i] ; j++) {
						System.out.print("*");
					}
				System.out.println("");
			}
			else continue;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Score[] score = new Score[5];
		for(int i = 0 ; i < score.length ; i++ ) {
			System.out.print("Student " + (i+1) + " Score is : ");
			score[i] = new Score(input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
		} 
		display(score);
		int[] freq = calGradeSummary(score);
		displayGradeSummary(freq);
	}
}
