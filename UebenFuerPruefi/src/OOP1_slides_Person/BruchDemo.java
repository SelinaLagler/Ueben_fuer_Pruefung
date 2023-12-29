package OOP1_slides_Person;

public class BruchDemo {

    public static void main(String[] args) {

        Bruch bruch1 = new Bruch(2,6);
        System.out.println(bruch1);
        Bruch bruch2 = new Bruch(5,18);
        System.out.println(bruch2);
        Bruch bruch3 = new Bruch(7,5);
        System.out.println(bruch3);

        System.out.println("Anzahl erstellter Bruch-Objekte: "+Bruch.getInstanceCount());


        bruch1.toDecimal();
        bruch2.toDecimal();
        bruch2.multiplicate(bruch2);
        bruch2.multiplicate(bruch2,bruch3);
        bruch1.multiplicate(bruch1,bruch2);
        bruch3.toDecimal();



    }

}
