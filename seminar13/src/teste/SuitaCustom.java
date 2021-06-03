package teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import categorii.TestGetPromovabilitate;
import categorii.TestUrgente;
import categorii.TesteNormale;

@RunWith(Categories.class) 
@SuiteClasses({ TestGrupa.class, TestGrupaCuFixture.class, TestGrupaWithDummy.class, TestPromovabilitateWithFake.class,
		TestPromovabilitateWithStub.class })
@IncludeCategory({TestGetPromovabilitate.class})
@ExcludeCategory({TesteNormale.class,TestUrgente.class})
public class SuitaCustom {

}