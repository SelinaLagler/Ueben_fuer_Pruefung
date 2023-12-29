package LV2;

public class UebungsblattLV2_UE2_WinterreifenpflichtDemo {
    public static void main(String[] args) {

        isWinterreifenPflicht(9,true);
        isWinterreifenPflicht(9,false);
        isWinterreifenPflicht(3,false);
        isWinterreifenPflicht(3,true);
        isWinterreifenPflicht(12,false);

    }

    public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFarbahn) {
        if (temperatur < 10 && temperatur >4 && rutschigeFarbahn == true) {
            System.out.println("Temperatur: " + temperatur + ", rutschige Fahrbahn: " + rutschigeFarbahn + " = Winterreifen sollten verwendet werden");
        } else if (temperatur < 4) {
            System.out.println("Temperatur: " + temperatur + "= Winterreifen sollten verwendet werden");
        } else System.out.println("keine Winterreifen erforderlich");

        return rutschigeFarbahn;

    }

}
