package ro.ase.cts.simplefactory.program;

import ro.ase.cts.simplefactory.clase.PersonalSpital;
import ro.ase.cts.simplefactory.clase.FactoryPersonal;
import ro.ase.cts.simplefactory.clase.TipPersonal;

public class Main {
	
	public static void main(String[]args) {
		try {
		FactoryPersonal factory = new FactoryPersonal();
		PersonalSpital medic= factory.getPersonal(TipPersonal.MEDIC, "Ana");
		PersonalSpital asistent= factory.getPersonal(TipPersonal.ASISTENT, "Catalin");
		
		System.out.println(medic.toString());
		System.out.println(asistent.toString());
		
	  }
		catch(Exception e){
		e.printStackTrace();
	  }
	}
}
