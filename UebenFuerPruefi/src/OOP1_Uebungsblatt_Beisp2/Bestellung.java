package OOP1_Uebungsblatt_Beisp2;

import java.util.Arrays;

public class Bestellung {
    private String bestellNummer;
    private Bestellzeile[] alleBestellzeilen;

    public Bestellung(String bestellNummer, Bestellzeile[] alleBestellzeilen) {
        this.bestellNummer = bestellNummer;
        this.alleBestellzeilen = alleBestellzeilen;
    }

    public String getBestellNummer() {
        return bestellNummer;
    }

    public Bestellzeile[] getAlleBestellzeilen() {
        return alleBestellzeilen;
    }

    public void printBestellung(){
        System.out.println("Bestellung: "+ Arrays.toString(alleBestellzeilen));
    }


    public double getKosten() {
        double gesamtkosten = 0;

        for (int i=0; i< alleBestellzeilen.length;i++){
            Bestellzeile kosten =alleBestellzeilen[i];
            double aufsummiert = kosten.getKosten();

            gesamtkosten = aufsummiert+gesamtkosten;

            //System.out.println("Gesamtkosten für Bestellung= "+gesamtkosten+"€");
        }
        System.out.println("Gesamtkosten für Bestellung= "+gesamtkosten+"€");
        return gesamtkosten;
    }
}
