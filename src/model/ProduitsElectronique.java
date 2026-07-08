package model;

public class ProduitsElectronique extends Produit {
	// Déclaration des champs (attributs propres à ProduitElectronique)
	
	
	private String marque;
	private int garantie;
	// Constructeur d'initialisation
	public ProduitsElectronique(int reference, String designation, double prixAchat, double prixVente, int quantiteStock, String marque, int garantie) {
	    super(reference, designation, prixAchat, prixVente, quantiteStock);
	    this.marque = marque;
	    this.garantie = garantie;
	}
	
	// Accès et modification de la marque
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	// Accès et modification de la garantie (en mois)
	public int getGarantie() {
		return garantie;
	}
	// Représentation textuelle de l'objet ProduitsElectroniques
	public String toString() {
		return "ProduitsElectronique [marque=" + marque + ", garantie=" + garantie + "]";
	}

	public void setGarantie(int garantie) {
		this.garantie = garantie;
	}
	
	
}           
