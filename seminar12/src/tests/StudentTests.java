package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume = "Gigel";
		Student student = new Student(nume);
		
		assertEquals("Numele nu a fost initializat",nume, student.getNume());
		//assertNotEquals(student.getNote(), null);
		assertNotNull("Lista de note nu a fost initializata",student.getNote());
	}
	
	@Test
	public void testConstructorFaraParametri() {
		Student student = new Student();
		
		assertNotNull("Numele nu a fost initializat",student.getNume());
		assertNotNull("Lista de note nu a fost initializata",student.getNote());
	}
	
	@Test
	public void testSetterNume() {
		String nume = "Gigel";
		Student student = new Student();
		
		student.setNume(nume);
		
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testDimensiuneLista() {
		Student student = new Student();
		
		int nota = 10;
		student.adaugaNota(nota);
		
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testCalculeazaMedieN() {
		Student student = new Student();
		
		int nota1 = 10;
		int nota2 = 8;
		int nota3 = 5;
		float medie = (nota1 + nota2 + nota3)/3.0f;

		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);

		assertEquals(medie, student.calculeazaMedie(), 0.001);
	}
	
	@Test
	public void testCalculeazaMedieONota() {
		Student student = new Student();
		int nota1 = 10;

		student.adaugaNota(nota1);

		assertEquals(10, student.calculeazaMedie(), 0.001);
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void testCalculeazaMedieZeroNote() {
		Student student = new Student();

		student.calculeazaMedie();
	}
	
	@Test
	public void testAreRestante() {
		Student student = new Student();
		
		int nota1 = 10;
		int nota2 = 8;
		int nota3 = 3;
		
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);

		assertTrue(student.areRestante());
		
	}
	
	@Test
	public void testNuAreRestante() {
		Student student = new Student();
		
		int nota1 = 10;
		int nota2 = 8;
		int nota3 = 5;
		
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);

		assertFalse(student.areRestante());
		
	}
	
	@Test
	public void testGetNotaPozitieIncorecta() {
		Student student = new Student();
		
		int nota1 = 10;
		int nota2 = 8;
		int nota3 = 5;
		
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);

		try {
			student.getNota(3);
			//daca ajungem pe linia asta, inseamna ca nu arunca exceptie
			fail("Metoda nu arunca exceptie");
		}
		catch(IndexOutOfBoundsException exception){
			
		}
		
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void testAdaugaNotaIncorecta() {
		Student student = new Student();
		
		int nota1 = -1;
		
		student.adaugaNota(nota1);
	}

}