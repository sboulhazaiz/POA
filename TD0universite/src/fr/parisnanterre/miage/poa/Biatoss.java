package fr.parisnanterre.miage.poa;

public class Biatoss extends Personnel {
    String DateFinContrat;

    public Biatoss(String nom, String prenom, String numSecu, String dateFinContrat) {
        super(nom, prenom, numSecu);
        DateFinContrat = dateFinContrat;
    }
    public String getDateFinContrat() {
        return DateFinContrat;
    }

    public void setDateFinContrat(String dateFinContrat) {
        DateFinContrat = dateFinContrat;
    }


}
