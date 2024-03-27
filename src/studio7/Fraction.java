package studio7;

public class Fraction {

	private int n;
	private int d;
	
	public Fraction(int initN, int initD) {
		n = initN;
		d = initD;
	}
	
	
	
	public String toString() {
		return n+"/"+d;
	}
	
	public Fraction add(Fraction f2) {
		int newN1 = n*f2.d;
		int newN2 = d*f2.n;
		int newD = d*f2.d;
		
		Fraction result = new Fraction(newN1+newN2,newD);

		return result;
		
	}
	
	public Fraction multiply(Fraction f2) {
		int n3 = n*f2.n;
		int d3 = d*f2.d;
		return new Fraction(n3,d3);
	}
	
	public Fraction recipricol() {
		return new Fraction(d,n);
	}
	
	public double decimal() {
		return (double)((1.0*n)/(1.0*d));
	}
	
	public Fraction simplify() {
		double result = (double)((1.0*n)/(1.0*d));
		
		System.out.print(result);
		
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=d;j++) {
				if (new Fraction(i,j).decimal()==result) {
					return new Fraction(i,j);
				}
			}
		}
		
		return new Fraction(n,d);
	}
	
	
	public static void main(String[] args) {
		
		Fraction f1 = new Fraction(8,6);
		
		
		Fraction simplified = f1.simplify();
		System.out.println(simplified);

	}

}
