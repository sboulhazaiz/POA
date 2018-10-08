package fr.parisnanterre.miage.poa;

public class EnseignantPermanent extends Enseignant {
    String domaineDeRecherche;

    public EnseignantPermanent(String nom, String prenom, String numSecu, String dateRecrutement, int salaire, String domaineDeRecherche) {
        super(nom, prenom, numSecu, dateRecrutement, salaire);
        this.domaineDeRecherche = domaineDeRecherche;
    }

    public String getDomaineDeRecherche() {
        return domaineDeRecherche;
    }

    public void setDomaineDeRecherche(String domaineDeRecherche) {
        this.domaineDeRecherche = domaineDeRecherche;
    } // le domaine de rech peut être amené à évoluer ?
}
