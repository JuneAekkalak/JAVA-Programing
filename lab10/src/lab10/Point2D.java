package lab10;

public class Point2D implements Movable {
	private int x ,y ;
	public Point2D () {}
	public Point2D(int x , int y) {
		this.x = x ;
		this.y = y ;
	}
	public int getX() {
		return this.x ;
	}
	public int getY() {
		return this.y;
	}
	public void setX(int x) {
		this.x = x ;
	}
	public void setY(int y) {
		this.y = y ;
	}
	public String toString() {
		return "("+this.x + ","+this.y+ ") " ;
	}
	public void moveUp(int y) {
		this.y = this.y + y ; 
	}
	public void moveDown(int y) {
		this.y = this.y - y ;
	}
	public void moveLeft(int x) {
		this.x = this.x - x ;
	}
	public void moveRight(int x) {
		this.x = this.x + x ;
	}
}
