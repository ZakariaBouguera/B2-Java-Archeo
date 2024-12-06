package fr.babylone.archeo.entites;
public class Professeur extends Archeologue {

		private int corps = EC;
		public static final int EC = 1;
		public static final int MC = 2;
		
		public Professeur(int numero, String nom, String prenom, int corps) {
			super(numero, nom, prenom);
			this.corps=corps;
		}

		public int getCorps() {
			return corps;
		}

		public void setCorps(int corps) {
			this.corps = corps;
		}

		public static int getEc() {
			return EC;
		}

		public static int getMc() {
			return MC;
		}

		@Override
		public String toString() {
			return "Professeur [numero = " + getNumero() + ", nom = " + getNom() + ", prenom =" + getPrenom() +  ", corps = " + corps + "]";
		}
		
}

