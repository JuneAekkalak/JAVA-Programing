
public class Invoice implements Payable {
	private int amount ;
	
	public String toString() {
		return "Summary of amount for invoice = "+this.amount;
	}
	
	public int pay(int amount) {
		return this.amount += amount;
	}
	public int getAmount() {
		return this.amount ;
	}
}
