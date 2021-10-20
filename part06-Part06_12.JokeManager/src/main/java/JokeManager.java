import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public String drawJoke() {
        if(this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random rand = new Random();
            int draw = rand.nextInt(jokes.size());
            return jokes.get(draw);
        }
    }
    
    public void printJokes() {
        if(this.jokes.isEmpty()) {
            System.out.println("There are no jokes stored.");
        }
        
        for(String joke : jokes) {
            System.out.println(joke);
        }
    }
    
}
