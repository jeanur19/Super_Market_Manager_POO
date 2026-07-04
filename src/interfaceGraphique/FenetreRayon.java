package interfaceGraphique;

import javax.swing.JFrame;

// Fenêtre permettant de gérer l'ajout ou l'affichage d'un rayon
public class FenetreRayon extends JFrame {
 //Constructeur de configuration de la fenêtre 
	
	public FenetreRayon() {
		super();
		
		proprietesFenetre();
	}
	
	//Definittion des propriétés de la fenêtre (taille, comportement, position )
private void proprietesFenetre() {
	this.setSize(500, 300);
	this.setResizable(false);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("Gestion des Rayon");
}

}
