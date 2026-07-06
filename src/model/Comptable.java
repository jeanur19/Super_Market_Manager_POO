package model;
public class Comptable extends Employe{
	// Constructeur d'initialisation
	public Comptable(int matricule, String nom, String prenom, double salaire) {
	    super(matricule, nom, prenom, salaire); }
	 // Calcule la recette totale du supermarché
	    public double calculerRecette(Supermarche supermarche) {
	        return supermarche.calculerChiffreAffaires();}
	     // Génère un rapport sur l'activité du supermarché
	        public void genererRapport(Supermarche supermarche) {
	            System.out.println("=== Rapport généré par " + this.getNom() + " " + this.getPrenom() + " ===");
	            System.out.println("Chiffre d'affaires : " + supermarche.calculerChiffreAffaires() + " Fcfa");
	            supermarche.afficherStockFaible();
	        }
			@Override
			public String toString() {
				return "Comptable []";
			}
	    }
	

