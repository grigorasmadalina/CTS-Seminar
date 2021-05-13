package ro.ase.cts.memento.clase;

public class MeciJucat {
	private String numeGazda;
	private String numeOaspeti;
	private int nrSpectatori;
	private int nrBilete;
	private int nrSticle;
	private int nrJandarmi;
	public MeciJucat(String numeGazda, String numeOaspeti, int nrSpectatori, int nrBilete, int nrSticle,
			int nrJandarmi) {
		super();
		this.numeGazda = numeGazda;
		this.numeOaspeti = numeOaspeti;
		this.nrSpectatori = nrSpectatori;
		this.nrBilete = nrBilete;
		this.nrSticle = nrSticle;
		this.nrJandarmi = nrJandarmi;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeciJucat [numeGazda=");
		builder.append(numeGazda);
		builder.append(", numeOaspeti=");
		builder.append(numeOaspeti);
		builder.append(", nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", nrBilete=");
		builder.append(nrBilete);
		builder.append(", nrSticle=");
		builder.append(nrSticle);
		builder.append(", nrJandarmi=");
		builder.append(nrJandarmi);
		builder.append("]");
		return builder.toString();
	}
	public void setNumeGazda(String numeGazda) {
		this.numeGazda = numeGazda;
	}
	public void setNumeOaspeti(String numeOaspeti) {
		this.numeOaspeti = numeOaspeti;
	}
	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}
	public void setNrBilete(int nrBilete) {
		this.nrBilete = nrBilete;
	}
	public void setNrSticle(int nrSticle) {
		this.nrSticle = nrSticle;
	}
	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}
	
	public Memento creareMemento() {
		Memento memento=new Memento(numeGazda,numeOaspeti,nrSpectatori);
		return memento;
	}
	public void setMemento(Memento memento) {
		nrSpectatori=memento.getNrSpectatori();
		numeGazda=memento.getNumeGazda();
		numeOaspeti=memento.getNumeOaspeti();
	}
	

}