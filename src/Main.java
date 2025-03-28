import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> listaOsob=new ArrayList<Person>();
        Person p1= new Person("Jan","Kowalski",LocalDate.of(1973,12,1));
        Person p2= new Person("Anna","Cham",LocalDate.of(1980,9,12));
        Person p3= new Person("Jan","Kowalski",LocalDate.of(1990,10,19));
        listaOsob.add(p1);
        listaOsob.add(p2);
        listaOsob.add(p3);
        System.out.println(p1.adopt(p2));
        System.out.println(p1.adopt(p3));
        System.out.println(p1.adopt(p1));
        System.out.println(p1.GetYoungestChild());
        p1.children.add((Person) p1.children);



    }
}
