
public class CssRGBColor extends RGBColor {
	private String cssname ;
	
	public CssRGBColor (String name , int r ,int g ,int b ) {
		super(r , g , b);
		this.cssname = name ;
	}
	
	public String getName() {
		return this.cssname ;
	}
	
	public String toString() {
		return "RGB Color of " + this.cssname + " "+super.toString() ;
	}
}
