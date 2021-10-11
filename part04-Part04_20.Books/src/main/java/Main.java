import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, year));
        }
        System.out.println("What information will be printed?");
        String print = scanner.nextLine();
        if(print.equals("everything")){
            for(Book book : books) {
                System.out.println(book);
            }
        } else if(print.equals("name")) {
            for(Book book : books) {
                System.out.println(book.getName());
            }
        }
    }
}
