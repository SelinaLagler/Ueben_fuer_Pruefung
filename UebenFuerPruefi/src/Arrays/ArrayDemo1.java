package Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int[] array1={3,4,5};
        int[] array2={7,1,3};

        //manueller Weg:
        System.out.println("+ "+(array1[0]+array2[0])+","+(array1[1]+array2[1])+","+(array1[2]+array2[2]));
        System.out.println("+ "+(array1[0]*array2[0])+","+(array1[1]*array2[1])+","+(array1[2]*array2[2]));

        System.out.println();

         //Variante mit Schleife

        System.out.print("+ ");
        for (int i=0;i<array1.length;i++){
            System.out.print((array1[i]+array2[i])+",");
        }
        System.out.println();

        System.out.print("* ");
        for (int j =0;j<array1.length;j++){
            System.out.print((array1[j]*array2[j])+",");
        }
    }
}
