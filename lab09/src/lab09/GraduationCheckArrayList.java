package lab09;
import java.util.ArrayList;
public class GraduationCheckArrayList {
	public static void displayGraduation(ArrayList <Course> c) {
		int pass1 = 0  , pass2 = 0 , size1 = 0 , size2 = 0;
		System.out.println("General Education Course :  ");
		for(int i = 0 ; i < c.size() ; i++) {
			if(c.get(i) instanceof GenEdCourse) {
				System.out.println(""+((GenEdCourse) c.get(i)).toString() );
				size1 += 1;
				if(((GenEdCourse) c.get(i)).getGrade() != "F" && ((GenEdCourse) c.get(i)).getGrade() != "W") pass1 = pass1 + 1 ;
			}
		}
		System.out.println("Enroll: "+ size1 + " Pass :  " + pass1);
		System.out.println("=================================");
		System.out.println("Major Course :  ");
		for(int i = 0 ; i < c.size() ; i++) {
			if(c.get(i) instanceof MajorCourse) {
				System.out.println(""+((MajorCourse) c.get(i)).toString() );
				size2 +=1;
				if(((MajorCourse) c.get(i)).getGrade() != "F" && ((MajorCourse) c.get(i)).getGrade() != "W") pass2 = pass2 + 1 ;
			}
		}
		System.out.println("Enroll: "+ size2 + " Pass :  " + pass2);
		System.out.println("=================================");
	}
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
		ArrayList <Course> course = new ArrayList <Course> ();
		course.add(new GenEdCourse("GEN61-127",3,"C","School of Liberal Arts"));
		course.add(new GenEdCourse("GEN61-152",4,"D","School of Science"));
		course.add(new GenEdCourse("GEN61-153",2,"C+","School of Science"));
		course.add(new MajorCourse("SWE62-123",2,"W",1));
		course.add(new MajorCourse("SWE62-205",3,"F",2));
		course.add(new MajorCourse("SWE62-214",3,"C+",2));
		course.add(new MajorCourse("SWE62-215",2,"F",2));
		displayGraduation(course);
		System.out.printf("GPA = %.2f" ,calGPA(course));
	}
}
