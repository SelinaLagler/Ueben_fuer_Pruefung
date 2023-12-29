package Arrays;

import java.util.ArrayList;

public class UebungsblattArrays_UE2_ReverseArray {
    public static void main(String[] args) {

        String [] sentenceToReverse={"Hallo","ich","heiße","Selina","und","schreibe","gerade","Prüfung"};
        reverseArray(sentenceToReverse);
    }


    public static String[]reverseArray(String[]arrayToReverse){

        int y = arrayToReverse.length-1;
        String helpI ="";
        String helpY="";
        for (int i=0; i< arrayToReverse.length/2; i++, y--){
            helpI = arrayToReverse[i];
            helpY = arrayToReverse[y];
            arrayToReverse[i]=helpY;
            arrayToReverse[y]=helpI;

        }
        for(int i=0; i< arrayToReverse.length;i++){
            System.out.println(arrayToReverse[i]);
        }

return arrayToReverse;

    }
}
