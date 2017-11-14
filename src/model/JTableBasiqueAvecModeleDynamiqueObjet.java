package model;

import salaire.ManutentionRisque;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JTableBasiqueAvecModeleDynamiqueObjet extends JFrame {

    private ModeleDynamique modele = new ModeleDynamique();
    private JTable tableau;

    public JTableBasiqueAvecModeleDynamiqueObjet() {
        super();

        setTitle("JTable avec modèle dynamique");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tableau = new JTable(modele);

        getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);

        JPanel boutons = new JPanel();

        boutons.add(new JButton(new AddAction()));

        getContentPane().add(boutons, BorderLayout.SOUTH);

        pack();
    }

    public static void main(String[] args) {
        new JTableBasiqueAvecModeleDynamiqueObjet().setVisible(true);
    }

    private class AddAction extends AbstractAction {
        private AddAction() {
            super("Ajouter");
        }

        public void actionPerformed(ActionEvent e) {
            modele.addEmploye(new ManutentionRisque("Antoine", "Gaston", 20, "201è", 45));
        }
    }



}
