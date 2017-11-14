package salaire;

public class Vendeur extends Employe {


    @Override
    public double calculerSalaire() {
        return(((baseCalcul * 20)/100) + 400);
    }


    public Vendeur (String prenom, String nom, int age, String date, int base) {
        super(prenom, nom, age,date, base);
        calculerSalaire();
    }

    @Override
    public String getType() {
        return "Le vendeur";
    }
}