
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        Statistics stat = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num == -1) {
                break;
            }
            
            if(num % 2 == 0) {
                even.addNumber(num);
            } else {
                odd.addNumber(num);
            }
                                   
            stat.addNumber(num);
        }
        
        System.out.println("Sum: " + stat.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }
}
