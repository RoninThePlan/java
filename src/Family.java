import java.util.Map;
import java.util.HashMap;
public class Family {
    private Map<String, Person> familyMembers;

    public Family(){
        this.familyMembers=new HashMap<>();
    }
    public void addMember(Person p){
        String key=p.getName()+ " "+p.getSurname();
        this.familyMembers.put(key,p);
    }
    public Person get(String key){
        return this.familyMembers.get(key);
    }
}
