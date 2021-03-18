package ro.ase.cts.clase;

public class Minge {
	private String culoare;
	private float pret;
	private double raza;
	
	private static Minge minge  = null;
	
	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}
	public void setPret(float pret) {
		this.pret = pret;
	}
	public void setRaza(double raza) {
		this.raza = raza;
	}
	
	private Minge(String culoare, float pret, double raza) {
		super();
		this.culoare = culoare;
		this.pret = pret;
		this.raza = raza;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Minge [culoare=");
		builder.append(culoare);
		builder.append(", pret=");
		builder.append(pret);
		builder.append(", raza=");
		builder.append(raza);
		builder.append("]");
		return builder.toString();
	}

	
	public static Minge getInstance(String culoare, float pret, double raza) {
		if (minge == null) {
			minge = new Minge(culoare, pret, raza);
		}
			return minge;
	}
	
}
