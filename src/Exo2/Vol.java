package Exo2;

public class Vol {
    Avion avion;

    String pilote;
    String copilote;

    String AeropDépart; // Aéroport de départ
    String AeropArrivée; // Aéroport d'arrivée

    String dateDepart;
    String heureDepart;

    String dateArrivé;
    String heureArrivé;

    public Vol(Avion avion, String pilote, String copilote, String aeropDépart, String aeropArrivée, String dateDepart,
            String heureDepart, String dateArrivé, String heureArrivé) {
        this.avion = avion;
        this.pilote = pilote;
        this.copilote = copilote;
        AeropDépart = aeropDépart;
        AeropArrivée = aeropArrivée;
        this.dateDepart = dateDepart;
        this.heureDepart = heureDepart;
        this.dateArrivé = dateArrivé;
        this.heureArrivé = heureArrivé;
    }
}