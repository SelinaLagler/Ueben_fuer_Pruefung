package OOP1_slides_Person;

import org.w3c.dom.css.Counter;

public class Bruch {

    //instanceCount => für Erweiterung
    private static int instanceCount = 0;
    private double nenner;
    private double zaehler;


    public Bruch(int nenner, int zaehler) {
        this.nenner = nenner;
        this.zaehler = zaehler;
        // instanceCount => für erweiterung
        instanceCount++;

    }


    public double getNenner() {
        return nenner;
    }


    public double getZaehler() {
        return zaehler;
    }


    @Override
    public String toString() {
        return zaehler+" / "+nenner;
    }

    public double toDecimal(){
        double decimal = 0;
        decimal=zaehler/nenner;
        System.out.println("Bruch in Dezimalzahl: "+decimal);
        return decimal;
    }
    public Bruch multiplicate(Bruch b2) {
        double nennerMuliplied = 0;
        double zaehlerMultiplied = 0;
        nennerMuliplied = nenner * nenner;
        zaehlerMultiplied = zaehler * zaehler;
        System.out.println(zaehlerMultiplied +" / "+nennerMuliplied);
        return null;
    }
    public Bruch multiplicate(Bruch b2, Bruch b3){


        double nennerNeu=0;
        double zaehlerNeu=0;
        nennerNeu= b2.nenner* b3.nenner;
        zaehlerNeu= b2.zaehler* b3.zaehler;
        nennerNeu=nennerNeu*nennerNeu;
        zaehlerNeu =zaehlerNeu*zaehlerNeu;
        System.out.println(zaehlerNeu+" / "+nennerNeu);
        return null;
    }
    // Erweiterung => statisches Attribut, welches mitzählt, wie oft ein Objekt der Klasse Bruch erstellt wird
    // statisches Attribut oben erstellt #Zeile 8
    // bei Konstruktor hinzugefügt -bei jedem mal Konstruktor verwendet zählt 1 dazu #Zeile 17
    // unten getter hinzugefügt #Zeile 67
    public static int getInstanceCount() {
        return instanceCount;
    }

}
