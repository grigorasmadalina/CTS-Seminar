package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.ContClient;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContClient contClient1 = new ContClient("Ioana", 21, 10);
        ContClient contClient2= (ContClient) contClient1.copiaza();
	
	    System.out.println(contClient1);
	    System.out.println(contClient2);
	
	    
	    Bilet biletPrototype = new Bilet(1, "Echipa1", "Echipa2", "1.04.2021");
	    Bilet bilet1 = (Bilet) biletPrototype.copiaza();
	    bilet1.setCodBilet(100);
	    Bilet bilet2 = (Bilet) biletPrototype.copiaza();
	    bilet2.setCodBilet(101);
	    
	    System.out.println(bilet1);
	    System.out.println(bilet2);
	}

}
