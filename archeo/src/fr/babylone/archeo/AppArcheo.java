package fr.babylone.archeo;
import fr.babylone.archeo.entites.Site;
import fr.babylone.archeo.entites.ZoneFouille;
import java.util.ArrayList;
import fr.babylone.archeo.entites.AnneeEtude;
import fr.babylone.archeo.entites.Conservation;
import fr.babylone.archeo.entites.Objet;
import fr.babylone.archeo.entites.Archeologue;
import fr.babylone.archeo.entites.Professeur;
import fr.babylone.archeo.entites.Etudiant;
public class AppArcheo {
	public static void main(String[] args) {
		//Zone de fouille
		ZoneFouille zof1 = new ZoneFouille (1,"Cramont"); //qst1
		System.out.println(zof1.toString()); //qst2
		System.out.println(zof1.getNumero()); //qst3
		System.out.println(zof1.getVille()); //qst4
		zof1.setVille("Prouville"); //qst5
		System.out.println(zof1.toString()); //qst6

		//Sites
		Site st1 = new Site (1,4,3,zof1); //qst1
		System.out.println(st1.toString()); //qst2
		System.out.println(st1.getLongueur()); //qst3
		System.out.println(st1.Superficie()); //qst4
		System.out.println(st1.getZoneFouille().getVille()); //qst5
		
		//Objets
		Objet obj1 = new Objet (1, "pied de table",1,Conservation.INTACT);
		System.out.println(obj1.toString());
		System.out.println(obj1.getDesignation());
		System.out.println(obj1.getCompletude());
		System.out.println(obj1.getConservation());
		
		Objet obj2 = new Objet (2, "nez de gargouille",2,Conservation.TRES_MAUVAIS_ETAT);
		System.out.println(obj2.toString());
		System.out.println(obj2.getCompletude());
		obj2.setCompletude(1);
		System.out.println(obj2.getCompletude());
		
		//Archeologue
		Etudiant ark1 = new Etudiant(1,"OSBORN", "Harry", AnneeEtude.L3);
		System.out.println(ark1.toString());
		System.out.println(ark1.getAnneeEtude());
		
		Archeologue ark2 = new Etudiant(2,"ALLEN","Liz",AnneeEtude.M1);
		System.out.println(ark2.toString());
		System.out.println(((Etudiant)ark2).getAnneeEtude());
		
		Professeur ark3 = new Professeur (3,"PARKER","Peter",2);
		System.out.println(ark3.toString());
		System.out.println(ark3.getCorps());
		
		Archeologue ark4 = new Professeur(4, "WATSON", "Mary Jane",1);
		System.out.println(ark4.toString());
		System.out.println(((Professeur)ark4).getCorps());
		
		ArrayList <Archeologue> arks = new  ArrayList <Archeologue>();
		arks.add(ark1);
		arks.add(ark2);
		arks.add(ark3);
		arks.add(ark4);
		
		

		

		


		
		


		
	}
}
