  
package ro.ase.cts.command.clase;

public class ComandaRetragere extends Comanda{

	public ComandaRetragere(ContBancar cont, float suma) {
		super(cont, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		super.getCont().retragere(super.getSuma());
	}

}