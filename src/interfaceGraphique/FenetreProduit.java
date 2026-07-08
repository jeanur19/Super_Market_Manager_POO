package interfaceGraphique;

import java.awt.GridLayout;

import javax.swing.*;
import model.*;

public class FenetreProduit extends JFrame {

    private static final long serialVersionUID = 1L;

    private Supermarche supermarche;

    private JTextField txtReference;
    private JTextField txtDesignation;
    private JTextField txtPrixAchat;
    private JTextField txtPrixVente;
    private JTextField txtQuantite;

    private JButton btnAjouter;

    public FenetreProduit(Supermarche supermarche) {

        this.supermarche = supermarche;

        setTitle("Gestion des Produits");
        setSize(500,450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(6,2,10,10));

        txtReference = new JTextField();
        txtDesignation = new JTextField();
        txtPrixAchat = new JTextField();
        txtPrixVente = new JTextField();
        txtQuantite = new JTextField();

        btnAjouter = new JButton("Ajouter Produit");


        panel.add(new JLabel("Référence"));
        panel.add(txtReference);

        panel.add(new JLabel("Désignation"));
        panel.add(txtDesignation);

        panel.add(new JLabel("Prix Achat"));
        panel.add(txtPrixAchat);

        panel.add(new JLabel("Prix Vente"));
        panel.add(txtPrixVente);

        panel.add(new JLabel("Quantité"));
        panel.add(txtQuantite);

        panel.add(btnAjouter);


        add(panel);


        btnAjouter.addActionListener(e -> {

            Produit produit = new Produit(
                    Integer.parseInt(txtReference.getText()),
                    txtDesignation.getText(),
                    Double.parseDouble(txtPrixAchat.getText()),
                    Double.parseDouble(txtPrixVente.getText()),
                    Integer.parseInt(txtQuantite.getText())
            );


            supermarche.ajouterProduit(produit);


            JOptionPane.showMessageDialog(this,
                    "Produit ajouté avec succès");

        });


    }
}