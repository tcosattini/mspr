package model;

import java.util.ArrayList;

public class Equipment extends ArrayList<Equipments> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ArrayList<Equipments> equipements = new ArrayList<Equipments>();

	public Equipment(ArrayList<Equipments> equipements) {
		super();
		this.equipements = equipements;
	}

	public ArrayList<Equipments> getEquipements() {
		return equipements;
	}

	public void setEquipements(ArrayList<Equipments> equipements) {
		this.equipements = equipements;
	}
}
