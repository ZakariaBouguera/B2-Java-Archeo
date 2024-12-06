package fr.babylone.archeo.entites;

public class Site {
	private int numero;
	private int longueur;
	private int largeur;
	private ZoneFouille zoneFouille;
	
	public Site (int numero, int longueur, int largeur, ZoneFouille zoneFouille) {
		this.numero = numero;
		this.longueur = longueur;
		this.largeur = largeur;
		this.zoneFouille = zoneFouille;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public ZoneFouille getZoneFouille() {
		return zoneFouille;
	}
	
	public void setZoneFouille(ZoneFouille zoneFouille) {
		this.zoneFouille = zoneFouille;
	}
	public String Superficie() {
		return "superficie =" + longueur*largeur;
	}

	@Override
	public String toString() {
		return "Site [numero=" + numero + ", longueur=" + longueur + ", largeur=" + largeur + ", zoneFouille="
				+ zoneFouille + "]";
	}
	
	
}

