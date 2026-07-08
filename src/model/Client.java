package model;

import java.util.ArrayList;
public class Client {
	
	
	// Variables d'instance
		private int numeroClient;
		private String nom;
		private String telephone;
		private int pointsFidelite;
		private ArrayList<Vente> historiqueAchats;
		
		private static int compteurClient = 0;

		public Client(String pNom, String pTelephone) {
		    compteurClient = compteurClient + 1;
		    numeroClient = compteurClient;
		    nom = pNom;
		    telephone = pTelephone;
		    pointsFidelite = 0;
		    historiqueAchats = new ArrayList<Vente>();
		}

		public int getNumeroClient() {
			return numeroClient;
		}

		public void setNumeroClient(int numeroClient) {
			this.numeroClient = numeroClient;
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

		public int getPointsFidelite() {
			return pointsFidelite;
		}

		public void setPointsFidelite(int pointsFidelite) {
			this.pointsFidelite = pointsFidelite;
		}

		public ArrayList<Vente> getHistoriqueAchats() {
			return historiqueAchats;
		}

		public void setHistoriqueAchats(ArrayList<Vente> historiqueAchats) {
			this.historiqueAchats = historiqueAchats;
		}

		public static int getCompteurClient() {
			return compteurClient;
		}

		public static void setCompteurClient(int compteurClient) {
			Client.compteurClient = compteurClient;
		}
		public void ajouterPoints(int nombrePoints) {
			if(nombrePoints>= 0) {
				
				pointsFidelite=pointsFidelite + nombrePoints;
		}
	}
		public String consulterHistorique() {
			String str = "Historique des achats de " + nom + " :\n";
			
			for (int i=0; 1< historiqueAchats.size(); i++) { 
				str=str + "-"+historiqueAchats.get(i).toString()+ "\n";
				} 
				return str;
		}
}
		


