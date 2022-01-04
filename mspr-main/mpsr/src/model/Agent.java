package model;

public class Agent {
	private String name;
	private String surname;
	private String mission;
	private String password;
	private Equipment equipement;
	
	public Agent(String name, String surname, String mission, String password, Equipment equipement) {
		super();
		this.name = name;
		this.surname = surname;
		this.mission = mission;
		this.password = password;
		this.equipement = equipement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMission() {
		return mission;
	}

	public void setMission(String mission) {
		this.mission = mission;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Equipment getEquipement() {
		return equipement;
	}

	public void setEquipement(Equipment equipement) {
		this.equipement = equipement;
	}
}
