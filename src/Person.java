import java.io.Serializable;
import java.lang.reflect.Method;
import java.security.PublicKey;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.time.*;

public class Person implements Comparable<Person>
{
    private String name;
    private String surname;
    private LocalDate dob;
    Set<Person> children=new HashSet<Person>();
    public Person(String name, String surname, LocalDate dob)
    {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
    }
    public LocalDate getDob()
    {
        return dob;
    }
    boolean adopt(Person child)
    {
        if(child != null||child!=this) {
          return this.children.add(child);
        }
        else return false;
    }
    Person GetYoungestChild()
    {
        Person youngest=this.children.iterator().next();
        for(Person child:this.children){
            if(youngest.compareTo(child)<0) youngest=child;
        }
         return youngest;
    }
    public int compareTo(Person o)
    {
        if(this.getDob().isBefore(o.getDob())) return -1;
        else if(this.getDob().isAfter(o.getDob())) return 1;
        else return 0;
    }
    @Override
    public String toString(){
        return "hejka mam na imie "+this.name+"a na nazwisko"+this.surname;
    }
}