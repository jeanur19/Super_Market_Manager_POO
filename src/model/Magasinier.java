package model;
public class Magasinier extends Employe {
	// Constructeur d'initialisation
	public Magasinier(int matricule, String nom, String prenom, double salaire) {
	    super(matricule, nom, prenom, salaire);}
	 // Réceptionne une livraison de produits
	    public void receptionnerLivraison() {
	        //compléter une fois que la classe CommandeFournisseur sera terminée (Personne 3)
	        System.out.println("Livraison réceptionnée par " + this.getNom() + " " + this.getPrenom());}
	     // Met à jour le stock d'un produit
	        public void mettreAJourStock(Produit produit, int quantite) {
	            produit.ajouterStock(quantite);
	            System.out.println("Stock mis à jour pour : " + produit.getDesignation());
	        }
			@Override
			public String toString() {
				return "Magasinier []";
			}
	    }
	
