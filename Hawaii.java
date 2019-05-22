package kermis;

public class Hawaii extends RisicoAttractie {
	String naam = "Hawaii";
	private static long prijs = 500;
	private int draaiLimiet = 10;
	private int draaiAantal = 0;
	
	String getNaam() {
		return naam;
	}
	
	long getPrijs() {
		return prijs;
	}
	
	void draaien() throws OverLimitException {
		draaiAantal += 1;
		if (draaiAantal > draaiLimiet) {
			throw new OverLimitException();
		} else System.out.println("De attractie " + getNaam() + " draait!");
	}
	
	void keuring() {
		draaiAantal = 0;
	}
}