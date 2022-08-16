import java.util.Scanner;
public class CalRect {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int perimeter , area ;

		System.out.print("Enter length (inches): ");
		int length = input.nextInt();
		System.out.print("Enter width : ");
		int width = input.nextInt();
	
		area = length * width;
		perimeter = 2 * (length + width);
	
		System.out.println("Perimeter : " +perimeter );
		System.out.println("Area :" +area );
	}

}
