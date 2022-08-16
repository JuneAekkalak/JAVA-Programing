package lab11;
import java.util.Scanner ;

import java.util.ArrayList;
public class GradePrediciton {
	public static double calGPA(ArrayList <Course> o) {
		double nGrade = 0 , sum = 0, sumUnit = 0 ;
		for(int i = 0 ; i < o.size() ; i++) {
			if(o.get(i).getGrade().equals("A")) nGrade = 4 ;
			else if (o.get(i).getGrade().equals("B+")) nGrade = 3.5 ;
			else if (o.get(i).getGrade().equals("B")) nGrade = 3 ;
			else if (o.get(i).getGrade().equals("C+")) nGrade = 2.5 ;
			else if (o.get(i).getGrade().equals("C")) nGrade = 2 ;
			else if (o.get(i).getGrade().equals("D+")) nGrade = 1.5 ;
			else if (o.get(i).getGrade().equals("D")) nGrade = 1 ; 
			else if (o.get(i).getGrade().equals("F")) nGrade = 0 ;
			else continue ;
			sum += nGrade * o.get(i).getUnit();
			sumUnit += o.get(i).getUnit();
		}
		return sum/sumUnit ;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] subject = {"SWE62-202" , "SWE62-205 " ,"SWE62-211 " , "SWE62-212 " ,"SWE62-213 " ,"SWE62-231"};
		int [] unit = {2 , 3 , 4 , 3 , 3 , 2};
		System.out.println("Welcome to SWE Grade Prediction");
		System.out.println("Course list in 1/64 ");
		for(int i = 0 ; i < subject.length ; i++) {
			System.out.println(i+1 + ". " +subject[i]+ "\t " +unit[i]);
		}
		System.out.print("Please enter number of course [1-6]: ");
		int num = input.nextInt();
		System.out.print("Please select " + num +" courses: ");
		int[] idx = new int[num];
		for(int i = 0 ; i < idx.length  ; i++) {
			idx[i] = input.nextInt();
		}
		System.out.print("Please enter grade of "+num+ " courses: ");
		String[] grade = new String[num];
		for(int i = 0 ; i < grade.length  ; i++) {
			grade[i] = input.next();
		}
		Student enroll = new Student("AAA", "SWE" ,"60100000");
		ArrayList<Course> course = new ArrayList<Course> ();
		
		for(int i = 0 ; i < idx.length ; i++) {
			course.add(new Course(subject[idx[i]-1] , unit[idx[i]-1] , grade[i]));
		}
		System.out.println("===========================");
		enroll.enroll(course);
		System.out.println(""+enroll.toString() + " enrolls "+num+ " courses in 1/64");
		System.out.println("No.  \t ID \t\tUnit  \tGrade");
		for(int i = 0 ; i < course.size() ; i++) {
			System.out.println(i+1+ ". " +course.get(i).toString());
		}
		System.out.println("GPA : "+calGPA(course));
	}
}
