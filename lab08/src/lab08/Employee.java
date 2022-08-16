package lab08;

public class Employee extends Person {
	protected boolean isMarried ;
	protected int salary ;
	public Employee (String n , int b , boolean i , int s) {
		super(n,b);
		this.isMarried = i ;
		this.salary = s ;
	}
	public String toString() {
		String ch = "", status = "";
		if(this.isMarried == true) status = "Single";
		else status = "married";
		ch += super.toString() + " Status : " + status + " Salary : " +this.salary;
		return ch;
	}
}
