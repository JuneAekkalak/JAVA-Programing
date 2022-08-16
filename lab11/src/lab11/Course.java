package lab11;

public class Course {
	private String courseID , grade ;
	private int unit ; 
	
	public Course() {
		
	}
	public Course(String id,int u,String g) {
		this.courseID = id ;
		this.unit = u ;
		this.grade = g ;
	}
	public int getUnit() {
		return this.unit ;
	}
	public String getGrade() {
		return this.grade ;
	}
	public String toString() {
		return " \t" + this.courseID + " \t"+this.unit+ " \t" + this.grade ;
	}
}
