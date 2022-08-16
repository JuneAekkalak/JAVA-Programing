
public class Course {
	String courseID ;
	int unit ;
	String grade ;
	public Course () {
		
	}
	public Course (String id , int u , String g) {
		this.courseID = id;
		this.unit = u;
		this.grade = g;
	}
	public int getUnit () {
		return this.unit;
	}
	public String getGrade () {
		return this.grade;
	}
	public String toString () {
		String ch = "";
		ch += this.courseID + "\t" + this.unit + "\t " + this.grade;
		return ch;
	}
}
