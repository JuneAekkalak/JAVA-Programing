package lab10;

public class Circle extends Shape {
	protected double radius ;
	
	public Circle(int r) {
		super.setColor("Violet");
		this.radius = r ;
	}
	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}
	public double getCircumference () {
		return 2 * 3.14 * this.radius ;
	}
	public String toString() {
		return super.toString() + " radius : " + this.radius + " area : " + (int)this.getArea() + " Circumference: " + (int)this.getCircumference(); 
	}
	public int compareTo(Object obj) {
		if (this.getArea() > ((Circle)obj).getArea()) return 1;
		else if (this.getArea() < ((Circle)obj).getArea()) return -1;
		else return 0;
	} 
	public void resize(int percent ) {
		this.radius = (this.radius * percent) / 100 ;
	}
}
