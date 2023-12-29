package OOP1_Uebungsblatt_Beisp2;

public class Bestellzeile {
    private String artikel;
    private int anzahl;
    private int preis;

    public Bestellzeile(String artikel, int anzahl, int preis) {
        this.artikel = artikel;
        this.anzahl = anzahl;
        this.preis = preis;
    }

    public String getArtikel() {
        return artikel;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public int getPreis() {
        return preis;
    }

    public double getKosten(){
        int kosten = preis*anzahl;
        return kosten;
    }

    @Override
    public String toString() {
        return "Bestellzeile{" +
                "artikel='" + artikel + '\'' +
                ", anzahl=" + anzahl +
                ", preis=" + preis +
                '}';
    }
}
