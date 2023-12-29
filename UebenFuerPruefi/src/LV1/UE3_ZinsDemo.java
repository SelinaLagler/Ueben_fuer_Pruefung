package LV1;

public class UE3_ZinsDemo {
    public static void main(String[] args) {


        /*int kontostand = 1000;
        double zinsen = 2.25;

        double konstostandNeu = (kontostand * zinsen) / 100;

        System.out.println("Zinsen = " + zinsen + "% von " + kontostand + " = " + konstostandNeu);*/

        zinsberechner(9393,1.4,949);
        zinsberechner(875634,2.22,537);
        zinsberechner(98374,1.89,876);


    }

    public static void zinsberechner (int kontostand, double zinsen, int personID){

        double konstostandNeu = (kontostand*zinsen)/100;
        System.out.println("Zinsen = "+zinsen+"% von "+kontostand+" = "+konstostandNeu+" (Person ID = "+personID+")");
    }
}
