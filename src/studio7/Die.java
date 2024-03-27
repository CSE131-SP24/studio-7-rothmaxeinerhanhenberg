package studio7;

public class Die {

	private int n; // # of sides
	
	public Die(int initN) {
		n = initN;
	}
	
	public int roll() {
		int random = (int) (Math.random()*(n))+1;
		return random;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die myDice = new Die(15);
		System.out.println(myDice.roll());
		
	}

}
