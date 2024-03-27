package studio7;

public class HockeyPlayer {

	private String name;
	private int number;
	private boolean handed; // TRUE = right; FALSE = left
	private boolean canShootBothWays;
	
	private int goals;
	private int assists;
	private int points;
	private int games;
	
	public HockeyPlayer(String initName, int initNumber, boolean initHanded, boolean initCanShootBothWays) {
		name = initName;
		number = initNumber;
		handed = initHanded;
		canShootBothWays = initCanShootBothWays;
	}
	
	public void attempt(boolean shotRight) {
		if (shotRight==handed) {
			goals++;
		} else if (canShootBothWays) {
			goals++;
		} else {
			
		}
	}
	
	public void addGame(int initGoals, int initAssists) {
		goals += initGoals;
		assists += initAssists;
		games++;
	}
	
	public int points() {
		return goals+assists;
	}
	
	public String stats() {
		return "Stats For "+name+ " ("+number+")"+
				"\nGoals: "+goals+
				"\nAssists: "+assists+
				"\nPoints: "+(assists+goals)+
				"\nGames: "+games;
	}
	
	
	public static void main(String[] args) {
		HockeyPlayer myPlayer = new HockeyPlayer("Paul",15,true,true);
		myPlayer.addGame(2, 2);
		myPlayer.addGame(4, 5);
		System.out.println(myPlayer.stats());

	}

}
