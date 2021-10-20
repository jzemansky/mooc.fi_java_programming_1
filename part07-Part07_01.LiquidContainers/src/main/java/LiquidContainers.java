
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        
        System.out.println("First: " + firstContainer + "/100");
        System.out.println("Second: " + secondContainer + "/100");
        
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
                if (amount >= 0) {
                    if (firstContainer + amount <= 100) {
                        firstContainer += amount;
                    } else {
                        firstContainer = 100;
                    }
                }
            } else if (command.equals("move")) {
                if (firstContainer - amount >= 0) {
                    if(secondContainer + amount <= 100) {
                        secondContainer += amount;
                        firstContainer -= amount;
                    } else {
                        secondContainer = 100;
                        firstContainer -= amount;
                    }
                }  else {
                    secondContainer += firstContainer;
                    firstContainer = 0;
                }
            } else if (command.equals("remove")) {
                if(secondContainer - amount >= 0) {
                    secondContainer -= amount;
                } else {
                    secondContainer = 0;
                }
            }
            
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
        }
    }

}
