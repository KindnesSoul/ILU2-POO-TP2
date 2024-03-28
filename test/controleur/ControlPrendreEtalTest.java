package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
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
		}
	
	
	
	@Test
	void testControlPrendreEtal() {
		ControlVerifierIdentite controlVerifierIdentite= new ControlVerifierIdentite(village);
		ControlPrendreEtal controlPrendreEtal= new ControlPrendreEtal(village,controlVerifierIdentite);
		assertNotNull(controlPrendreEtal,"contructeur ne prévoit pas de Null");
	
		@Test
	void test() {
		ControlPrendreEtal controlPrendreEtal = new ControlPrendreEtal(village);
	}

}
