package model;

public class Produit {

	// Déclaration des champs (attributs de la classe Produit)
	private int reference;
	
	
	private String designation;
	
	
	private double prixAchat;
	
	
	private double prixVente;
	
	
	private int quantiteStock;
	
	
	// Constructeur d'initialisation
	public Produit(int reference, String designation, double prixAchat, double prixVente, int quantiteStock) {
	    this.reference = reference;
	    this.designation = designation;
	    this.prixAchat = prixAchat;
	    this.prixVente = prixVente;
	    this.quantiteStock = quantiteStock;
	}
	// Accès et modification de la référence
	    public int getReference() {
	        return reference;
	    }

	    public void setReference(int reference) {
	        this.reference = reference;}
	        
	 // Accès et modification de la désignation
	        public String getDesignation() {
	            return designation;
	        }

	        public void setDesignation(String designation) {
	            this.designation = designation;
	        
	    
	}
	     // Accès et modification du prix d'achat
			public double getPrixAchat() {
				return prixAchat;
			}

			public void setPrixAchat(double prixAchat) {
				this.prixAchat = prixAchat;
			}
			// Accès et modification du prix de vente
			public double getPrixVente() {
				return prixVente;
			}

			public void setPrixVente(double prixVente) {
				this.prixVente = prixVente;
			}
			//Accès et modification de la quantité en srtock
			public int getQuantiteStock() {
				return quantiteStock;
			}

			public void setQuantiteStock(int quantiteStock) {
				this.quantiteStock = quantiteStock;
			}
			
			// Ajout d'une quantité au stock existant
			public void ajouterStock(int quantite) {
			    this.quantiteStock = this.quantiteStock + quantite;
			}
			
			// Retrait  d'une quantité du stock existant, si le stock est suffisant
			public void retirerStock(int quantite) {
			    if (quantite <= this.quantiteStock) {
			        this.quantiteStock = this.quantiteStock - quantite;
			    } else {
			        System.out.println("Quantité insuffisante en stock. Veuillez inscrire une quantité valide");
			    }
			}
			
			// Modification du prix de vente du produit
			public void modifierPrix(double nouveauPrix) {
			    if (nouveauPrix >= 0) {
			        this.prixVente = nouveauPrix;
			    } else {
			        System.out.println("Le prix proposé est invalide.");
			    }
			}
			
			// Calcule de la marge réalisée sur le produit (prix de vente - prix d'achat)
			public double calculerMarge() {
			    double marge = this.prixVente - this.prixAchat;
			    return marge;
			}
			@Override
			public String toString() {
				return "Produit [reference=" + reference + ", designation=" + designation + ", prixAchat=" + prixAchat
						+ ", prixVente=" + prixVente + ", quantiteStock=" + quantiteStock + "]";
			}
}
