
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String file = scanner.nextLine();
        Scanner printer = new Scanner(Paths.get(file));
        
        while(printer.hasNextLine()) {
            String row = printer.nextLine();
                System.out.println(row);
        }
    }
}
