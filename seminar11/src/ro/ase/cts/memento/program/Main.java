package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.Manager;
import ro.ase.cts.memento.clase.MeciJucat;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MeciJucat meciJucat=new MeciJucat("echipa1", "echipa2",100, 100, 20, 20);
		Manager manager=new Manager();
		manager.adaugaMemento(meciJucat.creareMemento());
		

		meciJucat.setNumeGazda("echipa3");
		meciJucat.setNumeOaspeti("echipa4");
		meciJucat.setNrBilete(33);
		meciJucat.setNrSpectatori(300);
		meciJucat.setNrJandarmi(10);
		
		manager.adaugaMemento(meciJucat.creareMemento());
		
		System.out.println(meciJucat.toString());
		
		meciJucat.setMemento(manager.getMemento(0));
		System.out.println(meciJucat.toString());

	}

}