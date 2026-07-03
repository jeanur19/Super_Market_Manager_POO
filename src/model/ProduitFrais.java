package model;

import java.util.Date;

//Sous-classe de Produit : produits périssables (ex: fruits, légumes, produits laitiers)
public class ProduitFrais extends Produit {

	
	private Date datePeremption;
	
	private double temperatureConservation;
	
	
	// Constructeur d'initialisation
	public ProduitFrais(int reference, String designation, double prixAchat, double prixVente, int quantiteStock, Date datePeremption, double temperatureConservation) {
	    super(reference, designation, prixAchat, prixVente, quantiteStock);
	    this.datePeremption = datePeremption;
	    this.temperatureConservation = temperatureConservation;
	}

	// Accès et modification de la date de péremption
	public Date getDatePeremption() {
		return datePeremption;
	}


	public void setDatePeremption(Date datePeremption) {
		this.datePeremption = datePeremption;
	}

	// Accès et modification de la température de conservation
	public double getTemperatureConservation() {
		return temperatureConservation;
	}


	public void setTemperatureConservation(double temperatureConservation) {
		this.temperatureConservation = temperatureConservation;
	}
	
	//On  Vérifie si le produit est périmé (date de péremption dépassée)
	public boolean verifierPeremption() {
	    Date aujourdhui = new Date();
	    if (this.datePeremption.before(aujourdhui)) {
	        return true;
	    } else {
	        return false;
	    }
	}

	// Représentation textuelle de l'objet ProduitFrais
	public String toString() {
		return "ProduitFrais [datePeremption=" + datePeremption + ", temperatureConservation=" + temperatureConservation
				+ "]";
	}
	
}
