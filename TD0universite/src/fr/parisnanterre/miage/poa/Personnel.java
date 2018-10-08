package fr.parisnanterre.miage.poa;

abstract class Personnel {
    private String nom;
    private String prenom;
    private String numSecu;

    public Personnel (){}
    public Personnel(String nom, String prenom, String numSecu) {
        this.nom = nom;
        this.prenom = prenom;
        this.numSecu = numSecu;
    }
    public String getNom() {
        return nom;
    }


    public String getNumSecu() { // pas de set Num Secu
        return numSecu;
    }


    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Personnel(String nom) {
        this.nom = nom;
    }
}
