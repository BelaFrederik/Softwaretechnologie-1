package stueckliste;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Einzelteil t1 = new Einzelteil("E001", 2.30);
        Einzelteil t2 = new Einzelteil("E002", 4.70);
        Baugruppe t3 = new Baugruppe("B001", t1);
        Baugruppe t4 = new Baugruppe("B002", t2);
        t3.addBauteil(t4);
        t3.addBauteil(t2);
        t3.addBauteil(t4);
        System.out.println("Der Preis von t3 beträgt " + t3.preis() + "0 €");

    }
}