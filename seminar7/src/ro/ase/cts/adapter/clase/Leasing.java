package ro.ase.cts.adapter.clase;

public class Leasing {

	//clasa pe care o achizitionam. noul framework
	
	private float suma;
	private String numeClient;
	
	
	public Leasing(float suma, String numeClient) {
		super();
		this.suma = suma;
		this.numeClient = numeClient;
	}
	
	public float getSuma() {
		return suma;
	}
	public String getNumeClient() {
		return numeClient;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Leasing [suma=");
		builder.append(suma);
		builder.append(", numeClient=");
		builder.append(numeClient);
		builder.append("]");
		return builder.toString();
	}
	
	public void imprumuta() {
		System.out.println(numeClient+"a realizat leasing de"+suma);
	}
}