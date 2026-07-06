package model;
public class Employe {
	// Déclaration des champs (attributs de la classe Employe)
	private int matricule;
	private String nom;
	private String prenom;
	private double salaire;
	
	// Constructeur d'initialisation
	public Employe(int matricule, String nom, String prenom, double salaire) {
	    this.matricule = matricule;
	    this.nom = nom;
	    this.prenom = prenom;
	    this.salaire = salaire;
	}
	// Accès et modification du matricule

	public int getMatricule() {
		return matricule;
	}
	// Accès et modification du nom
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	// Accès et modification du prénom
	public String getNom() {
		return nom;
	}
	// Accès et modification du salaire
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	// Affiche les informations de l'employé dans la console
	public void afficherInformations() {
	    System.out.println("Matricule : " + this.matricule);
	    System.out.println("Nom : " + this.nom);
	    System.out.println("Prénom : " + this.prenom);
	    System.out.println("Salaire : " + this.salaire + " Fcfa");
	}
     
	// Représentation textuelle de l'objet Employe
	public String toString() {
		return "Employe [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
	}
}
