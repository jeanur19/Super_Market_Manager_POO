package model;

import java.util.Date;

public class Paiement {

	private int numeroPaiement;
	private double montant ;
	private String modePaiement;
	private Date datePaiement;
	private Vente vente;
	
	private static int compteurPaiement=0;
	
	// Constructeur d'initialisation
		public Paiement(double pMontant, String pModePaiement, Vente pVente) {
			compteurPaiement++;
			this.numeroPaiement = compteurPaiement;
			this.montant = pMontant;
			this.modePaiement = pModePaiement;
			this.datePaiement = new Date();
			this.vente = pVente;
		}
	
	public boolean validerPaiement(){
		// Le moment payé doit couvrir au moins le moment de le vente 
		
		if(this.vente != null && this.montant>= this.vente.calculerTotal()){
			return true;
		}
		
		return false;
	}
	public void afficherPaiement() {
		
		System.out.println("--- Détail du paiement ---");
		System.out.println("N° Référence : "+ numeroPaiement);
		System.out.println("Mode de paiement : " + modePaiement+ "F CFA");
		System.out.println("Montant versé : " + montant+ "F CFA");
		System.out.println(" Date :" +datePaiement);
	}
	public int getNumeroPaiement() {
		return numeroPaiement;
	}
	public void setNumeroPaiement(int numeroPaiement) {
		this.numeroPaiement = numeroPaiement;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getModePaiement() {
		return modePaiement;
	}
	public void setModePaiement(String modePaiement) {
		this.modePaiement = modePaiement;
	}
	public Date getDatePaiement() {
		return datePaiement;
	}
	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}
	public Vente getVente() {
		return vente;
	}
	public void setVente(Vente vente) {
		this.vente = vente;
	}
	public static int getCompteurPaiement() {
		return compteurPaiement;
	}
	public static void setCompteurPaiement(int compteurPaiement) {
		Paiement.compteurPaiement = compteurPaiement;
	}
	
}
