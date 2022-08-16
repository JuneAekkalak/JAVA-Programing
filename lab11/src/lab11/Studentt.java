package lab11;

public class Studentt {
	private String name ;
	private String studentID ;
	private String major ;
	private Card card ;
	public Studentt(String n,String id,String m) {
		this.name = n ;
		this.studentID = id ;
		this.major = m ;
	}
	public Card getCard() {
		return this.card;
	}
	public void setCard(Card c) {
		this.card = c ;
	}
	public String toString() {
		return "ID: "+this.studentID+" Name: "+this.name+" Major: "+this.major;
	}

}
