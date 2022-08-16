package lab10;
import java.util.ArrayList;
public class ResizeAndCompareShape {
	public static void displayAllShape (ArrayList<Shape> o) {
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
		for(int i = 0 ; i < shape.size() ; i++) {
			if(shape.get(i) instanceof Square) ((Square) shape.get(i)).resize(200);
			else if(shape.get(i) instanceof Circle) ((Circle) shape.get(i)).resize(50);
		}
		System.out.println("========================");
		System.out.println("After resize ");
		System.out.println("========================");
		displayAllShape(shape);
		System.out.println("========================");
		int compareSquare = shape.get(0).compareTo(shape.get(1));
		String[] text= {"smaller","equal","bigger"};
		System.out.println("Compare 2 Squares after resize");
		System.out.println("Square 1 is "+text[compareSquare+1]+" than Square 2");
		int compareCircle = shape.get(1).compareTo(shape.get(0));
		System.out.println("Compare 2 Circle  after resize");
		System.out.println("Circle  1 is "+text[compareCircle+1]+" than Circle 2");
	}
}
