package model;
public class Caissier extends Employe {
	// Déclaration du champ (attribut propre à Caissier)
	private int numeroCaisse;
	// Constructeur d'initialisation
	public Caissier(int matricule, String nom, String prenom, double salaire, int numeroCaisse) {
	    super(matricule, nom, prenom, salaire);
	    this.numeroCaisse = numeroCaisse;
	}
	public int getNumeroCaisse() {
		return numeroCaisse;
	}
	public void setNumeroCaisse(int numeroCaisse) {
		this.numeroCaisse = numeroCaisse;}
		// Ouvre la caisse pour débuter les ventes
		public void ouvrirCaisse() {
		    System.out.println("Caisse n°" + this.getNumeroCaisse() + " ouverte.");
		} 
		// Effectue une vente à la caisse
		public void effectuerVente() {
		    // TODO : compléter une fois que la classe Vente sera terminée (Personne 3)
		    System.out.println("Vente enregistrée à la caisse n°" + this.getNumeroCaisse());
		}
		@Override //representation textuelle de l'objet caissier
		public String toString() {
			return "Caissier [numeroCaisse=" + numeroCaisse + "]";
		}
		}
	
