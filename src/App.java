public class App {
    public static void main(String[] args) throws Exception {
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
}
