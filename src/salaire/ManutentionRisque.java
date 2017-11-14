package salaire;

public class ManutentionRisque extends Manutention {
    @Override
    void calculerSalaire() {
        salaire = (baseCalcul*65 + 200);
    }

    public ManutentionRisque (String prenom, String nom, int age, String date, int base) {
        super(prenom, nom, age,date, base);
        calculerSalaire();
    }

    @Override
    public String getType() {
        return "Le manutenteur a risques";
    }
}
