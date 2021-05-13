package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	
	private List<Memento> mementos=new ArrayList<>();
	public void adaugaMemento(Memento memento) {
		mementos.add(memento);
		
	}
	public Memento getMemento(int pos) throws Exception {
		if(pos>=0 && pos<mementos.size())
		{
			return mementos.get(pos);
		}else {
			throw new IndexOutOfBoundsException();
		}
	}

}