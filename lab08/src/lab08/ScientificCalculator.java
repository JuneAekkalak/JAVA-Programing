package lab08;

public class ScientificCalculator extends Calculator {
	public ScientificCalculator () {
		
	}
	public int power () {
		return (int)Math.pow(this.x, this.y); 
	}
	public int mod () {
		return this.x % this.y ;
	}
}
