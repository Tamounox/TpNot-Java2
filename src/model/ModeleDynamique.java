package model;

import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import salaire.*;
import view.AfficherTableau;

public class ModeleDynamique extends AbstractTableModel {
    // private final personel listeEntreprise = new personel();
    private final List<Employe> listeEntreprise = new ArrayList<Employe>();
   // private int compteur = 0;

    private final String[] entetes = {"Nom", "Prénom", "Age", "Date entrée", "Type", "Base Calcul", "Salaire"};

    public ModeleDynamique() {
        super();

        listeEntreprise.add(new Vendeur("Pierre",  "Business", 45, "1995", 30000));
        listeEntreprise.add(new Representant("Léon", "Vendtout", 25, "2001", 20000));
        listeEntreprise.add(new Producteur("Yves", "Bosseur", 28, "1998", 1000));
        listeEntreprise.add(new Manutention("Jeanne", "Stocketout", 32, "1998", 45));
        listeEntreprise.add(new ProducteurRisque("Jean", "Flippe", 28, "2000", 1000));
        listeEntreprise.add(new ManutentionRisque("Al", "Abordage", 30, "2001", 45));
    }

    public int getRowCount() {
       return listeEntreprise.size();
    }

    public int getColumnCount() {
        return entetes.length;
    }

    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return listeEntreprise.get(rowIndex).getPrenom();
            case 1:
                return listeEntreprise.get(rowIndex).getNom();
            case 2:
                return listeEntreprise.get(rowIndex).getAge();
            case 3:
                return listeEntreprise.get(rowIndex).getDateEntree();
            case 4:
                return listeEntreprise.get(rowIndex).getType();
            case 5:
                return listeEntreprise.get(rowIndex).getBaseCalcul();
            case 6:
                return listeEntreprise.get(rowIndex).getSalaire();
            default:
                return null; //Ne devrait jamais arriver
        }
    }

    public void addEmploye(Employe employe) {
        listeEntreprise.add(employe);
        fireTableRowsInserted(listeEntreprise.size() -1, listeEntreprise.size() -1);
    }

    public double salaireMoyen() {
        double total = 0;
        for (Employe employee: listeEntreprise) {
            total += employee.calculerSalaire();
        }
        return total / listeEntreprise.size();
    }



}