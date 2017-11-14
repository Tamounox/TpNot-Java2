package salaire;

public class ProducteurRisque extends Producteur {


    @Override
    void calculerSalaire() {
        salaire = ((baseCalcul * 5) + 200);
    }

    public ProducteurRisque (String prenom, String nom, int age, String date, int base) {
        super(prenom, nom, age,date, base);
        calculerSalaire();
    }

    @Override
    public String getType() {
        return "Le Producteur à risques";
    }
}