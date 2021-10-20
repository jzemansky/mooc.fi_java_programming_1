import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if(this.totalWeight() + item.getWeight() <= maxWeight) {
            this.items.add(item);
        }
    }
    
    public void printItems() {
        for(Item item : items) {
            System.out.println(item);
        }
    }
    
    public String toString() {
        if(this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if(this.items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        } else {
            return this.items.size() + " items (" + this.totalWeight() + " kg)";
        }
    }
    
    public int totalWeight() {
        int totWeight = 0;
        for (Item item : items) {
            totWeight += item.getWeight();
        }
        
        return totWeight;
    }
    
    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        for(Item item : items) {
            if(heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }  
        return heaviest;
    }
    
    public String listItems(){
        
        String listItems =  "";
        
        for(Item item : items){
            listItems += item.toString() + "\n";
        }
        
        return listItems;
    }
}
