import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int store = 0;
        
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
            String num = fileReader.nextLine();
            nums.add(Integer.valueOf(num));
            }
        } catch (Exception e) {
            System.out.println("File " + file + " not found.");
        }
        
        for(int i = 0; i < nums.size(); i++) {
            if (nums.get(i) >= lowerBound && nums.get(i) <= upperBound) {
                store++;
            }
        }
        
        System.out.println("Numbers: " + store);
        
    }

}
