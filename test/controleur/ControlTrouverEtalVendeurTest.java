package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;

class ControlTrouverEtalVendeurTest {
	private Village village;
	private Chef abraracourcix;
	
	@BeforeEach
	public void initialiserSituation() {
		System.out.println("initialisation...");
		village=new Village("le village des ir�ductibles",10,5);
		abraracourcix= new Chef("Abraracourcix",10,village);
		village.setChef(abraracourcix);
	}
	@Test
	void testControlTrouverEtalVendeur() {
		ControlTrouverEtalVendeur controlTrouverEtalVendeur = new ControlTrouverEtalVendeur(village);
		assertNotNull(controlTrouverEtalVendeur,"constructeur ne pr�voit pas de null");
	}
	@Test
	void testTrouverEtalVendeurTrue() {
		ControlTrouverEtalVendeur controlTrouverEtalVendeur = new ControlTrouverEtalVendeur(village);
		Gaulois bob =new Gaulois("bob",3);
		village.ajouterHabitant(bob);
		village.installerVendeur(bob,"patate", 3);
		assertNotNull(controlTrouverEtalVendeur.trouverEtalVendeur("bob"));
		
	}
	@Test
	void testTrouverEtalVendeurFalse() {
		ControlTrouverEtalVendeur controlTrouverEtalVendeur = new ControlTrouverEtalVendeur(village);
		assertEquals  (controlTrouverEtalVendeur.trouverEtalVendeur("blob"),null);
		
	}

}
