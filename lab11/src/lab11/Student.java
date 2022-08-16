package lab11;
import java.util.ArrayList ;

public class Student {
	private String name , major , studentID;
	private ArrayList<Course> course ;
	
	public Student(String n,String m, String id) {
		this.name = n ;
		this.major = m ;
		this.studentID = id ;
	}
	public String toString() {
		return "ID:"+this.studentID+ " Name: "+this.name+" Major: "+this.major ;
	}
	public void enroll(ArrayList<Course> course) {
		this.course = course ;
	}
}
