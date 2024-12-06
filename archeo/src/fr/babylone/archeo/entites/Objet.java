package fr.babylone.archeo.entites;

public class Objet {
	private int numero;
	private String designation;
	private int completude = COMPLET;
	private Conservation conservation;
	
	public static final int COMPLET = 1;
	public static final int PARTIEL = 2;

	
	public Objet (int numero, String designation, int completude, Conservation conservation ) {
		this.numero = numero;
		this.designation = designation;
		this.completude = completude;
		this.conservation = conservation;
	}
	public Objet (int numero, String designation, Conservation conservation ) {
		this.numero = numero;
		this.designation = designation;
		this.conservation = conservation;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getCompletude() {
		return completude;
	}

	public void setCompletude(int completude) {
		this.completude = completude;
	}

	public Conservation getConservation() {
		return conservation;
	}

	public void setConservation(Conservation conservation) {
		this.conservation = conservation;
	}

	@Override
	public String toString() {
		return "Objet [numero=" + numero + ", designation=" + designation + ", completude=" + completude
				+ ", conservation=" + conservation + "]";
	}
	
	
	
}
