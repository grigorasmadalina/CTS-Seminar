package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorNotaLMA;
import ro.ase.cts.decorator.clase.DecoratorNotaPasteFericit;
import ro.ase.cts.decorator.clase.NotaAbstracta;
import ro.ase.cts.decorator.clase.NotaDePlata;

public class Main {

	public static void main(String[] args) {
		NotaAbstracta nota = new NotaDePlata(100);
		
		nota.printeaza();
		
		DecoratorAbstract decorator = new DecoratorNotaPasteFericit(nota);
		decorator.printeazaFelicitare();
		decorator.printeaza();
		
		System.out.println();
		
		DecoratorAbstract decoratorLMA = new DecoratorNotaLMA(nota);
		decoratorLMA.printeaza();
		
		NotaAbstracta notaNoua = new NotaDePlata(36);
		DecoratorAbstract decoratorLMA2= new DecoratorNotaLMA(notaNoua);
		DecoratorAbstract decoratorFelicitare  =new DecoratorNotaPasteFericit(decoratorLMA2);
		
		System.out.println();
		decoratorFelicitare.printeaza();
		decoratorFelicitare.printeazaFelicitare();
	}

}