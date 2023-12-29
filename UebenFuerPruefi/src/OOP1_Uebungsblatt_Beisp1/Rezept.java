package OOP1_Uebungsblatt_Beisp1;

import java.util.Arrays;

public class Rezept {

    private String rezeptName;
    private int personenAnzahl;
    private Zutat[] zutaten;

    public Rezept(String rezeptName, int personenAnzahl, Zutat[] zutaten) {
        this.rezeptName = rezeptName;
        this.personenAnzahl = personenAnzahl;
        this.zutaten = zutaten;
    }

    public String getRezeptName() {
        return rezeptName;
    }

    public int getPersonenAnzahl() {
        return personenAnzahl;
    }

    public Zutat[] getZutaten() {
        return zutaten;
    }


    public void printRezepte() {
        System.out.println(
                "Rezeptenamen= " + rezeptName +
                ", Zutaten=" + Arrays.toString(zutaten));
    }

    public Rezept umrechnen(int neuePersonen){
        double umrechnungsfaktor = (double)neuePersonen / personenAnzahl; //(double) => wird von int in double umgewandelt
        Zutat[] neueZutaten = new Zutat[zutaten.length];
        for (int i = 0; i< zutaten.length; i++){
            int neueMenge = (int) (zutaten[i].getMengeZutat()*umrechnungsfaktor); //menge der zutat* umrechnungsfaktor wird in int umgewandelt
            neueZutaten[i] = new Zutat(zutaten[i].getZutat(),neueMenge);
        }return new Rezept(rezeptName, neuePersonen, neueZutaten);
    }

}
