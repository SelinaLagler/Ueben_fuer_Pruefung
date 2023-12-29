package OOP1_Uebungsblatt_Beisp1;

public class Zutat {
    private String zutat;
    private int mengeZutat;

    public Zutat(String zutat, int mengeZutat) {
        this.zutat = zutat;
        this.mengeZutat = mengeZutat;
    }

    public String getZutat() {
        return zutat;
    }

    public int getMengeZutat() {
        return mengeZutat;
    }

    @Override
    public String toString() {
        return zutat+" "+mengeZutat;
    }
}
