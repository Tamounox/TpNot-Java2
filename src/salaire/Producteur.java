package salaire;

public class Producteur extends Employe {


    @Override
    public double calculerSalaire() { return (baseCalcul*5);
    }

    public Producteur (String prenom, String nom, int age, String date, int base) {
        super(prenom, nom, age,date,base);
        calculerSalaire();
    }

    @Override
    public String getType() {
        return "Le Producteur";
    }
}

