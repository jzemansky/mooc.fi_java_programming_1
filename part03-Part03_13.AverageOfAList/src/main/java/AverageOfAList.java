
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int ave = 0;
        while (true) {
        
        int num = Integer.valueOf(scanner.nextLine());
        
        if (num == -1) {
            break;
        }
        
        list.add(num);
        
        }
        
        for(int i = 0; i < list.size(); i++) {
            ave += list.get(i);
        }
        
        double end = 1.0 * ave / list.size();
        
        System.out.println("Average: " + end);
        
    }
}
