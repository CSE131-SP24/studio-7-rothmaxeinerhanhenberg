package studio7;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}
	
	public double area() {
		return length*width;
	}
	
	public double perimeter() {
		return (2*length) + (2*width);
	}
	
	public boolean isSquare() {
		if (length==width) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3.0, 3.0);
		System.out.println(r1.isSquare());
		

	}

}
