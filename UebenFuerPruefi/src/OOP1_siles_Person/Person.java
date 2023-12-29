package OOP1_siles_Person;

public class Person {

    public static void main(String[] args) {
        Person Max =new Person();
        Max.firstName="Max";
        Max.lastName="Mustermann";
        Max.age=39;
        Max.haircolor="Jahre"; //statt "haircolor" text "Jahr"

        System.out.println(Max);
    }



    public String firstName;
    public String lastName;
    public int age;
    public String haircolor;
    //2. Variante (wurde aber nicht gefragt in diesem Beispiel)
   /* public Person(String firstName, String lastName, int age, String haircolor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.haircolor = haircolor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }
*/
    @Override
    public String toString() {
        return firstName +" "+lastName+", "+age+" "+haircolor;
    }
}
