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
			System.out.println("je sui d�sol�e"+nomVendeur+"je vais regarder si je peux vous trouver un �tal");
		}
		else{
			System.out.println("Bonjour"+nomVendeur+"je vais regarder si je peux vous trouver un �tal ");
			if (!controlPrendreEtal.resteEtals()) {
				System.out.println("D�sol�e"+nomVendeur+ "je n'ai plus d'�tal qui ne soit pas d�j� occup�.");}
			else {
				installerVendeur
			}
					
			
		}
	}

	private void installerVendeur(String nomVendeur) {
		//TODO a completer
	}
}
