package salaire;

public class Manutention extends Employe {


    @Override
    public double calculerSalaire() {
        return (baseCalcul*65);
    }

    public Manutention (String prenom, String nom, int age, String date, int base) {
        super(prenom, nom, age,date, base);
        calculerSalaire();
    }

    @Override
    public String getType() {
        return "Le manutenteur";
    }
}
