package model;

import java.util.Date;
public class Facture {
	
	private int numeroFacture;
	private Date dateFacture;
	private Vente vente;
	private Paiement paiement;
	
	private static int compteurFacture=0;
	
	public Facture(Vente pVente, Paiement pPaiement) {
		
		compteurFacture++;
		
		this.dateFacture =new Date();
		this.vente= pVente;
		this.numeroFacture=compteurFacture;
		this.paiement=pPaiement;
		
	}
	
	public String genererFacture() {
		StringBuilder sb=new StringBuilder();
		
		sb.append("============================================\n");
		sb.append("				SUPER MARKET PLUS			   \n");
		sb.append("============================================\n");
		sb.append("Facture N° : ").append(numeroFacture).append("\n");
		sb.append("Date : ").append(dateFacture).append("\n");
		
		if(vente.getCaissier()!=null){
			sb.append("Caissier : ").append(vente.getCaissier().getNom()).append("\n");
		}
		if (vente.getCaissier()!= null ) {
			sb.append("client : ").append(vente.getClient().getNom()).append("\n");
		}else {
			sb.append("Client : Anonyme\n");
		}
		sb.append("--------------------------------------------\n");
		sb.append(String.format( "%-20s %-10s %-10s\n", "Produit", "P.U", "Total"));
		sb.append("--------------------------------------------\n");
		
		for (int i = 0; i<vente.getPanier().size();i++) {
			
			Produit p = vente.getPanier().get(i);
			
			sb.append(String.format( "%-20s %-10.2f %-10.f\n",
					p.getDesignation(), p.getPrixVente(), p.getPrixVente()));
		}
		sb.append("--------------------------------------------\n");
		sb.append("Montant Total : ").append(vente.calculerTotal()).append(" FCFA ");
		
		if (paiement != null) {
			
			sb.append("Mode de Paiement : ").append(paiement.getModePaiement()).append(" \n");
			sb.append("Montant reçu : ").append(paiement.getMontant()).append("FCFA");
			double monnaie=paiement.getMontant()- vente.calculerTotal();
			sb.append("Monnaie Rendue : ").append(monnaie).append(" FCFA\n");
		}
		sb.append("====================================================================================\n");
		sb.append("				Merci d'être passer chez SUPER MARKET PLUS🙂. Revenez Vite	!!!		   \n");
		sb.append("====================================================================================\n");

		
		
		return sb.toString();
		}
	public void afficherFacture() {
		
		System.out.println(genererFacture());
	}
	public void imprimerFacture() {
		
		System.out.println("Impression en cours...\n" + genererFacture());
	}

	public int getNumeroFacture() {
		return numeroFacture;
	}

	public void setNumeroFacture(int numeroFacture) {
		this.numeroFacture = numeroFacture;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public Vente getVente() {
		return vente;
	}

	public void setVente(Vente vente) {
		this.vente = vente;
	}

	public Paiement getPaiement() {
		return paiement;
	}

	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}

	public static int getCompteurFacture() {
		return compteurFacture;
	}

	public static void setCompteurFacture(int compteurFacture) {
		Facture.compteurFacture = compteurFacture;
	}
	
	
}
