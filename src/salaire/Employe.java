package salaire;

public abstract class Employe{
    String nom;
    String prenom;
    Integer age;
    String dateEntree;
    int baseCalcul;
    double salaire;


    public abstract double calculerSalaire();

    public Employe(String prenom, String nom, int age, String date, int baseCalcul){
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.dateEntree = date;
        this.baseCalcul=baseCalcul;
        this.salaire = calculerSalaire();
    }

    public String getNomretournant () {
        return (String) ( getType() + " " + prenom + " " + nom);
    }

    public String getType(){
        return "l'employe";
    }


    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getDateEntree () {
        return dateEntree;
    }

    public int getBaseCalcul() {
        return baseCalcul;
    }

    public double getSalaire() {
        return salaire;
    }


}

