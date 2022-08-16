import java.util.ArrayList;
import java.util.Scanner ;
public class CssRgbcoler {

	public static void main(String[] args) {
		ArrayList <RGBColor> color = new ArrayList<RGBColor>();
		color.add(new CssRGBColor ("red" ,255,0,0) );
		color.add(new CssRGBColor("green",0,255,0));
		color.add(new CssRGBColor("blue",0,0,255));
		color.add(new CssRGBColor("yellow",255,255,0));
		color.add(new CssRGBColor("black",0,0,0));
		color.add(new CssRGBColor("pink",255,192,203));
		color.add(new CssRGBColor("maroon",128,0,0));
		color.add(new CssRGBColor("Aqua",0,255,255));
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of color [4-8] :");
		int n = input.nextInt();
		char yn = 'y';
		while(yn == 'y') {
		System.out.print("Guest color : ");
		String name = input.next();
		int count = 0 ;
		for(int i = 0 ; i < color.size()-n ; i++) {
			if(color.get(i) instanceof CssRGBColor ) {
				if(((CssRGBColor ) color.get(i)).getName().equals(name)) {
					System.out.println("Display RGB Color Information ");
					System.out.println(color.get(i).toString());
					count++;
				}
			}
			else if(count >= n) {
				System.out.println("this color dosen't exits");
				System.exit(0);
			}
		}
		System.out.print("Do you want to continue [y/n]");
		yn = input.next().charAt(0);
	}
	System.out.println("Bye Bye ..");
	}
}
