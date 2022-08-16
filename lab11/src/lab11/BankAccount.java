package lab11;

public class BankAccount {
	private String accountNo ;
	private int balance ;
	private String name ;
	private Card card ;
	
	public BankAccount(String no,int balance, String name) {
		this.accountNo = no ;
		this.balance = balance ;
		this.name = name ;
	}
	public void deposit(int amount) {
		this.balance += + amount ;
	}
	public boolean withdrawn(int amount) {
		if(this.balance < amount) {
			return false ;
		}
		else  
			this.balance -= amount ;
			return true ; 
	}
	public Card getCard() {
		return this.card;
	}
	public void setCard(Card c) {
		this.card = c ;
	}
	public String toString() {
		return "Account No. "+this.accountNo+ " Name: "+this.name+" and Balance: "+this.balance+" Baht";
	}


}
