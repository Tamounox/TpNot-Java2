package view;
import javax.swing.*;

public class Dashboard extends JPanel{

    public Dashboard(JFrame fenetre, JTable tableau) {

        this.setVisible(true);
        fenetre.setLocationRelativeTo(null);

        JButton ajouter = new JButton("Ajouter employe");
        JButton afficher = new JButton("Afficher employes");

        afficher.addActionListener(tab -> {
            fenetre.getContentPane().removeAll();
            AfficherTableau afficherTableau = new AfficherTableau(fenetre,tableau);
            fenetre.getContentPane().add(afficherTableau);
            fenetre.revalidate();
            fenetre.repaint();
        });

        ajouter.addActionListener(tab -> {
            fenetre.getContentPane().removeAll();
            AjoutEmploye ajouterEmploye = new AjoutEmploye(fenetre, tableau);
            fenetre.getContentPane().add(ajouterEmploye);
            fenetre.revalidate();
            fenetre.repaint();
        });

        fenetre.getContentPane().add(afficher);
        fenetre.getContentPane().add(ajouter);


    }


}
