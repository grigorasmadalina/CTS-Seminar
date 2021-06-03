package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;

public class TestGrupa {
	
	@Test
	public void testConstructorCorect() {
		Grupa grupa=new Grupa(1083);
		assertEquals(1083, grupa.getNrGrupa());
	}

	@Test
	public void testConstructorLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorTrebuieSaArunceExceptie() {
		Grupa grupa = new Grupa(988);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorTrebuieSaArunceExceptieInAfaraLimitei() {
		Grupa grupa = new Grupa(1200);
	}
	
	@Test(timeout = 500)
	public void testConstructorPerformanta() {
		Grupa grupa = new Grupa(1082);
	}
	
	@Test
	public void testConstructorExistentaListaStudenti() {
		Grupa grupa = new Grupa(1083);
		assertNotNull(grupa.getStudenti());
	}
	
	@Test
	public void testPromovabilitateRight() {
		Grupa grupa = new Grupa(1083);
		for(int i=0; i<5; i++) {
			Student student = new Student("Madalina");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		for(int i=0; i<7; i++) {
			Student student = new Student("Lavinia");
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		float promovabilitate = 0.7f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(), 0.1);
		
	}
	
	@Test
	public void testPromovabilitateLowerBoundary() {
		Grupa grupa = new Grupa(1083);
		for(int i=0; i<5; i++) {
			Student student = new Student("Madalina");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		
		float promovabilitate =0f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(), 0.1);
	}
	
	@Test
	public void testPromovabilitateUpperBoundary() {
		Grupa grupa = new Grupa(1083);
		for(int i=0; i<5; i++) {
			Student student = new Student("Lavinia");
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		float promovabilitate =1f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(), 0.1);
	}
	
	

	
	@Test(timeout=500)
	public void testPromovavilitatePerformance() {
		Grupa grupa = new Grupa(1083);
		for (int i =0; i<35;i++) {
			Student student = new Student("Madalina");
		for(int j=0; j<7;j++) {
			student.adaugaNota(7);
		}
		grupa.adaugaStudent(student);
	}
		grupa.getPromovabilitate();
	}
	
}
