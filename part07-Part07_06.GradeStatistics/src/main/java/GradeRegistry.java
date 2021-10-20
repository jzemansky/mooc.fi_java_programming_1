import java.util.ArrayList;

public class GradeRegistry {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> passingGrades;
    
    public GradeRegistry() {
        this.grades = new ArrayList<>();
        this.passingGrades = new ArrayList<>();
    }
    
    public void addGrade(Integer grade) {
        this.grades.add(grade);
        
        if(grade >= 50) {
            this.passingGrades.add(grade);
        }
    }
    
    public double gradeAverage() {
        int total = 0;
        int size = this.grades.size();
        
        if(this.grades.isEmpty()) {
            return -1;
        } else {
            for (Integer grade : grades) {
                total += grade;
            }
        }
        
        return 1.0 * total / size;
    }
    
    public double passingAverage() {
        int total = 0;
        int size = this.grades.size();
        
        if(this.grades.isEmpty()) {
            return -1;
        } else {
            for (Integer grade : grades) {
                if(grade < 50) {
                    size--;
                } else {
                    total += grade;
                }
            }
        }
        return 1.0 * total / size;
    }
    
    public double passingPercentage() {
        int total = grades.size();
        int passing = passingGrades.size();
        
        return 100.0 * passing / total;
        
    }
    
    public String gradeDistribution() {
        String star = "*";
        String fives = "5: ";
        String fours = "4: ";
        String threes = "3: ";
        String twos = "2: ";
        String ones = "1: ";
        String zeroes = "0: ";
        
        for(Integer grade : grades) {
            if(grade < 50) {
                zeroes += star;
            } else if (grade < 60) {
                ones += star;
            } else if (grade < 70) {
                twos += star;
            } else if (grade < 80) {
                threes += star;
            } else if (grade < 90) {
                fours += star;
            } else if (grade >= 90) {
                fives += star;
            }
        }
        return fives + "\n" + fours + "\n" + threes + "\n" 
                + twos + "\n" + ones + "\n" + zeroes;
    }

}
