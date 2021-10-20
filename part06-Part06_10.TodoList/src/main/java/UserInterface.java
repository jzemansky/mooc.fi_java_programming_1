import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList toDoList;
    
    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.toDoList = toDoList;
        this.scanner = scanner;
    }
    
    public void start() {
        
        while (true) {
            System.out.print("Command:");
            String command = scanner.nextLine();
            
            if(command.equals("add")){
                System.out.print("To add:");
                String task = scanner.nextLine();
                toDoList.add(task);
            } 
            else if(command.equals("list")) {
                toDoList.print();
            } 
            else if(command.equals("remove")) {
                System.out.print("Which one is removed?");
                int num = Integer.valueOf(scanner.nextLine());
                toDoList.remove(num);
            } 
            else if(command.equals("stop")) {
                break;
            }
        }
    }
}
