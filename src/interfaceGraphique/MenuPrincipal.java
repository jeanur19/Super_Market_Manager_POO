package interfaceGraphique;


import model.Supermarche;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MenuPrincipal extends JFrame implements ActionListener {

    private Supermarche supermarche;
	private static final long serialVersionUID = 1L;
	private JButton btnProduit;
    private JButton btnRayon;
    private JButton btnStock;
    private JButton btnCaisse;
    private JButton btnQuitter;

    public MenuPrincipal(Supermarche supermarche) {

        this.supermarche = supermarche;

        setTitle("SUPERMARKET MANAGER");
        setSize(450,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6,1,10,10));

        JLabel titre = new JLabel("SUPERMARKET MANAGER", SwingConstants.CENTER);

        btnProduit = new JButton("Gestion des Produits");
        btnRayon = new JButton("Gestion des Rayons");
        btnStock = new JButton("Gestion du Stock");
        btnCaisse = new JButton("Caisse");
        btnQuitter = new JButton("Quitter");

        add(titre);
        add(btnProduit);
        add(btnRayon);
        add(btnStock);
        add(btnCaisse);
        add(btnQuitter);

        btnProduit.addActionListener(this);
        btnRayon.addActionListener(this);
        btnStock.addActionListener(this);
        btnCaisse.addActionListener(this);
        btnQuitter.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    	if(e.getSource()==btnProduit) {
    	    new FenetreProduit(supermarche).setVisible(true);
    	}

    	if(e.getSource()==btnRayon) {
    	    new FenetreRayon(supermarche).setVisible(true);
    	}

    	if(e.getSource()==btnStock) {
    	    new FenetreStock(supermarche).setVisible(true);
    	}

    	if(e.getSource()==btnCaisse) {
    	    new FenetreCaisse(supermarche).setVisible(true);
    	}

    }}


