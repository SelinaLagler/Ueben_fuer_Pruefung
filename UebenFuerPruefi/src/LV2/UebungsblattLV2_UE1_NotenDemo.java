package LV2;

public class UebungsblattLV2_UE1_NotenDemo {
    public static void main(String[] args) {

        int punkteSusi=94;
        int punkteMax=80;
        int punkteSeli=66;
        int punkteKarin=40;

        getNotentext(punkteKarin);
        getNotentext(punkteMax);
        getNotentext(punkteSeli);
        getNotentext(punkteSusi);

    }
    public static String getNotentext (int punkte){
        if (punkte>=90){
            System.out.println("Sehr Gut");
        } else if (punkte>=78 && punkte<=89) {
            System.out.println("Gut");
        } else if (punkte>=65 && punkte<=77) {
            System.out.println("Befriedinged");
        } else if (punkte >=51 && punkte<=64) {
            System.out.println("Genügend");
        }else System.out.println("Ungenügend");
        return null;
    }
}
