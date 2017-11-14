package view;

import model.ModeleDynamique;
import salaire.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AjoutEmploye extends JPanel {

    private final TextField lFirstName;
    private final TextField lLastName;
    private final JComboBox combo;
    private final TextField lDate;
    private final TextField lCalcul;
    private final TextField lAge;
    private final JTable tableau;

    public AjoutEmploye(JFrame fenetre, JTable tableau) {

        this.tableau = tableau;
        fenetre.setLocationRelativeTo(null);
        JButton ajouter = new JButton("Ajouter l'employe a la liste");

        JButton retour = new JButton(" retour dasboard");
        retour.addActionListener(tab -> {
            fenetre.getContentPane().removeAll();
            Dashboard retourDashboard = new Dashboard(fenetre,tableau);
            fenetre.getContentPane().add(retourDashboard);
            fenetre.revalidate();
            fenetre.repaint();
        });


        Label lbl = new Label("Veuillez completer le formulaire");
        String[] tab = {"Vendeur", "Manutention", "ManutentionRisque", "Producteur","ProducteurRisque", "Representant"};

        fenetre.add(lbl);

        Label jFirstName = new Label("Nom");
        lFirstName = new TextField(10);
        Label jLastName = new Label("Prenom");
        lLastName = new TextField(10);
        Label jAge = new Label("Age");
        lAge = new TextField(10);
        Label lCombo = new Label("Type");
        combo = new JComboBox(tab);
        Label jDate = new Label("Date Entree");
        lDate = new TextField(10);
        Label jCalcul = new Label("Base Calcul");
        lCalcul = new TextField(10);


        fenetre.getContentPane().add(jFirstName);
        fenetre.getContentPane().add(lFirstName);
        fenetre.getContentPane().add(jLastName);
        fenetre.getContentPane().add(lLastName);
        fenetre.getContentPane().add(jAge);
        fenetre.getContentPane().add(lAge);
        fenetre.getContentPane().add(lCombo);
        fenetre.getContentPane().add(combo);
        fenetre.getContentPane().add(jDate);
        fenetre.getContentPane().add(lDate);
        fenetre.getContentPane().add(jCalcul);
        fenetre.getContentPane().add(lCalcul);

        ajouter.addActionListener(this::addEmployee);



        fenetre.getContentPane().add(ajouter);
        fenetre.getContentPane().add(retour);


        //fenetre.pack();
        fenetre.setVisible(true);
    }

    private void addEmployee(ActionEvent actionEvent) {

        String prenom =  lFirstName.getText();
        String nom = lLastName.getText();
        int age = Integer.parseInt(lAge.getText());
        String type = (String) combo.getSelectedItem();
        String date = lDate.getText();
        int base = Integer.parseInt(lCalcul.getText());

        ModeleDynamique model = (ModeleDynamique) tableau.getModel();

        switch (type)
        {
            case "Vendeur":
                model.addEmploye(new Vendeur(nom, prenom, age, date, base)); ;
                break;
            case "Representant":
                model.addEmploye(new Representant(nom, prenom, age, date, base));
                break;
            case "Producteur":
                model.addEmploye(new Producteur(nom, prenom, age, date, base));
                break;
            case "Manutention":
                model.addEmploye(new Manutention(nom, prenom, age, date, base));
                break;
            case "ProducteurRisque":
                model.addEmploye(new ProducteurRisque(nom, prenom, age, date, base));
                break;
            case "ManutentionRisque":
                model.addEmploye(new ManutentionRisque(nom, prenom, age, date, base));
                break;
            default:
                System.out.println("Ajout Impossible, type inconnu");
        }

        System.out.println("ajoute !");

    }

}