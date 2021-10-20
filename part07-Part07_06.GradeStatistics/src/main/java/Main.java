
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegistry grades = new GradeRegistry();
        
        UserInterface userInterface = new UserInterface(scanner, grades);
        userInterface.start();
    }
}
