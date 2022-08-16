public class Calculator {
	public int x ;
	public int y ;
	public Calculator() {
		
	}
	public void setXY(int x , int y) {
		this.x = x;
		this.y = y;
	}
	public void clear() {
		this.x = 0 ;
		this.y = 0 ;
	}
	public int add() {
		return this.x + this.y;
	}
	public int subtract() {
		return this.x-this.y;
	}
	public double divide () {
		return this.x / this.y;
	}
	public int multiply () {
		return this.x * this.y;
	}
}
