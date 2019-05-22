package kermis;

public class Spookhuis extends Attractie {
	String naam = "Spookhuis";
	private static long prijs = 320;
	
	String getNaam() {
		return naam;
	}
	
	long getPrijs() {
		return prijs;
	}
}
