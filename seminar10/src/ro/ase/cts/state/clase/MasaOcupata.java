package ro.ase.cts.state.clase;

public class MasaOcupata implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(masa.getStareMasa() instanceof MasaOcupata) {
			System.out.println("Masa nu se poate ocupa");
		}
		else {
			System.out.println("Masa a fost ocupata");
			masa.setStareMasa(this);
		}
	}

}