import java.util.ArrayList;

public class Room {


    private ArrayList<Person> list;
    public Room(){

        list = new ArrayList<Person>();

    }

    public void add(Person person){
        list.add(person);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public ArrayList<Person> getPersons(){
        return list;
    }

    public Person shortest(){
        if(list.isEmpty()){
            return null;
        }

        Person shortest = new Person(null, 200);

        for (Person person : list) {
            if(shortest.getHeight() > person.getHeight() ){
                shortest = person;
            }
            
        }
        return shortest;
    }

    public Person take(){
        if(list.isEmpty()){
            return null;
        }

        Person shortest = new Person(null, 200);

        for (Person person : list) {
            if(shortest.getHeight() > person.getHeight() ){
                shortest = person;
            }
            
            
        }
         list.remove(shortest);
         return shortest;
        
        
    }

}
