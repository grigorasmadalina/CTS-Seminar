package ro.ase.cts.adapterclase.program;

import ro.ase.cts.adapterclase.clase.AdaptorCreditClase;
import ro.ase.cts.adapterclase.clase.CreditAbstract;

public class Main {
	
	public static void afiseazaInfoCredit(CreditAbstract credit) {
		credit.oferaCredit();
	}

	public static void main(String[] args) {
		AdaptorCreditClase adaptorClase = new AdaptorCreditClase(50,"Ana");
		afiseazaInfoCredit(adaptorClase);

	}

}
