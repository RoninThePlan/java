import java.io.Serializable;
import java.lang.reflect.Method;
import java.security.PublicKey;
import java.time.LocalDate;
import java.util.*;
import java.time.*;

public class Person implements Comparable<Person>
{
    private String name;
    private String surname;
    private LocalDate dob;
    private LocalDate dod;
    Set<Person> children=new HashSet<Person>();
    List<Person> childrenList=new ArrayList<Person>();
    public Person(String name, String surname, LocalDate dob)
    {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.dod =dod;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
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

    public List getChildren(){
    Collections.sort(this.childrenList);
    return this.childrenList;
    }
    public static Person fromCsvLine(String line){
        String[] lineParts=line.split(",");
        String name=lineParts[0].split(" ")[0];
        String surname=lineParts[0].split(" ")[1];
        LocalDate dob=LocalDate.parse(lineParts[1].split(" ")[0]);
        LocalDate dod= null;

        return Person();
    }
    @Override
    public String toString(){
        return "hejka mam na imie "+this.name+"a na nazwisko"+this.surname;
    }

}