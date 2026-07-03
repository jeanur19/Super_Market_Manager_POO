package model;

import java.util.ArrayList;
//Classe représentant un rayon du supermarché
public class Rayon {

	// Déclaration des champs (attributs de la classe Rayon)
	private int codeRayon;
	private String nomRayon;
	private ChefRayon responsable;
	private ArrayList<Produit> listeProduits;
	
	// Constructeur d'initialisation
	public Rayon(int codeRayon, String nomRayon, ChefRayon responsable) {
	    this.codeRayon = codeRayon;
	    this.nomRayon = nomRayon;
	    this.responsable = responsable;
	    this.listeProduits = new ArrayList<Produit>();
	}
	// Accès et modification du code du rayon
	public int getCodeRayon() {
		return codeRayon;
	}

	public void setCodeRayon(int codeRayon) {
		this.codeRayon = codeRayon;
	}
	// Accès et modification du nom du rayon
	public String getNomRayon() {
		return nomRayon;
	}

	public void setNomRayon(String nomRayon) {
		this.nomRayon = nomRayon;
	}
	// Accès et modification du responsable du rayon
	public ChefRayon getResponsable() {
		return responsable;
	}

	public void setResponsable(ChefRayon responsable) {
		this.responsable = responsable;
	}
	// Accès et modification de la liste des produits du rayon
	public ArrayList<Produit> getListeProduits() {
		return listeProduits;
	}

	public void setListeProduits(ArrayList<Produit> listeProduits) {
		this.listeProduits = listeProduits;
	};
	
	// Calcule la valeur totale du stock des produits présents dans le rayon
	public double calculerValeurStock() {
	    double valeurTotale = 0;
	    for (int i = 0; i < this.listeProduits.size(); i++) {
	        Produit produit = this.listeProduits.get(i);
	        valeurTotale = valeurTotale + (produit.getPrixVente() * produit.getQuantiteStock());
	    }
	    return valeurTotale;
	}
	@Override
	public String toString() {
		return "Rayon [codeRayon=" + codeRayon + ", nomRayon=" + nomRayon + ", responsable=" + responsable
				+ ", listeProduits=" + listeProduits + "]";
	}
	
}
