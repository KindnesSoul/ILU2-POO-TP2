package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;

class ControlPrendreEtalTest {
	private Village village;
	private Chef abraracourcix;
	@BeforeEach
	
	public void initialiserSituation() {
		System.out.println("initialisation...");
		village=new Village("le village des iréductibles",10,5);
		abraracourcix= new Chef("Abraracourcix",10,village);
		village.setChef(abraracourcix);
		Gaulois bob =new Gaulois("bob",3);
		village.ajouterHabitant(bob);
		village.installerVendeur(bob,"patate", 3);
		}
		
	
	@Test
	void testControlPrendreEtal() {
		ControlVerifierIdentite controlVerifierIdentite= new ControlVerifierIdentite(village);
		ControlPrendreEtal controlPrendreEtal= new ControlPrendreEtal(controlVerifierIdentite,village);
		assertNotNull(controlPrendreEtal,"contructeur ne prévoit pas de Null");}
	
		@Test
	void testIdentite() {
		ControlVerifierIdentite controlVerifierIdentite= new ControlVerifierIdentite(village);
		ControlPrendreEtal controlPrendreEtal = new ControlPrendreEtal(controlVerifierIdentite,village);
		assert(controlPrendreEtal.verifierIdentite("bob"));
	}
		@Test
		void testPrendreEtal() {
			ControlVerifierIdentite controlVerifierIdentite= new ControlVerifierIdentite(village);
			ControlPrendreEtal controlPrendreEtal = new ControlPrendreEtal(controlVerifierIdentite,village);
			assertEquals(controlPrendreEtal.prendreEtal("boby", "produit", 3),1);
		}
		@Test
		void testresteEtal() {
			ControlVerifierIdentite controlVerifierIdentite= new ControlVerifierIdentite(village);
			ControlPrendreEtal controlPrendreEtal = new ControlPrendreEtal(controlVerifierIdentite,village);
			assert(controlPrendreEtal.resteEtals());
		}

}
