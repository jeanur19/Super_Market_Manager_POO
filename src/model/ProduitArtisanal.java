package model;

//Sous-classe de Produit : produits artisanaux (ex: boulangerie, poissonnerie, boucherie)
public class ProduitArtisanal extends Produit {
	
	
	// Déclaration du champ (attribut propre à ProduitArtisanal)
	private String typeArtisanal; // boulangerie, poissonnerie ou boucherie

	
	// Constructeur d'initialisation
	public ProduitArtisanal(int reference, String designation, double prixAchat, double prixVente, int quantiteStock, String typeArtisanal) {
	    super(reference, designation, prixAchat, prixVente, quantiteStock);
	    this.typeArtisanal = typeArtisanal;
	}

	// Accès et modification du type artisanal

	public String getTypeArtisanal() {
		return typeArtisanal;
	}


	@Override
	public String toString() {
		return "ProduitArtisanal [typeArtisanal=" + typeArtisanal + "]";
	}
	// Représentation textuelle de l'objet ProduitArtisanal
	public void setTypeArtisanal(String typeArtisanal) {
		this.typeArtisanal = typeArtisanal;
	}
}
