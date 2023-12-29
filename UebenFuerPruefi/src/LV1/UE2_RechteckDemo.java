package LV1;

public class UE2_RechteckDemo {
    public static void main(String[] args) {
        int breite = 10;
        int laenge = 15;

        int umfang = (2*breite)+(2*laenge);
        int flaeche = breite*laenge;

        System.out.println("Die Fläche des Rechteckes ist: "+flaeche+ "m2");
        System.out.println();
        System.out.println("Der Umfang des Rechteckes ist: "+umfang+ "m");
    }
}
