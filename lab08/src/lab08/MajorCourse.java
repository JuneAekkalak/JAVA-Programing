package lab08;

public class MajorCourse extends Course {
	protected int year ;
	
	public MajorCourse (String id , int u , String g , int y) {
		super(id , u , g);
		this.year = y ;
	}
	public String toString () {
		String ch = "";
		ch += super.toString() + "\tYear " + this.year;
		return ch;
	}
}
