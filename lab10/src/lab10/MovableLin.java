package lab10;
import java.util.Scanner;
public class MovableLin {
	public static void disPlay(Point2D[] line) {
		double x1 = 0 , x2 = 0 , y1 = 0 ,y2 =0 ,slope = 0 , d = 0;
		int j = 1 ;
		for(int i = 0 ; i < line.length ; i=(i+2)) {
			x1 = line[i].getX();
			y1 = line[i].getY();
			x2 = line[i+1].getX();
			y2 = line[i+1].getY();
			slope = (y1 - y2) / (x1 - x2);
			d = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
			System.out.println("Line no. "+j+ " From  "+line[i].toString() + " to " +line[i+1].toString());
			System.out.printf("Slope is %.2f Distant is %.5f \n\n",slope ,d);
			j++;
		}
	}
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter number of line: ");
		int n = input.nextInt();
		int size = n * 2 ;
		System.out.println("You need "+ size + " Points to formed "+ n + " Lines.");
		Point2D[] line = new Point2D[size];
		line[0] = new Point2D(5,7);
		line[1] = new Point2D(10,12);
		line[2] = new Point2D(20,12);
		line[3] = new Point2D(15,22);
		line[4] = new Point2D(30,10);
		line[5] = new Point2D(24,20);
		disPlay(line);
		
		System.out.println("= = = = = = = = = = =");
		line[0].moveLeft(10);
		line[0].moveUp(20);
		line[1].moveLeft(10);
		line[1].moveUp(20);
		line[2].moveRight(30);
		line[2].moveDown(100);
		line[3].moveRight(30);
		line[3].moveDown(100);
		disPlay(line);
	}
}
