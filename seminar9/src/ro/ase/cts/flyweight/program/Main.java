package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Flyweight;
import ro.ase.cts.flyweight.clase.FlyweightFactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare r1=new Rezervare(5, 3, 8);
		Rezervare r2=new Rezervare(10, 9, 16);
		Rezervare r3=new Rezervare(4, 5, 19);
		
		FlyweightFactory fabrica=new FlyweightFactory() ;
		
		fabrica.getClient("0743355").printeazaRezervare(r1);;
		fabrica.getClient("02652").printeazaRezervare(r2);;
		fabrica.getClient("0743355").printeazaRezervare(r3);;
}
	
}