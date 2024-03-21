package frontiere;

import java.util.Scanner;

import controleur.ControlAcheterProduit;
import personnages.Gaulois;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		StringBuilder question = new StringBuilder();
		int nbProduit=0;
		question.append(" Quel produit voulez-vous acheter ?\n");
		String nomProduit = scan.nextLine();
		if(!controlAcheterProduit.verifierProduisExiste(nomProduit)) {
			System.out.println(" “Désolé, personne ne vend ce produit au marché.\n");

		}
		else {
			question.append("Chez quel commerçant voulez-vous acheter des "+nomProduit);
			Gaulois[] listeCommercant=controlAcheterProduit.listeVendeur(nomProduit);
			question.append("1 - .\n"+listeCommercant[0].getNom());
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					System.out.println("Panoramix se déplace jusqu'à l'étal du vendeur Bonemine");
					
				}
	
			}while(choixUtilisateur != 1);
			question.append("Bonjour Panoramix Combien de fleurs voulez-vous acheter ?");
			nbProduit= Clavier.entrerEntier(question.toString());
			if (!controlAcheterProduit.)
		}
	}
	}