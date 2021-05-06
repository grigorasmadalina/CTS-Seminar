package ro.ase.cts.command.clase;

public class ComandaDepunere extends Comanda{

	public ComandaDepunere(ContBancar cont, float suma) {
		super(cont, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		super.getCont().depunere(super.getSuma());

	}

}