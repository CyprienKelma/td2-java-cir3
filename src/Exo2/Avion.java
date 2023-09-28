package Exo2;

public class Avion {
    String matricule;

    String paysOrigine;

    String type;

    String aeroport;

    String avionName;

    double poids; // en tonne

    int capacite; // en passager

    int distanceMax; // en km

    String adresseICAO;

    public Avion(String matricule, String paysOrigine, String type, String aeroport, String avionName, double poids,
            int capacite, int distanceMax, String adresseICAO) {
        this.matricule = matricule;
        this.paysOrigine = paysOrigine;
        this.type = type;
        this.aeroport = aeroport;
        this.avionName = avionName;
        this.poids = poids;
        this.capacite = capacite;
        this.distanceMax = distanceMax;
        this.adresseICAO = adresseICAO;
    }

    
}