package fr.parisnanterre.miage.poa;

public class Etudiant extends Personnel {

    private int echelon;

    public Etudiant (){}
    public Etudiant(String nom, String prenom, String numSecu, int echelon) {
        super(nom, prenom, numSecu);
        this.echelon = echelon;
    }



    public double montantBourse(){
        switch(echelon){
            case 0: return 100.0;
            case 1: return 100.0;
            case 2: return 100.0;
            case 3: return 100.0;
            default: return 0.0;
        }
    }
}