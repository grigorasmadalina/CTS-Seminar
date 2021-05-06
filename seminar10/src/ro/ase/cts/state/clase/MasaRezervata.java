package ro.ase.cts.state.clase;

public class MasaRezervata implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(masa.getStareMasa() instanceof MasaRezervata) {
			System.out.println("Masa nu poate fi rezervata");
		}
		else {
			System.out.println("Masa a fost rezervata");
			masa.setStareMasa(this);
		}
	}

}