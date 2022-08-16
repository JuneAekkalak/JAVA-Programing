package lab08;
public class GraduationCheck {
	public static void displayGraduation(Course[] c) {
		for(int i = 0 ; i < c.length ; i++ ) {
			System.out.print(""+c[i].toString());
			System.out.println("");
		}
	}
	public static void calGrad(Course[] gen , Course[] major) {
		double nGrade = 0 , sum1 = 0 ,sum2 = 0 , sumUnit1 = 0 , sumUnit2 = 0;
		for(int i = 0 ; i < gen.length ; i++) {
			if(gen[i].getGrade().equals("A")) nGrade = 4 ;
			else if (gen[i].getGrade().equals("B+")) nGrade = 3.5 ;
			else if (gen[i].getGrade().equals("B")) nGrade = 3 ;
			else if (gen[i].getGrade().equals("C+")) nGrade = 2.5 ;
			else if (gen[i].getGrade().equals("C")) nGrade = 2 ;
			else if (gen[i].getGrade().equals("D+")) nGrade = 1.5 ;
			else if (gen[i].getGrade().equals("D")) nGrade = 1 ; 
			else if (gen[i].getGrade().equals("F")) nGrade = 0 ;
			else continue ;
			double unit1 = gen[i].getUnit();
			sum1 += nGrade * unit1;
			sumUnit1 += unit1;
		}
		for(int i = 0 ; i < major.length ; i++) {
			if(major[i].getGrade().equals("A")) nGrade = 4 ;
			else if (major[i].getGrade().equals("B+")) nGrade = 3.5 ;
			else if (major[i].getGrade().equals("B")) nGrade = 3 ;
			else if (major[i].getGrade().equals("C+")) nGrade = 2.5 ;
			else if (major[i].getGrade().equals("C")) nGrade = 2 ;
			else if (major[i].getGrade().equals("D+")) nGrade = 1.5 ;
			else if (major[i].getGrade().equals("D")) nGrade = 1 ; 
			else if (major[i].getGrade().equals("F")) nGrade = 0 ;
			else continue ;
			double unit2 = major[i].getUnit();
			sum2 += nGrade * unit2;
			sumUnit2 += unit2;
		}
		double sumUnit = sumUnit1 + sumUnit2 ;
		double Gpa = (sum1+sum2)/sumUnit ;
		System.out.printf("GPA = %.2f" ,Gpa);
	}
	
	public static void main(String[] args) {		
		String[] Genid = {"GEN61-127" , "GEN61-152" , "GEN61-153"};
		int[] Genunit = {3 , 4 , 2};
		String[] Gengrad = {"C","D","C+"};
		String[] School = {"School of Liberal Arts" ,"School of Science","School of Science"};
		
		String[] Majorid = {"SWE62-123" , "SWE62-205" , "SWE62-214" ,"SWE62-215"};
		int[] Majorunit = {2, 3 , 3 , 2};
		String[] Majorgrad = {"W","F","C+","F"};
		int[] Majoryear = {1,2,2,2};
		
		int pass1 = 0  , pass2 = 0;
		Course[] gen = new GenEdCourse[3] ;
		for(int i = 0 ; i < gen.length ; i++) {
			gen[i] = new GenEdCourse(Genid[i],Genunit[i],Gengrad[i],School[i]);
			if(Gengrad[i] != "F" && Gengrad[i] != "W") {
				pass1 = pass1 + 1 ;
			}
		}
		Course[] major = new MajorCourse[4];
		for(int i = 0 ; i < major.length ; i++) {
			major[i] = new MajorCourse(Majorid[i] , Majorunit[i] , Majorgrad[i] , Majoryear[i]);
			if(Majorgrad[i] != "F" && Majorgrad[i] != "W") {
				pass2 = pass2 + 1 ;
			}
		}
		System.out.println("General Education Course :  ");
		displayGraduation(gen);
		System.out.println("Enroll: "+ gen.length + " Pass :  " + pass1);
		System.out.println("=================================");
		System.out.println("Major Course :  ");
		displayGraduation(major);
		System.out.println("Enroll: "+ major.length + " Pass :  " + pass2);
		System.out.println("=================================");
		System.out.println("Total enroll "+ (gen.length+major.length) 
				+ " courses; Pass "+ (pass1+pass2) +" courses");
		calGrad(gen , major);
	}
}
