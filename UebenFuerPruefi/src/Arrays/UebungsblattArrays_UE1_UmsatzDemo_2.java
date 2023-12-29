package Arrays;

public class UebungsblattArrays_UE1_UmsatzDemo_2 {
    public static void main(String[] args) {
        double[] umsaetze1 = {23,567,33,25,29,55,32,55,51,82,22,26};
        double[] umsaetze2 = {10,100,1,100,10,100,1,100,1,100,1,100};
        double[] umsaetze3 = {1,1,1,1,1,1,1,1,1,1,1,100};
        System.out.println(getUmsatzsteigerungGT10(umsaetze1));
        System.out.println(getUmsatzsteigerungGT10(umsaetze2));
        System.out.println(getUmsatzsteigerungGT10(umsaetze3));
    }

    public static int getUmsatzsteigerungGT10(double[] umsaetze) {
        int counter = 0;
        for (int i = 0; i < umsaetze.length - 1; i++) {
            if (umsaetze[i + 1] > (umsaetze[i] * 1.1)) {
                counter = counter + 1;
            }
        }return counter;
    }

}
