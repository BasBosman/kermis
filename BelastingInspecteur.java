package kermis;

public class BelastingInspecteur {
	long geIndeBelasting = 0;
	void belastingInnen(Kassa kassa) {
		geIndeBelasting += kassa.belastingBetalen();
	}
}
