package model;
public class ChefRayon extends Employe {
	    	    // Constructeur d'initialisation
	    public ChefRayon(int matricule, String nom, String prenom, double salaire) {
	        super(matricule, nom, prenom, salaire);
	    }

	    // Ajoute un produit au rayon dont il est responsable
	    public void ajouterProduit(Rayon rayon, Produit produit) {
	        rayon.getListeProduits().add(produit);
	        System.out.println("Produit ajouté au rayon " + rayon.getNomRayon() + " par " + this.getNom());
	    }

	    // Retire un produit du rayon dont il est responsable
	    public void retirerProduit(Rayon rayon, Produit produit) {
	        rayon.getListeProduits().remove(produit);
	        System.out.println("Produit retiré du rayon " + rayon.getNomRayon() + " par " + this.getNom());
	    }

		@Override
		public String toString() {
			return "ChefRayon []";
		}
}




	

