package model;

import java.util.ArrayList;
import java.util.Date;

public class Vente {

	//Variable d'instance
	private int numeroVente;
	private Date date;
	private ArrayList<Produit> panier;
	private Employe caissier;
	private Client client;
	  
	
	private static int compteurVente =0;
	
	public Vente(Client pClient, Employe pCaissier) {
		compteurVente++;
		this.numeroVente=compteurVente;
		this.date=new Date();//Date actuelle de la vente
		
		this.client=pClient;
		this.caissier=pCaissier;
		this.panier=new ArrayList<Produit>();
		
	}
// Methode pour ajouter un produit au panier
	
	public void ajouterProduit(Produit p){
		if(p!=null && p.getQuantiteStock()>0) {
			this.panier.add(p);
		} 
	}
	
	//Méthode pour supprimer un produit du panier 
	public void supprimer(Produit p) {
		this.panier.remove(p);
	}
	
	//Calcul du montant total des produits du panier 
	
	public double calculerTotal() {
		
		double total=0;
		for (Produit p : panier) {
			
			total+= p.getPrixVente();
		
		}
		return total;
	}
	//Validation de la vente : Cela réduit et ajoute la vente à l'historiquee du client
	public void validerVente() {
	//1.Réduire le stock de chaquue poduit scanné 
		for (int i = 0; i< panier.size(); i++) {
			
			panier.get(i).retirerStock(1);
			
		}
		//2.Ajouter cette vente à l'historique du client s'il est enregistré
		
		if(this.client != null) {
			
			this.client.ajouterVente(this);
			// Ajouter des points de fidélité (ex: 1 point par tranche de 1000 FCFA)
			
			int points= (int)(calculerTotal()/1000);
			this.client.ajouterPoints(points);
			
			
			
		}
	}

	public int getNumeroVente() {
		return numeroVente;
	}

	public void setNumeroVente(int numeroVente) {
		this.numeroVente = numeroVente;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ArrayList<Produit> getPanier() {
		return panier;
	}

	public void setPanier(ArrayList<Produit> panier) {
		this.panier = panier;
	}

	public Employe getCaissier() {
		return caissier;
	}

	public void setCaissier(Employe caissier) {
		this.caissier = caissier;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public static int getCompteurVente() {
		return compteurVente;
	}

	public static void setCompteurVente(int compteurVente) {
		Vente.compteurVente = compteurVente;
	}
	
	@Override
	public String toString() {
		return "Vente [numeroVente=" + numeroVente + ", date=" + date + ", panier=" + panier + ", caissier=" + caissier
				+ ", client=" + client + "]";
	}
	
	

}
