package model;

import java.util.ArrayList;


//Classe représentant le supermarché dans son ensemble
public class Supermarche {
	
	
	// Déclaration des champs (attributs de la classe Supermarche)
	private String nom;
	private ArrayList<Produit> produits;
	private ArrayList<Client> clients;
	private ArrayList<Employe> employes;
	private ArrayList<Rayon> rayons;
	private ArrayList<Vente> ventes;
	
	
	// Constructeur d'initialisation
	public Supermarche(String nom) {
	    this.nom = nom;
	    this.produits = new ArrayList<Produit>();
	    this.clients = new ArrayList<Client>();
	    this.employes = new ArrayList<Employe>();
	    this.rayons = new ArrayList<Rayon>();
	    this.ventes = new ArrayList<Vente>();
	}

	// Accès et modification du nom du supermarché
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

	// Accès et modification de la liste des produits
	public ArrayList<Produit> getProduits() {
		return produits;
	}


	public void setProduits(ArrayList<Produit> produits) {
		this.produits = produits;
	}


	public ArrayList<Client> getClients() {
		return clients;
	}

	// Accès et modification de la liste des clients
	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	// Accès et modification de la liste des employés
	public ArrayList<Employe> getEmployes() {
		return employes;
	}


	public void setEmployes(ArrayList<Employe> employes) {
		this.employes = employes;
	}

	// Accès et modification de la liste des rayons
	public ArrayList<Rayon> getRayons() {
		return rayons;
	}


	public void setRayons(ArrayList<Rayon> rayons) {
		this.rayons = rayons;
	}


	public ArrayList<Vente> getVentes() {
		return ventes;
	}

	// Accès et modification de la liste des ventes
	public void setVentes(ArrayList<Vente> ventes) {
		this.ventes = ventes;
	}

	
	// Ajoute un produit à la liste des produits du supermarché
	public void ajouterProduit(Produit produit) {
	    this.produits.add(produit);
	}
	
	// Ajoute un client à la liste des clients du supermarché
	public void ajouterClient(Client client) {
	    this.clients.add(client);
	}
	
	// Enregistrement  d'une nouvelle vente dans le supermarché
	public void enregistrerVente(Vente vente) {
	    this.ventes.add(vente);
	}
	
	// Calcul du chiffre d'affaires total du supermarché (somme des ventes)
		public double calculerChiffreAffaires() {
		    double chiffreAffaires = 0;
		    // TODO : compléter une fois que la classe Vente aura un attribut de montant
		    // for (int i = 0; i < this.ventes.size(); i++) {
		    //     chiffreAffaires = chiffreAffaires + this.ventes.get(i).getMontant();
		    // }
		    return chiffreAffaires;}
		
	// Affichage des produits dont le stock est faible (seuil fixé à 10 par exemple)
	public void afficherStockFaible() {
	    for (int i = 0; i < this.produits.size(); i++) {
	        Produit produit = this.produits.get(i);
	        if (produit.getQuantiteStock() < 10) {
	            System.out.println(produit.getDesignation() + " - Stock faible : " + produit.getQuantiteStock());
	        }
	    }
	}
}
