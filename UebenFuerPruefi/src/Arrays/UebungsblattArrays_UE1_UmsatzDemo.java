package Arrays;

public class UebungsblattArrays_UE1_UmsatzDemo {
    public static void main(String[] args) {
        double[] umsaetze1 = {23,567,33,25,29,55,32,55,51,82,22,26};
        getUmsatzsteigerungGT10(umsaetze1);

    }
// !!!Aufgabenstellung falsch gelesen => hätten die Anzahl der steigerungen (in int) und nicht die Werte ausgeben sollen!!!
    //Aufgabe nochmal versucht zu lösen siehe: UebungsblattArrays_UE1_UmsatzDemo_2
    public static int getUmsatzsteigerungGT10(double[] umsaetze) {
        for (int i = 0; i <= umsaetze.length - 2; i++) {
            if (umsaetze[i] < (1.100000000001 * umsaetze[i+1])) {
                System.out.println(umsaetze[i+1]);
            }

        }return 0;
    }


    //erweiterung LV2 Uebungsblatt Array -Beispiel 3 --> 2 dim Array soll codiert werden => bleibt vorübergehend offen
}