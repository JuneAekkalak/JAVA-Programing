package lab08;

public class GenEdCourse extends Course {
	protected String school ;
	
	public GenEdCourse (String id , int u , String g , String s) {
		super(id,u,g);
		this.school = s ;
	}
	public String toString() {
		String ch = "";
		ch += super.toString() + "\t" + this.school;
		return ch;
	}
}
