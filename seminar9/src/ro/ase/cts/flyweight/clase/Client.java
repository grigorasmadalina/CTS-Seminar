package ro.ase.cts.flyweight.clase;

public class Client implements Flyweight {
private String nume;
private String numarTelefon;
private String email;


public Client(String nume, String numarTelefon, String email) {
	super();
	this.nume = nume;
	this.numarTelefon = numarTelefon;
	this.email = email;
}


@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Client [nume=");
	builder.append(nume);
	builder.append(", numarTelefon=");
	builder.append(numarTelefon);
	builder.append(", email=");
	builder.append(email);
	builder.append("]");
	return builder.toString();
}


@Override
public void printeazaRezervare(Rezervare rezervare) {

	System.out.println(this.toString()+rezervare.toString());
}
}