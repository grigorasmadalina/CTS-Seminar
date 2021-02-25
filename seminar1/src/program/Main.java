package program;

import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zoo z=new Zoo();
		Giraffe giraffe1 = new Giraffe("Girafa1");
		Giraffe giraffe2 = new Giraffe("Girafa2");
		
		z.addAnimal(giraffe1);
		z.addAnimal(giraffe2);
		
		z.feedAllAnimals();
	
	    Zebra zebra1 = new Zebra("zebra1");
	    Zebra zebra2 = new Zebra("zebra2");
	    
	    z.addAnimal(zebra1);
	    z.addAnimal(zebra2);
	    
	    z.feedAllAnimals();
	}

}
