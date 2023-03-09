package controleur;

import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

public class ControlTrouverEtalVendeur {
	private Village village;

	public ControlTrouverEtalVendeur(Village village) {
		this.village = village;
	}

	public Etal trouverEtalVendeur(String nomVendeur) {
		Etal etal = null;
		Gaulois gauloi=village.trouverHabitant(nomVendeur);
		if (gauloi !=null) {
			etal=village.rechercherEtal(gauloi);
		}
		return etal;
	}
}
