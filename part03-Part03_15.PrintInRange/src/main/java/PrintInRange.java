import java.util.Scanner;
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for (int i = 0; i < 6; i++) {
            numbers.add(Integer.valueOf(scanner.nextLine()));
        }
        
        int lowerLimit = Integer.valueOf(scanner.nextLine());
        int upperLimit = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The numbers in the range [" + lowerLimit + ", " + upperLimit + "]");
        
        printNumbersInRange(numbers, lowerLimit, upperLimit);
               
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        
        for (int number: numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
        
    }
    
}
