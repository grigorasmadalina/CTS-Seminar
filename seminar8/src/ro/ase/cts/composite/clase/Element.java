package ro.ase.cts.composite.clase;

public class Element implements ComponentaMeniu{
	private String numeElement;
	
	public Element(String numeElement) {
		super();
		this.numeElement = numeElement;
		
	}
	
	@Override
	public void adaugaNod(ComponentaMeniu componenta) throws Exception{
		throw new Exception("Nu e implementata");
		
	}

	@Override
	public void stergeNod(ComponentaMeniu componenta) {
		throw new IllegalArgumentException("Nu e implementata");
		
	}

	@Override
	public ComponentaMeniu getNod(int index) {
		throw new IllegalArgumentException("Nu e implementata");
	}

	@Override
	public void printeaza() {
		System.out.println("Nume " + numeElement);
		
	}

}