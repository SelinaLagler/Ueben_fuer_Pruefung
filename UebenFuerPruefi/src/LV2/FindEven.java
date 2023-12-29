package LV2;

public class FindEven {
    public static void main(String[] args) {

        //gerade Zahlen bis 10 ausgeben mit while-Schleife:
        int i =0;
        System.out.print("gerade Zahlen: ");
        while (i<=10){

            if (i%2==0){
            System.out.print(i+", ");
            }
            i++;

        }

        //oder for-schleife:
        System.out.println();
        System.out.print("gerade Zahlen: ");

        for (int j=0; j <=10; j++){

            if (j%2==0){
                System.out.print(j+", ");
            }
        }
    }
}
