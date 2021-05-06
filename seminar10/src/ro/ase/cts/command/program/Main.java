package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandaConstituire;
import ro.ase.cts.command.clase.ComandaDepunere;
import ro.ase.cts.command.clase.ComandaRetragere;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContBancar cont = new ContBancar("Ionel");
		ManagerComenzi manager = new ManagerComenzi();
		manager.invoca(new ComandaConstituire(cont, 100));
		manager.invoca(new ComandaDepunere(cont, 200));
		manager.executaComanda();
		manager.invoca(new ComandaRetragere(cont, 50));
		manager.invoca(new ComandaRetragere(cont, 330));
		manager.executaComanda();
		manager.executaComanda();
		manager.executaComanda();


	}

}