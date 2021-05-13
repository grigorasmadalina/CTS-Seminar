package ro.ase.cts.template.clase;

public class Spectator extends TemplateSpectator{
	private String nume;
	
	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void seAseazaLaCoada() {
		// TODO Auto-generated method stub
		System.out.println(nume + " se aseaza la coada");
	}

	@Override
	public void prezintaBiletul() {
		// TODO Auto-generated method stub
		System.out.println(nume + " prezinta biletul");

	}

	@Override
	public void seFaceControlulCorporal() {
		// TODO Auto-generated method stub
		System.out.println(nume + " face controlul corporal");

	}

	@Override
	public void ocupaLocul() {
		// TODO Auto-generated method stub
		System.out.println(nume + " ocupa locul");

	}
	

}