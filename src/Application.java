import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import static javax.swing.SwingUtilities.invokeLater;

import model.*;
import view.*;



public class Application {
    public static void main(String[] args){
        invokeLater(Application::windows);
    }


    public static void windows(){
        JFrame fenetre = new JFrame("Application");
        fenetre.setSize(600,600);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(fenetre.EXIT_ON_CLOSE);

        ModeleDynamique modele = new ModeleDynamique();
        JTable tableau;
        tableau = new JTable(modele);


        JButton ajouter = new JButton("Ajouter employe");
        JButton afficher = new JButton("Afficher employes");


        afficher.addActionListener(tab -> {
            fenetre.getContentPane().removeAll();
            AfficherTableau afficherTableau = new AfficherTableau(fenetre, tableau);
            fenetre.getContentPane().add(afficherTableau);
            fenetre.revalidate();
            fenetre.repaint();
        });


        ajouter.addActionListener((ActionEvent tab) -> {
            fenetre.getContentPane().removeAll();
            AjoutEmploye ajouterEmploye = new AjoutEmploye(fenetre, tableau);
            fenetre.getContentPane().add(ajouterEmploye);
            fenetre.revalidate();
            fenetre.repaint();
        });

        fenetre.getContentPane().setLayout(new FlowLayout());
        fenetre.getContentPane().add(afficher);
        fenetre.getContentPane().add(ajouter);

        //fenetre.pack();
        fenetre.setVisible(true);
    }
}
