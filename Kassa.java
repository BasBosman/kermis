package kermis;

public class Kassa {
	private long totaleOmzet = 0;
	private int totaleVerkoop = 0;
	private long teBetalenBelasting = 0;
	
	void printTotaleOmzet() { //print in euro
		System.out.println("De totale omzet is " + totaleOmzet/100.0 + " €. ");
	}
		
	void addTotaleOmzet(long omzet) {
		totaleOmzet += omzet;
	}
	
	void printTotaleVerkoop() {
		System.out.println("De totale verkoop is: " + totaleVerkoop);
	}
	
	void verkoopKaartje() {
		totaleVerkoop += 1;
	}
	void belasten(long belasting) {
		teBetalenBelasting += belasting;
	}
	long belastingBetalen() {
		long belasting = teBetalenBelasting;
		System.out.println("De gulzige belastings inspecteur heeft " + belasting/100.0 + " € belasting geïnd.");
		teBetalenBelasting = 0;
		return belasting;
	}
}
