package view;

import model.*;
import salaire.ManutentionRisque;
import model.ModeleDynamique;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.StringWriter;

public class AfficherTableau extends JPanel {

        private final JTable tableau;

        public AfficherTableau (JFrame fenetre, JTable tableau){

            this.tableau = tableau;
                fenetre.setTitle("Affichage des Employes");
                fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                fenetre.getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);


            JButton retour = new JButton(" retour dasboard");
            retour.addActionListener(tab -> {
                fenetre.getContentPane().removeAll();
                Dashboard retourDashboard = new Dashboard(fenetre, tableau);
                fenetre.getContentPane().add(retourDashboard);
                fenetre.revalidate();
                fenetre.repaint();
            });

            fenetre.getContentPane().add(retour);
            fenetre.setVisible(true);

            ModeleDynamique model = (ModeleDynamique) tableau.getModel();
            double salaireMoyen = model.salaireMoyen();
            System.out.println(salaireMoyen);

            JLabel salaire = new JLabel("Salaire moyen = " + salaireMoyen);
            fenetre.getContentPane().add(salaire);




        }

        public static void main(String[] args) {
            new JTableBasiqueAvecModeleDynamiqueObjet().setVisible(true);
        }





    }

