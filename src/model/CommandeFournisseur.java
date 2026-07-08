package model;

import java.util.ArrayList;
import java.util.Date;
public class CommandeFournisseur {
	
	// Variable static partagee par toutes les commandes : sert de compteur
	private static int compteurCommande = 0;
	// Variables d'instance
		private int numeroCommande;
		private Date date;
		private Fournisseur fournisseur;
		private ArrayList<Produit> listeProduits;
		private String etatCommande;
		
		// Constructeurs
		public CommandeFournisseur(Fournisseur pFournisseur) {
		    compteurCommande = compteurCommande + 1;
		    numeroCommande = compteurCommande;
		    date = new Date();
		    fournisseur = pFournisseur;
		    listeProduits = new ArrayList<Produit>();
		    etatCommande = "En attente";
		}

		public static int getCompteurCommande() {
			return compteurCommande;
		}

		public static void setCompteurCommande(int compteurCommande) {
			CommandeFournisseur.compteurCommande = compteurCommande;
		}

		public int getNumeroCommande() {
			return numeroCommande;
		}

		public void setNumeroCommande(int numeroCommande) {
			this.numeroCommande = numeroCommande;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public Fournisseur getFournisseur() {
			return fournisseur;
		}

		public void setFournisseur(Fournisseur fournisseur) {
			this.fournisseur = fournisseur;
		}

		public ArrayList<Produit> getListeProduits() {
			return listeProduits;
		}

		public void setListeProduits(ArrayList<Produit> listeProduits) {
			this.listeProduits = listeProduits;
		}

		public String getEtatCommande() {
			return etatCommande;
		}

		public void ajouterProduit(Produit produit) {
		    listeProduits.add(produit);
		}

		public void changerEtat(String nouvelEtat) {
		    etatCommande = nouvelEtat;
		}
		public void receptionnerCommande() {
		    for (int i = 0; i < listeProduits.size(); i++) {
		        listeProduits.get(i).ajouterStock(1);
		    }
		    etatCommande = "Livree";
		}
		public String afficher() {
		    String str = "Commande [numero=" + numeroCommande + ", date=" + date + ", fournisseur=" 
		            + fournisseur.getNom() + ", nombreProduits=" + listeProduits.size() 
		            + ", etat=" + etatCommande + "]";
		    return str;
		}
}
