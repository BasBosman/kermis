package kermis;

public class Ladderklimmen extends Attractie implements GokAttractie {
	String naam = "Ladderklimmen";
	private static long belastingsBedrag = 82;
	private static long prijs = 193; //prijs + belasting = 275 cent
	
	String getNaam() {
		return naam;
	}
	
	long getPrijs() {
		return prijs;
	}

	public void kansSpelBelastingBetalen(Kassa kassa) {
		kassa.belasten(belastingsBedrag); 
	}
	
	
}
