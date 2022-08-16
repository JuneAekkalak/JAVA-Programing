package lab09;
public class Student extends Person {
	protected String studentID;
	protected String major;
	public Student (String n , int b , String id , String m) {
		super(n,b);
		this.studentID = id ;
		this.major = m ;
	}
	public String toString() {
		String ch = "";
		ch += super.toString() + " Student Id: " + this.studentID + " Major: " + this.major;
		return ch;
	}
}
