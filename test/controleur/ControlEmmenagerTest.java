package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlEmmenagerTest {
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
	void testControlEmmenager() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		assertNotNull(controlEmmenager,"constructeur ne prévoit pas de null");
	}
	@Test
	void testIsHabitant() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		controlEmmenager.ajouterGaulois("bonemine",10);
		assertTrue(controlEmmenager.isHabitant("bonemine"));
		assertFalse(controlEmmenager.isHabitant("existe pas "));
		controlEmmenager.ajouterDruide("panoramix",10, 1, 5);
		assertTrue (controlEmmenager.isHabitant("panoramix"));
	}
	@Test
	void testAjouterDruide() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		controlEmmenager.ajouterDruide("panoramix",10, 1, 5);
	}
	@Test
	void testAjouterGaulois() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		controlEmmenager.ajouterGaulois("Bonemine", 10);
	}
}
