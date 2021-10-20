
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        String first = "First: ";
        String second = "Second: ";
        
        System.out.println(first + firstContainer);
        System.out.println(second + secondContainer);
        
        while (true) {
            System.out.print("> ");
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } 
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                firstContainer.add(amount);
            } else if (command.equals("move")) {
                if (firstContainer.contains() - amount >= 0) {
                    secondContainer.add(amount);
                    firstContainer.remove(amount);  
                }  else {
                    secondContainer.add(firstContainer.contains());
                    firstContainer.remove(firstContainer.contains());
                }
            } else if (command.equals("remove")) {
                secondContainer.remove(amount);
            }
            
            System.out.println(first + firstContainer);
            System.out.println(second + secondContainer);
        }
    }

}
