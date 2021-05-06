package ro.ase.cts.command.clase;

public class ComandaConstituire extends Comanda{

	public ComandaConstituire(ContBancar cont, float suma) {
		super(cont, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		super.getCont().constituire(super.getSuma());

	}

}