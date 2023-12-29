package LV2;

public class Tagesabschnitt {
    public static void main(String[] args) {
        uhrzeitInterpret(8);
        uhrzeitInterpret(12);
        uhrzeitInterpret(13);
        uhrzeitInterpret(17);
        uhrzeitInterpret(23);
        uhrzeitInterpret(4);

    }

    public static void uhrzeitInterpret (int time){

        if (time >=6 && time <= 9){
            System.out.println("Tageszeit "+time+" = " +"Früh");
        } else if (time>=10&& time <=12) {
            System.out.println("Tageszeit "+time+" = "+"Vormittag");
        } else if (time>=13&& time<=16) {
            System.out.println("Tageszeit "+time+" = "+"Nachmittag");
        } else if (time>= 17&& time <= 20) {
            System.out.println("Tageszeit "+time+ " = "+"Abend");
        }else {
            System.out.println("Tageszeit "+time+ " = "+"Nacht");
        }
    }
}
