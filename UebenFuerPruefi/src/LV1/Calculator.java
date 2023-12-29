package LV1;

public class Calculator {
    public static void main(String[] args) {


    int a = 3;
    int b = 5;


    int sum =0;
    sum=a+b;

    String calculator = "calculator";

        System.out.println("My name is: "+calculator+", "+ "number: "+sum);


        int [] array1={1,2,3,4};
        int [] array2 ={3,4,5,6,7};

        summ(array1);
        summ(array2);

    }

    //Erweiterung Aufgabe 8 LV2 (zusammenrechnen von Arrays)
    public static void summ (int[] array){
        int help =0;
        for (int i = 0; i<array.length;i++){

            int newSum =array[i] + help;
            help = newSum;
        }
        System.out.println(help);

    }


}

