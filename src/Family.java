import java.util.Map;
import java.util.HashMap;
public class Family {
    private Map<String,Map<String, List<Person>>> familyMembers;

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
             this.familyMembers.put(key,p1);
         }


 }
    public Person get(String key){
        return this.familyMembers.get(key);
    }
}
