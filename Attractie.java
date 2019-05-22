package kermis;

public abstract class Attractie {
	String naam;
	private static long prijs; //in centen
	int oppervlakte;
	private int kaartjesverkocht;
	private int draaiAantal = 0;
	
	void draaien() throws OverLimitException {
		draaiAantal += 1;
		System.out.println("De attractie " + getNaam() + " draait!");
	}
	void stoppen() {
		System.out.println("De attractie " + getNaam() + " is klaar met draaien!");
	}
	
	String getNaam() {
		return naam;
	}
		
	long getPrijs() {
		return prijs;
	}
	
	int getVerkocht() {
		return kaartjesverkocht;
	}
	
	void verkoopkaartje() {
		kaartjesverkocht += 1;
	}
	
	void keuring() {draaiAantal = 0;}
}

