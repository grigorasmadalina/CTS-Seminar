package ro.ase.cts.program;

import ro.ase.cts.clase.BrokerTranzactie;
import ro.ase.cts.clase.BrokerTranzactieLazy;
import ro.ase.cts.clase.Minge;


public class Main {
	
	public static void main(String[] args) {
	BrokerTranzactie broker1 = BrokerTranzactie.getInstance();
	BrokerTranzactie broker2 = BrokerTranzactie.getInstance();
	System.out.println(broker1.toString());
	System.out.println(broker2.toString());
	
	broker1.setName("Alina");
	broker2.setNrTranzactiiEfectuate(9);
	
	System.out.println(broker1.toString());
	System.out.println(broker2.toString());
	
	
	BrokerTranzactieLazy lazy1 = BrokerTranzactieLazy.getInstance("Ana", 2, 30);
	BrokerTranzactieLazy lazy2 = BrokerTranzactieLazy.getInstance("Ioana", 3, 50);
    System.out.println(lazy1.toString());
    System.out.println(lazy2.toString());
    
    
	Minge minge1 = Minge.getInstance("rosu", 20, 10.3);
	Minge minge2 = Minge.getInstance("albastru", 35, 10);
    System.out.println(minge1.toString());
    System.out.println(minge2.toString());
    
    
   }
}
