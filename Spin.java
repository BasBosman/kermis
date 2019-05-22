package kermis;

public class Spin extends RisicoAttractie implements GokAttractie {
	String naam = "Spin";
	private long prijs = 158; // prijs + belasting = 225 cent
	private static long belastingsBedrag = 67;
	private int draaiLimiet = 5;
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

		public void kansSpelBelastingBetalen(Kassa kassa) {
			kassa.belasten(belastingsBedrag); 			
		}
	}
