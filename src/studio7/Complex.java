package studio7;

public class Complex {

	private double a; //real part
	private double b; //imaginary part
	
	public Complex(double initA, double initB) {
		a = initA;
		b = initB;
	}
	
	public String toString() {
		return a+" + "+b+"i";
	}
	
	public Complex add(Complex c2) {
		return new Complex(a+c2.a;b+c2.b);
	}
	
	public Complex multiply(Complex c2) {
		return new Complex((a*c2.a)-(b*c2.b),(a*c2.b)+(b*c2.a));
	}
	
	
	public static void main(String[] args) {
		Complex num = new Complex(2,6);
		System.out.println(num.toString());

	}

}
