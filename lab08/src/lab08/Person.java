package lab08;
import java.util.Calendar;
public class Person {
	protected String name; 
	protected int birthYear;
	
	public Person(String name , int year) {
		this.name = name;
		this.birthYear = year;
	}
	public int getAge() {
		int isyear = Calendar.getInstance().get(Calendar.YEAR);
		return isyear - this.birthYear - 543;
	}
	public String toString() {
		String ch = "";
		ch += "Name : "+ this.name + "\tBirth Year: " + this.birthYear + " Age : " +getAge();
		return ch;
	}
}
