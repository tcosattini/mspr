package model;

public enum Equipments {
	mousqueton ("mousqueton Mousqueton"),
	gants ("gants Gants d�intervention"),
	brassard ("brassard Brassard de s�curit�"),
	menottes ("menottes Porte menottes"),
	cyno ("menottes Porte menottes"),
	talky ("menottes Porte menottes"),
	lampe ("lampe Lampe Torche"),
	kit ("kit Kit oreillette"),
	taser ("taser Tasers"),
	lacrymo ("lacrymo Bombes lacrymog�nes");

	private String name = "";
	
	Equipments(String name) {
		this.name = name;
	}

	public String toString(){
		return name;
  	}
}
