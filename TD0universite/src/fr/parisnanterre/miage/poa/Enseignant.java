package fr.parisnanterre.miage.poa;

abstract public class Enseignant extends Personnel {
    String dateRecrutement;

    public Enseignant(String nom, String prenom, String numSecu, String dateRecrutement, int salaire) {
        super(nom, prenom, numSecu);
        this.dateRecrutement = dateRecrutement;
        this.salaire = salaire;
    }

    int salaire;

    public String getDateRecrutement() {
        return dateRecrutement;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public void setDateRecrutement(String dateRecrutement) {
        this.dateRecrutement = dateRecrutement;
    }
}
