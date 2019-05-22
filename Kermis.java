package kermis;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Kermis {
	public static void main(String[] args) {
		ArrayList<Attractie> attracties = new ArrayList<>();
		attracties.add(new Botsauto());
		attracties.add(new Hawaii());
		attracties.add(new Ladderklimmen());
		attracties.add(new Spiegelpaleis());
		attracties.add(new Spin());
		attracties.add(new Spookhuis());
		
		BelastingInspecteur belastingsInspecteur = new BelastingInspecteur();
		Kassa kassa = new Kassa();
		
		boolean playing = true;
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		playLoop : while(playing) {
			//mensen kopen een kaartje voor 10 random attracties:
			for (int i = 0; i < 10; i++) {
				Attractie randomAttractie = attracties.get(random.nextInt(6));
				
				randomAttractie.verkoopkaartje();
				kassa.verkoopKaartje();
				
				try {
				((GokAttractie) randomAttractie).kansSpelBelastingBetalen(kassa);
				} catch (ClassCastException e) {};
				
				kassa.addTotaleOmzet(randomAttractie.getPrijs());
				//er kunnen 10 mensen in een attractie per rit
				if (randomAttractie.getVerkocht() % 10 == 0) {
					try {
						randomAttractie.draaien();
					} catch (OverLimitException e) {
						System.out.println("Attractie " + randomAttractie.getNaam() + " kan niet draaien. Verkochte kaartjes worden gerefund.");
						kassa.addTotaleOmzet(-10*randomAttractie.getPrijs());
					}
				}
			}
			System.out.println("Kermis manager, geef uw input aub.");
			switch(scanner.nextLine()) {
				case "o":
					kassa.printTotaleOmzet();
					break;
				case "k":
					kassa.printTotaleVerkoop();
					break;
				case "m":
					attracties.get(1).keuring();
					kassa.addTotaleOmzet(-5000); //de monteur kost 50 euro
					break;
				case "b":
					belastingsInspecteur.belastingInnen(kassa);
					break;
				case "q":
					playing = false;
					break playLoop;
					
			}
		}
		scanner.close();
	}
}
