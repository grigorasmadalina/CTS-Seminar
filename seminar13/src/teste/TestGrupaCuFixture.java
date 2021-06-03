package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;

public class TestGrupaCuFixture {
	private Grupa grupa;

	@Before
	public void setUp() {
		grupa = new Grupa(1083);
		for (int i =0; i<35;i++) {
			Student student = new Student("Madalina");
		for(int j=0; j<7;j++) {
			student.adaugaNota(7);
		}
		grupa.adaugaStudent(student);
	  }
	
    }
	@Test(expected=IndexOutOfBoundsException.class)
	public void testPromovabilitateErrorCondition() {
		Grupa grupa = new Grupa(1083);
		grupa.getPromovabilitate();
	}


}
