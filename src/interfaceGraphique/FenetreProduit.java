package interfaceGraphique;

import javax.swing.JFrame;

//Fenêtre permettant de gérer l'ajout/affichage d'un produit
public class FenetreProduit extends JFrame{

	// Constructeur : configuration de la fenêtre
	public FenetreProduit() {
	    super();
	    proprietesFenetre();
	}

	// Définit les propriétés de la fenêtre (taille, comportement, position)
	private void proprietesFenetre() {
	    this.setSize(500, 450);
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setTitle("Gestion des Produits");
	}
}
