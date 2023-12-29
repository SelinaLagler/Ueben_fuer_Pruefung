package LV1;

public class ArithmetischeOperatoren {

    public static void main(String[] args) {

        int a= 5;
        double b= 3.0;
/*
        System.out.println("Arithmetische Operatoren +,-,*,/,% mit Variable a & b = ");
        System.out.println("a = "+a+", b = "+b);
        System.out.println("addition= "+(a+b));
        System.out.println("subtraktion= "+(a-b));
        System.out.println("division= "+(a/b));
        System.out.println("modolo= "+(a%b));*/

        test(2,17);
        test(1,2);
        test(18,-16);
        test(83,9);
        test(2,2);
        System.out.println();

        calculator2(2,4);
        System.out.println();
        calculator2(7,9);
        System.out.println();
        calculator2(3,2);
        System.out.println();
        calculator2(5,0);


    }

    public static void test ( int c, int d){
        int sum = c+d;
        if (sum <5 ){
            System.out.println("to less something ");
        }
        else {
            System.out.println("The number is= " +sum);

        }

    }
    public static void calculator2 (int a, double b){

        System.out.println("Start calculating: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = "+(a+b));
        System.out.println("a - b = "+(a-b));
        System.out.println("a * b = "+(a*b));
        //erweiterung LV2 slides Aufgabe 4:
        if (b==0){
            System.out.println("0");
        } else {
            System.out.println("a / b = "+(a/b));
        }
        System.out.println("a % b = "+(a%b));
    }

}
