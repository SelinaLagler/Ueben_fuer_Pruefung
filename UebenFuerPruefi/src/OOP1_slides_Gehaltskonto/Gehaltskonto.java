package OOP1_slides_Gehaltskonto;

public class Gehaltskonto {
    //Erweiterung (ID hinzufügen)
    int gehaltsKontoID =0;
    private String inhaber;
    private String IBAN;
    private String BIC;
    private double kontostand =0;


    //Erweiterung (ID hinzufügen)
    public static int id;
    //Erweiterung (ID hinzufügen)
    public int getId(){
        return gehaltsKontoID;
    }

    public Gehaltskonto(String inhaber, String IBAN, String BIC, double kontostand) {
        this.inhaber = inhaber;
        this.IBAN = IBAN;
        this.BIC = BIC;
        this.kontostand = 0;
        //Erweiterung (ID hinzufügen)
        id++;
        gehaltsKontoID=id;

    }


    @Override
    public String toString() {
        return "Gehaltskonto{" +"ID:"+gehaltsKontoID+" ,"+
                "inhaber='" + inhaber + '\'' +
                ", IBAN='" + IBAN + '\'' +
                ", BIC='" + BIC + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }



    public String getInhaber() {
        return inhaber;
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getBIC() {
        return BIC;
    }

    public double getKontostand() {
        return kontostand;
    }


    public void aufbuchen(double wert){
        kontostand = kontostand+wert;
        System.out.println("ID:"+gehaltsKontoID+" Neuer Kontostand nach auffbuchung= "+kontostand+"€");
    }
    public void abbuchen(double wert){
        if (kontostand > wert){
            kontostand=kontostand-wert;
            System.out.println("ID:"+gehaltsKontoID+" Neuer Kontostand nach abbuchung= " +kontostand+"€");
        }else System.out.println("ID:"+gehaltsKontoID+" kann nicht abgebucht werden");
    }


}
