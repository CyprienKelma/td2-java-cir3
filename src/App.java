public class App {
    public static void main(String[] args) throws Exception {
        
    }


    public void testExo1(){
        System.out.println("Hello, World!");
        Exo1 test1 = new Exo1(3, 23, 12);
        test1.getHeure();
        test1.getMinute();
        test1.getSeconde();
        test1.convertion();

        Exo1 test2 = new Exo1(6.7);
        test2.getHeure();
        test2.getMinute();
        test2.getSeconde();
        test2.convertion();
    }

    public void testExo2(){
        Exo2.Avion avion1 = new Exo2.Avion("matricule1", "paysOrigine1", "type1", "aeroport1", "avionName1", 1.1, 1, 1, "adresseICAO1");
        Exo2.Avion avion2 = new Exo2.Avion("matricule2", "paysOrigine2", "type2", "aeroport2", "avionName2", 2.2, 2, 2, "adresseICAO2");


    }
}
