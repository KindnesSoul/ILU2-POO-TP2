package controleur;

import personnages.Gaulois;
import villagegaulois.Village;

public class ControlAcheterProduit {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite,
			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}
	public boolean verifierProduisExiste(String nomProduit) {
		return village.testProduitExiste(nomProduit);
	}
	public Gaulois[]  listeVendeur(String nomProduit) {
		
		return village.rechercherVendeursProduit(nomProduit);
		
	}
	public boolean quantiterProduitSufisant(String nomProduit ,int quantiterProduit) {
		return false;
	
	}
	
	public boolean verifierIdentite(String nomVendeur) {
		return controlVerifierIdentite.verifierIdentite(nomVendeur);}
	

}
