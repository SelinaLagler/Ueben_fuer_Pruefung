package OOP1_Uebungsblatt_Beisp1;

public class RezeptDemo {
    public static void main(String[] args) {

        Zutat zutat1 = new Zutat("Mehl",250);
        Zutat zutat2 = new Zutat("Zucker",250);
        Zutat zutat3 = new Zutat("Eier",3);

        Zutat[] zutatenKuchen= {zutat1,zutat2,zutat3};

        Rezept kuchen = new Rezept("Kuchen",4,zutatenKuchen);
        kuchen.printRezepte();

        Rezept neuesRezeptKuchen =kuchen.umrechnen(8);
        System.out.println("Umgerechnetes Rezept für 8 Personen:");
        neuesRezeptKuchen.printRezepte();
    }
}
