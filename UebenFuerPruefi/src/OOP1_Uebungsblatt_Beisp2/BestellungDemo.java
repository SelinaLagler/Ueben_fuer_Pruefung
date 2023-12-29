package OOP1_Uebungsblatt_Beisp2;

public class BestellungDemo {
    public static void main(String[] args) {
        Bestellzeile zeile1 = new Bestellzeile("Tasche",3,14);
        Bestellzeile zeile2 = new Bestellzeile("Hose",2,40);
        Bestellzeile zeile3 = new Bestellzeile("Kette",4,12);

        Bestellzeile[] customer1= {zeile1,zeile2,zeile3};
        Bestellung kunde1 = new Bestellung("1",customer1);
        kunde1.printBestellung();
        kunde1.getKosten();
    }
}
