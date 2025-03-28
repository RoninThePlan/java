import java.util.*;

public class Family {
    private Map<String, List<Person>> familyMembers;

    public Family(){
        this.familyMembers=new HashMap<>();
    }
 /*   public void addMember(Person p){
        String key=p.getName()+ " "+p.getSurname();
        this.familyMembers.put(key,p);
    }*/
 public void addMember(Person... p){
         for(Person p1:p){
             String key=p1.getName()+ " "+p1.getSurname();
             this.familyMembers.computeIfAbsent(key,k->new ArrayList<Person>())
             this.familyMembers.get(key).add(p1);
         }


 }
    public Person get(String key){
     List<Person> people=this.familyMembers.get(key);
        if(people==null||people.size()==0){
        return null;}
        Collections.sort(people);
        people.sort(Comparator.reverseOrder());
        return people.toArray(new Person[0])[0];
    }
}
