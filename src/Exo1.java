

public class Exo1 {
    // Classe de convertion sexagésimal en décimal
    int[] tab = new int[3]; // Tableau de 3 entiers
    
    int heure;
    int minute;
    int seconde;

    public Exo1(int heure, int minute, int seconde) {
        this.heure = heure;
        this.minute = minute;
        this.seconde = seconde;
    }

    public Exo1(double heure){ //6.7
        this.heure = (int) heure; //6
        this.minute = (int) ((heure - this.heure) * 60); //0.7 * 60 = 42
        this.seconde = (int) (((heure - this.heure) * 60 - this.minute) * 60); // (0.7 * 60 - 42) * 60 = 0
    }

    public void getHeure() {
        print("" + this.heure);
    }

    public void getMinute() {
        print("" + this.minute);
    }

    public void getSeconde() {
        print("" + this.seconde);
    }

    public void convertion() {
        int heure = this.heure;
        int minute = this.minute;
        int seconde = this.seconde;

        tab[0] = heure * 3600;
        tab[1] = minute * 60;
        tab[2] = seconde;

        int total = tab[0] + tab[1] + tab[2];

        print("Le temps total en seconde est de : " + total);
    }

    public void print(String input){
        System.out.println(input);
    }

}