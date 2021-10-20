
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        ArrayList<Team> record = readRecordsFromFile(file);
        
        System.out.println("Team: ");
        String tName = scan.nextLine();
        
        int counter = 0;
        int wins = 0;
        int losses = 0;
        
        for(Team team : record) {
            
            if (team.getHomeTeam().contains(tName)) {
                counter++;
                
                if (team.getHomeScore() >= team.getVisitorScore()) {
                    wins++;
                    team.setWins();
                    
                } else {
                    losses++;
                    team.setLosses();
                }
                
                team.playGame();
            } else if (team.getVisitorTeam().contains(tName)) {
                counter++;
                
                if (team.getVisitorScore() >= team.getHomeScore()) {
                    wins++;
                    team.setWins();
                } else {
                    losses++;
                    team.setLosses();
                }
                team.playGame();
            }
        }
        
        System.out.println("Games: " + counter);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);


    }
    public static ArrayList<Team> readRecordsFromFile(String file) {
        ArrayList<Team> teams = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");

                String hTeam = parts[0];
                String vTeam = parts[1];
                int hPoints = Integer.valueOf(parts[2]);
                int vPoints = Integer.valueOf(parts[3]);

                teams.add(new Team(hTeam, vTeam, hPoints, vPoints));

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return teams;
    }

}
