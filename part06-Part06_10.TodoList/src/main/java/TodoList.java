import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;
    
    
    public TodoList() {
        this.list = new ArrayList<>();
    } 
    
    public void add(String task) {
        this.list.add(task);
    }
    
    public void print() {
        for(String tasks : list) {
            System.out.println((list.indexOf(tasks) + 1) + ": " + tasks);
        }
    }
    
    public void remove(int number) {
        this.list.remove(number - 1);
    }
}