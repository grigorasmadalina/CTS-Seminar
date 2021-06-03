package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.TestGetPromovabilitate;
import clase.Grupa;
import clase.Student;

public class TestGrupaCuFixture {

	private Grupa grupa;
	@Before
	public void setUp()
	{
		grupa=new Grupa(1083);
		for(int i=0;i<35;i++)
		{
			Student student=new Student("raluca");
			for(int j=0;j<7;j++)
			{
				student.adaugaNota(7);
			}
			grupa.adaugaStudent(student);
		}
	}
	@Test(timeout=500)
	@Category(TestGetPromovabilitate.class)
	public void testPromovabilitatePerformance()
	{
		
		grupa.getPromovabilitate();
	}
}