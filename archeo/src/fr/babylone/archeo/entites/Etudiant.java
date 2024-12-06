package fr.babylone.archeo.entites;

public class Etudiant extends Archeologue {
	
	private AnneeEtude  anneeEtude;
	
	public Etudiant(int numero, String nom, String prenom, AnneeEtude anneeEtude) {
		super(numero, nom, prenom);
		this.anneeEtude = anneeEtude;
	}

	public AnneeEtude getAnneeEtude() {
		return anneeEtude;
	}

	public void setAnneeEtude(AnneeEtude anneeEtude) {
		this.anneeEtude = anneeEtude;
	}

	@Override
	public String toString() {
		return "Etudiant [anneeEtude= " + anneeEtude + ", Numero= "+ getNumero() + ", Nom= " + getNom() + ", Prenom= " + getPrenom() + "]" ;
	}

	
	
	
}
