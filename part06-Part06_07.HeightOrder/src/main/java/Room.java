import java.util.ArrayList;

public class Room {
    private ArrayList<Person> room;
    
    public Room() {
        this.room = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.room.add(person);
    }
    
    public boolean isEmpty() {
        return this.room.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        if(this.room.isEmpty()) {
            return null;
        }      
        return this.room;
    }
    
    public Person shortest() {
        if(this.room.isEmpty()) {
            return null;
        }
        
        Person shortest = this.room.get(0);
        
        for(Person persons : this.room) {
            if(shortest.getHeight() > persons.getHeight()) {
                shortest = persons;
            }
        }
        return shortest;
    }
    
    public Person take() {
        if(this.room.isEmpty()) {
            return null;
        }
        Person shortestTake = this.room.get(0);
        
        for(Person persons : this.room) {
            if(shortestTake.getHeight() > persons.getHeight()) {
                shortestTake = persons;
            }
        }
        this.room.remove(shortestTake);
        return shortestTake;
    }
}
