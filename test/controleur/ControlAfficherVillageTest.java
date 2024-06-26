package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlAfficherVillageTest {
	private Village village;
	private Chef abraracourcix;
	
	@BeforeEach
	public void initialiserSituation() {
		System.out.println("initialisation...");
		village=new Village("le village des iréductibles",10,5);
		abraracourcix= new Chef("Abraracourcix",10,village);
		village.setChef(abraracourcix);
	}
	
	
	@Test
	void testControlVerifier() {
		ControlAfficherVillage controlAfficherVillage= new ControlAfficherVillage(village);
		assertNotNull(controlAfficherVillage,"contructeur ne prévoit pas de Null");
		
	}
	@Test
	void testNomVillage() {
		ControlAfficherVillage controlAfficherVillage= new ControlAfficherVillage(village);
		assertEquals(controlAfficherVillage.donnerNomVillage(),"le village des iréductibles");
	}
	@Test
	void testNbEtal() {
		ControlAfficherVillage controlAfficherVillage= new ControlAfficherVillage(village);
		assertEquals(controlAfficherVillage.donnerNbEtals(),5);
	}
	@Test
	void TestNomVillageois(){
		ControlAfficherVillage controlAfficherVillage= new ControlAfficherVillage(village);
		assertEquals(controlAfficherVillage.donnerNomsVillageois(),"[Abraracourcix]");
	}
}
