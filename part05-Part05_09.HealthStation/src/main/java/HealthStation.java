
public class HealthStation {
    private int count;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.count++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        int weight = person.getWeight();
        person.setWeight(weight + 1);
    }
    
    public int weighings() {
        return count;
    }

}
