
	package controleur;

	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;

	import personnages.Chef;
	import villagegaulois.Village;
	
class ControlVerifierIdentiteTest {
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
	void testControlVerifierIdentite() {
		ControlVerifierIdentite controlVerifierIdentite= new ControlVerifierIdentite(village);
		assertNotNull(controlVerifierIdentite,"contructeur ne prévoit pas de Null");
		
	}
	@Test
	void testVerifierIdentiteTrue() {
		ControlVerifierIdentite controlVerifierIdentite= new ControlVerifierIdentite(village);
		assert(controlVerifierIdentite.verifierIdentite("Abraracourcix"));
	}
	@Test
	void testVerifierIdentiteFalse() {
		ControlVerifierIdentite controlVerifierIdentite= new ControlVerifierIdentite(village);
		assertEquals(controlVerifierIdentite.verifierIdentite("Abra"),false);
	}
}