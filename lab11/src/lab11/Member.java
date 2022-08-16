package lab11;

public class Member {
	private String name ;
	private String position ;
	private int age ;
	
	public Member(String n , String p , int a) {
		this.name = n ;
		this.position = p ;
		this.age = a ;
	}
	public String getName() {
		return this.name;
	}
	public String getPosition() {
		return this.position ;
	}
	public int getAge() {
		return this.age;
	}
	public void changePosition (String newPos) {
		this.position = newPos; 
	}
	public String toString() {
		return " "+this.name+" " +this.position+" Age : "+this.age;
	}


}
