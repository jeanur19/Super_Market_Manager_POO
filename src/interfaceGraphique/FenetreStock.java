package interfaceGraphique;





import javax.swing.*;
import model.*;

public class FenetreStock extends JFrame {


    
	private static final long serialVersionUID = 1L;
	private Supermarche supermarche;


    public FenetreStock(Supermarche supermarche) {


        this.supermarche = supermarche;


        setTitle("Gestion du Stock");
        setSize(500,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        JTextArea zone = new JTextArea();


        for(Produit p : supermarche.getProduits()) {

            zone.append(p.toString()+"\n");

        }


        add(new JScrollPane(zone));


    }

}