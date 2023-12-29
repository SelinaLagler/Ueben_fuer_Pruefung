package LV2;

public class UebungsblattLV2_UE3_TurmDemo {
    public static void main(String[] args) {

        int value =2;

        for (int i=2;i <=9;i++){
            int help = value *i;
            System.out.println(value+" * "+i+"= "+help);
            value = help;

        }
        for (int j=9; j>1;j--) {
            int help = value / j;
            System.out.println(value + " / " + j + "= " + help);
            value = help;

        }
    }
}
