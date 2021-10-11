import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.valueOf(scanner.nextLine());
        int den = Integer.valueOf(scanner.nextLine());
        division(num,den);

        // division(3, 5);
    }

    public static void division(int numerator, int denominator) {
        
        double res = 1.0 * numerator / denominator;
        System.out.println(res);
    }
}
