package ro.ase.cts.template.clase;

public abstract class TemplateSpectator {
	abstract public void seAseazaLaCoada();
	abstract public void prezintaBiletul();
	abstract public void seFaceControlulCorporal();
	abstract public void ocupaLocul();

	public final void intrarePeStadion() {
		seAseazaLaCoada();
		prezintaBiletul();
		seFaceControlulCorporal();
		ocupaLocul();
	}
}