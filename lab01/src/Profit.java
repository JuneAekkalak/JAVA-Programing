import java.util.Scanner;
public class Profit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter cost Price: ");
		int cost = input.nextInt();
		
		int upPrice = cost+(cost * 80 / 100);
		
		System.out.println("Marked up price: "+ upPrice);
		
		int Onsale = upPrice * 10 / 100 ;
		int Sell = upPrice - Onsale ;
		int Profit = Sell - cost;
		System.out.println("Selling price: " + Sell );
		System.out.println("Profit : " + Profit);
	}

}
