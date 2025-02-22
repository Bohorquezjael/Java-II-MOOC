import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    List<Person> persons;
    
    public Employees(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        this.persons.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        peopleToAdd.stream().forEach(people -> this.persons.add(people));
    }
    
    public void print(){
        Iterator<Person> it = this.persons.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    public void print(Education ed){
        Iterator<Person> it = this.persons.iterator();
        while(it.hasNext()){
            Person p = it.next();
            if(p.getEducation() == ed){
                System.out.println(p);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> it = this.persons.iterator();
        while(it.hasNext()){
            Person p = it.next();
            if(p.getEducation() == education){
                it.remove();
            }
        }
    }
}
