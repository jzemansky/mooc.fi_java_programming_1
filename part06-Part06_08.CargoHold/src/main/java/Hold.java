import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> storage;
    private int maxWeight;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.storage = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(this.totalWeight() + suitcase.totalWeight() <= maxWeight) {
            this.storage.add(suitcase);
        }
    }
    
    public String toString() {
        if(this.storage.isEmpty()) {
            return "no suitcases (0 kg)";
        } else if(this.storage.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
        } else {
            return this.storage.size() + " suitcases (" + this.totalWeight() + " kg)";
        }
    }
    
    public void printItems() {
        for(Suitcase suitcase : storage) {
            System.out.println(suitcase.listItems());
        }
    }
    
    public int totalWeight() {
        int sumOfSuitcases = 0;
        for (Suitcase suitcase : storage) {
            sumOfSuitcases += suitcase.totalWeight();
        }
        
        return sumOfSuitcases;
    }
}
