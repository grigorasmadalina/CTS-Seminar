package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.TestGetPromovabilitate;
import clase.mocks.StudentStub;
import clase.Grupa;
import clase.IStudent;

public class TestPromovabilitateWithStub {

	@Test
	@Category(TestGetPromovabilitate.class)
	public void testPromovabilitateLimitaSuperioara() {
		Grupa grupa=new Grupa(1083);
		IStudent student=new StudentStub();
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getPromovabilitate(),0.01);
	}

}