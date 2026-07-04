package interfaceGraphique;

import javax.swing.JFrame;

public class FenetreStock extends JFrame {
	// Constructeur : configuration de la fenêtre
	public FenetreStock() {
	    super();
	    proprietesFenetre();
	}

	// Définit les propriétés de la fenêtre (taille, comportement, position)
	private void proprietesFenetre() {
	    this.setSize(500, 450);
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setTitle("Gestion du Stock");
	}
}
