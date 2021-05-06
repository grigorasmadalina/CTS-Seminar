package ro.ase.cts.state.clase;

public class MasaLibera implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(masa.getStareMasa() instanceof MasaLibera) {
			System.out.println("Masa nu se poate elibera");
		}
		else {
			System.out.println("Masa a fost eliberata");
			masa.setStareMasa(this);
		}
	}

}