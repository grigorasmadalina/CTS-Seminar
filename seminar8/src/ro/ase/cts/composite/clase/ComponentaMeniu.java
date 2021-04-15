package ro.ase.cts.composite.clase;

public interface ComponentaMeniu {
	public void adaugaNod(ComponentaMeniu componenta) throws Exception;
	public void stergeNod(ComponentaMeniu componenta);
	
	ComponentaMeniu getNod(int index);
	public void printeaza();
}