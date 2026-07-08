package interfaceGraphique;

import javax.swing.*;
import model.*;

public class FenetreCaisse extends JFrame {

    private static final long serialVersionUID = 1L;

    private Supermarche supermarche;
    private JTextArea ticket;

    public FenetreCaisse(Supermarche supermarche) {

        this.supermarche = supermarche;

        setTitle("Caisse - Ticket");
        setSize(500,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        ticket = new JTextArea();
        ticket.setEditable(false);


        JButton btnTicket = new JButton("Générer ticket");


        add(new JScrollPane(ticket), "Center");
        add(btnTicket, "South");


        btnTicket.addActionListener(e -> {


            ticket.setText("");

            ticket.append("******** SUPERMARKET MANAGER ********\n\n");


            if(supermarche.getProduits().isEmpty()) {

                ticket.append("Aucun produit vendu\n");

            } else {

                ticket.append("PRODUITS :\n\n");


                for(Produit p : supermarche.getProduits()) {

                    ticket.append(
                    p.getDesignation()
                    +"  "
                    +p.getPrixVente()
                    +" FCFA\n"
                    );

                }

            }


            ticket.append("\n*****************************\n");
            ticket.append("Merci pour votre achat !");

        });


    }

}