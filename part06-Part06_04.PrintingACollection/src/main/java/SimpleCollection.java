
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
                
        String printOutput = "The collection " + this.name;        
        
        if(elements.isEmpty()) {
            return printOutput + " is empty.";
        }
        
        String printElements = "";
        String stringElements = "";
        
        for(String element : elements) {
            
            if(elements.size() == 1) {
                printElements = element;
                stringElements = "element:\n";
            } else {
                printElements = printElements + element + "\n";
                stringElements = "elements:\n";
            }
        }
        
        return printOutput + " has " + elements.size()
                + " " + stringElements + printElements;
        
    }
    
}
