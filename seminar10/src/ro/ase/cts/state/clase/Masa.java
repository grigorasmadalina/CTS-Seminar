package ro.ase.cts.state.clase;

public class Masa {
	private int nrMasa;
	private Stare stareMasa;
	
	public Stare getStareMasa() {
		return stareMasa;
	}
	
	protected void setStareMasa(Stare stareMasa) {
		this.stareMasa = stareMasa;
	}
	public int getNrMasa() {
		return nrMasa;
	}
	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stareMasa = new MasaLibera();
	}
	
	public void ocupaMasa() {
		MasaOcupata masaOcupata = new MasaOcupata();
		masaOcupata.modificaStare(this);
	}
	public void rezervaMasa() {
		MasaRezervata masaRezervata = new MasaRezervata();
		masaRezervata.modificaStare(this);
	}
	public void elibereazaMasa() {
		MasaLibera masaLibera = new MasaLibera();
		masaLibera.modificaStare(this);
	}
}