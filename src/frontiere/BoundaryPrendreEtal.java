package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		//TODO a completer
		if (!controlPrendreEtal.verifierIdentite(nomVendeur)) {
			System.out.println("je sui désolée"+nomVendeur+"je vais regarder si je peux vous trouver un étal");
		}
		else{
			System.out.println("Bonjour"+nomVendeur+"je vais regarder si je peux vous trouver un étal ");
			if (!controlPrendreEtal.resteEtals()) {
				System.out.println("Désolée"+nomVendeur+ "je n'ai plus d'étal qui ne soit pas déjà occupé.");}
			else {
				installerVendeur
			}
					
			
		}
	}

	private void installerVendeur(String nomVendeur) {
		//TODO a completer
	}
}
