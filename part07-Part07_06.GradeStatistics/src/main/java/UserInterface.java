import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private GradeRegistry grades;
    
    public UserInterface(Scanner scanner, GradeRegistry grades) {
        this.scanner = scanner;
        this.grades = grades;
    }
    
    public void start() {
        readGrades();
        printGradeAverage();
        printPassingAverage();
        printPassingPercentage();
        printGradeDistribution();
        
    }
    
    public void readGrades() {
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int grade = Integer.valueOf(scanner.nextLine());
            
            if(grade == -1) {
                break;
            }
            
            if(grade >= 0 && grade <= 100) {
                this.grades.addGrade(grade);
            }
        }
    }
    
    public void printGradeAverage() {
        System.out.println("Point average (all): " + this.grades.gradeAverage());
    }
    
    public void printPassingAverage() {
        System.out.println("Point average (passing): " + this.grades.passingAverage());
    }
    
    public void printPassingPercentage() {
        System.out.println("Pass percentage: " + this.grades.passingPercentage());
    }
    
    public void printGradeDistribution() {
        System.out.println(this.grades.gradeDistribution());
    }
    
}
