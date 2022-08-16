import java.util.Scanner;
public class NPerLine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1 ,n2,col, l =0 ;
		
		System.out.print("Enter n1 : ");
		n1 = input.nextInt();
		System.out.print("Enter n2 : ");
		n2 = input.nextInt();
		System.out.print("Enter col : ");
		col = input.nextInt();
		
		for(int i = n1 ; i <= n2; i++) {
			l = l + 1 ;
			System.out.print(i + "\t");
			if(l == col) {
				System.out.println("");
				l = 0;
			}
		}
	}

}