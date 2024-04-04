package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;

class ControlLibererEtalTest {
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
	void testControlLibererEtal() {
		ControlTrouverEtalVendeur controlTrouverEtalVendeur= new ControlTrouverEtalVendeur(village);
		ControlLibererEtal controlLibererEtal= new ControlLibererEtal(controlTrouverEtalVendeur);
		assertNotNull(controlLibererEtal,"contructeur ne prévoit pas de Null");		
	}
	@Test
	void testIsVendeur() {
		ControlTrouverEtalVendeur controlTrouverEtalVendeur= new ControlTrouverEtalVendeur(village);
		ControlLibererEtal controlLibererEtal= new ControlLibererEtal(controlTrouverEtalVendeur);
		assertFalse(controlLibererEtal.isVendeur("Abra"));
		assertTrue(controlLibererEtal.isVendeur("bob"));
	}
	@Test
	void testlibererEtal() {
		ControlTrouverEtalVendeur controlTrouverEtalVendeur= new ControlTrouverEtalVendeur(village);
		ControlLibererEtal controlLibererEtal= new ControlLibererEtal(controlTrouverEtalVendeur);
		assertEquals(controlLibererEtal.libererEtal("bob"),"[true, bob, patate, 3, 0]");
	}
}