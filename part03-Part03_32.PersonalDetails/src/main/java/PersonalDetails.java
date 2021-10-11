
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ave = 0;
        
        int count = 0;
        String name = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] first = input.split(",");
            
            int age = Integer.valueOf(first[1]);
            
            if (first[0].length() > name.length()) {
                
                name = first[0];
            }
            ave += age;
            count++;
            
        }
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * ave / count);
    }
}
