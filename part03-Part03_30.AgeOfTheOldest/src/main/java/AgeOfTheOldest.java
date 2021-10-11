
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int old = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] first = input.split(",");
            
            int age = Integer.valueOf(first[1]);
            if (age > old) {
                old = age;
            }
            
            
        }
        
        System.out.println("Age of the oldest: " + old);
    }
}
