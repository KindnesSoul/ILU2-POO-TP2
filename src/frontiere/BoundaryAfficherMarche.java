package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String [] infosMarche=controlAfficherMarche.donnerInfosMarche();
		if (infosMarche.length==0) {
			System.out.println("Le marchée est vide");
		}
		else {
			System.out.println(nomAcheteur+"vous trouverez au marché:");
			for (int i=0; i<=infosMarche.length-3;) {
				System.out.println("-"+infosMarche[i+2]+"qui vend"+infosMarche[i+1]+" "+infosMarche[i]);
				i=i+3;
			}
		}
	}
}
