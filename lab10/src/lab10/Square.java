package lab10;

public class Square extends Shape{
	protected int width ; 
	
	public Square (int w ) {
		super.setColor("Orange");
		this.width = w;
	}
	public double getArea() {
		return this.width * this.width ;
	}
	public double getPerimeter() {
		return 4 * this.width ;
	}
	public String toString() {
		return super.toString() + " width : " + this.width + " area : " + (int)this.getArea() + " Perimeter: " + (int)this.getPerimeter() ; 
	}
	public int compareTo(Object obj) {
		if (this.getArea() > ((Square)obj).getArea()) return 1;
		else if (this.getArea() < ((Square)obj).getArea()) return -1;
		else return 0;
	} 
	public void resize(int percent ) {
		this.width = (this.width * percent) / 100 ;
	}
}
