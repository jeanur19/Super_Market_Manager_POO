package model;

import java.util.ArrayList;

public class Fournisseur {
	

		// Variables d'instance
		private String code;
		private String nom;
		private String telephone;
		private String adresse;
		private ArrayList<Produit> listeProduits;
		
		public Fournisseur(String pCode, String pNom, String pTelephone, String pAdresse) {
		    code = pCode;
		    nom = pNom;
		    telephone = pTelephone;
		    adresse = pAdresse;
		    listeProduits = new ArrayList<Produit>();
		}
		public void ajouterProduit(Produit produit) {
		    listeProduits.add(produit);
		}

		public String getCode() {
			return code;
		}


		public void setCode(String code) {
			this.code = code;
		}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


		public String getTelephone() {
			return telephone;
		}


		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}


		public String getAdresse() {
			return adresse;
		}


		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		public String afficher() {
		    String str = "Fournisseur [code=" + code + ", nom=" + nom + ", telephone=" + telephone 
		            + ", adresse=" + adresse + ", nombreProduits=" + listeProduits.size() + "]";
		    return str;
		}
	}

