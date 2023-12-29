package OOP1_slides_Gehaltskonto;

public class Bank {

    public static void main(String[] args) {
        Gehaltskonto Seli = new Gehaltskonto("Selina","AT98674987362","BGJU373GT",0);
        Gehaltskonto Bernd = new Gehaltskonto("Bernd", "AT98724983784","CJE63JDFJ",0);
        Gehaltskonto Mum = new Gehaltskonto("Karin", "AT93827437","BWEH738UD",0);

        System.out.println(Seli);
        System.out.println(Bernd);

        System.out.println("Konto von Selina: ");
        System.out.println();
        Seli.aufbuchen(9837);
        Seli.abbuchen(8908);
        Seli.abbuchen(8973);
        Seli.aufbuchen(9374958);

        System.out.println();

        System.out.println("Konto von Bernd: ");
        System.out.println();
        Bernd.aufbuchen(93458);
        Bernd.abbuchen(3874);
        Bernd.aufbuchen(12);
        Bernd.abbuchen(91000);
        Bernd.aufbuchen(234);



    }
}
