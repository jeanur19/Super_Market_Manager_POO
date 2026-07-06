package model;
public class Directeur extends Employe {
	// Constructeur d'initialisation
	public Directeur(int matricule, String nom, String prenom, double salaire) {
	    super(matricule, nom, prenom, salaire);
	}
	// Affichage des statistiques générales du supermarché
	public void voirStatistiques(Supermarche supermarche) {
	    System.out.println("=== Statistiques du supermarché ===");
	    System.out.println("Chiffre d'affaires : " + supermarche.calculerChiffreAffaires() + " Fcfa");
	    System.out.println("Nombre de produits : " + supermarche.getProduits().size());
	    System.out.println("Nombre de clients : " + supermarche.getClients().size());
	    System.out.println("Nombre d'employés : " + supermarche.getEmployes().size());
	}
	// Affichage des listes des employés du supermarché
	public void consulterEmployes(Supermarche supermarche) {
	    System.out.println("=== Liste des employés ===");
	    for (int i = 0; i < supermarche.getEmployes().size(); i++) {
	        Employe employe = supermarche.getEmployes().get(i);
	        System.out.println(employe.toString());
	    }
	}
	@Override
	public String toString() {
		return "Directeur []";
	}
}
