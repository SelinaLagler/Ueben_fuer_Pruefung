package Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        String [] months ={"Jänner", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};

        for (int i = 0;i<= months.length-1;i++){
            System.out.println(months[i]+ " ["+(i+1)+"]");
        }
    }
}
