package Exo2;

public class Technicien {
    String nom;
    String prenom;
    String adresse;
    String matricule;
    int numeroTel;
    double salaire;
    boolean faitExamenMedicale;

    public Technicien(String nom, String prenom, String adresse, String matricule, int numeroTel, double salaire,
            boolean faitExamenMedicale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.matricule = matricule;
        this.numeroTel = numeroTel;
        this.salaire = salaire;
        this.faitExamenMedicale = faitExamenMedicale;
    }
}