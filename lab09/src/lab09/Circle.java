package lab09;

public class Circle extends Shape {
	protected int radius ;
	
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
}
