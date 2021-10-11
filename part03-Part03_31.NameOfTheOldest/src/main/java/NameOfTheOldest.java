
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int old = 0;
        String oldest = "name";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] first = input.split(",");
            
            int age = Integer.valueOf(first[1]);
            if (age > old) {
                old = age;
                oldest = first[0];
            }
            
            
        }
        
        System.out.println("Name of the oldest: " + oldest);
    }
}
