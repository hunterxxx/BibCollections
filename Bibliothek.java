package bibliothek;

import java.util.ArrayList;

public class Bibliothek {

	private ArrayList<Medium> medien;
	
	public Bibliothek(){
		this.medien = new ArrayList<Medium>();
	}
	
	public ArrayList<Medium> getMedien(){
		return this.medien;
	}
	
	public void addMedium(Medium m){
		this.medien.add(m);
	}

}