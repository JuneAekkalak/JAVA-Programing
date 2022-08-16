package lab09;
import java.util.ArrayList ;
public class TestShapeObject {
	public static int[] findMax(ArrayList<Shape> o) {
		int[] max = {0 , 0};
		for(int i = 0 ; i < o.size() ; i++) {
			if(o.get(i) instanceof Square) {
				double obj = ((Square) o.get(i)).getPerimeter();
				if (obj > max[0] ) max[0] = (int) obj ;
			}
			if(o.get(i) instanceof Circle) {
				double obj = ((Circle) o.get(i)).getCircumference();
				if (obj > max[1] ) max[1] =(int) obj ;
			}
		}
		return max ;
	}
	public static int[] findMin(ArrayList<Shape> o) {
		int[] min = {100 , 100} ;
		for(int i = 0 ; i < o.size() ; i++) {
			if(o.get(i) instanceof Square) {
				double obj = ((Square) o.get(i)).getPerimeter();
				if (obj < min[0] ) min[0] = (int) obj ;
			}
			if(o.get(i) instanceof Circle) {
				double obj = ((Circle) o.get(i)).getCircumference();
				if (obj < min[1] ) min[1] = (int) obj ;
			}
		}
		return min ;
	}
	public static void displayAllShape(ArrayList<Shape> o) {
		System.out.println("Class Square ");
		for(int i = 0 ; i < o.size() ; i++) {
			if(o.get(i) instanceof Square) {
				System.out.println((i+1)+". "+((Square) o.get(i)).toString());
			}
		}
		System.out.println("========================");
		System.out.println("class Circle ");
		int j = 0; 
		for(int i = 0 ; i < o.size() ; i++ ) {
			if(o.get(i) instanceof Circle) {
				j++;
				System.out.println((j)+". "+((Circle) o.get(i)).toString());
			}
		}
		int[] max = findMax(o);
		int[] min = findMin(o);
		System.out.println("========================");
		System.out.println("Square:");
		System.out.println("Max Perimeter is "+ max[0]);
		System.out.println("Min Perimeter is "+ min[0]);
		System.out.println("Circle:");
		System.out.println("Max Circumference is "+ max[1]);
		System.out.println("Min Circumference is "+ min[1]);
	}
	public static void main(String[] args) {
		ArrayList <Shape> shape = new ArrayList <Shape>();
		shape.add(new Square(4));
		shape.add(new Square(10));
		shape.add(new Square(5));
		shape.add(new Circle(3));
		shape.add(new Circle(6));
		shape.add(new Circle(10));
		displayAllShape(shape);
	}
}
