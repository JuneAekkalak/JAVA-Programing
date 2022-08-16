package lab09;

public abstract class Shape {
	protected String color ;
	
	public abstract double getArea();
	public void setColor( String c ) {
		this.color = c ;
	}
	public String toString() {
		return "color : " + color ;
	}
}
