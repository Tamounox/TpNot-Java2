package salaire;

public class Representant extends Employe {


    @Override
    public double calculerSalaire() {
        return ((baseCalcul * 20)/100) + 800;
    }

    public Representant (String prenom, String nom, int age, String date, int base) {
        super(prenom, nom, age,date, base);
        calculerSalaire();
    }

    @Override
    public String getType() {
        return "Le representant";
    }
}
