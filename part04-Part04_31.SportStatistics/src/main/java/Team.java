
public class Team {
    private String home;
    private String visitor;
    private int hpoints;
    private int vpoints;
    private int games;
    private int wins;
    private int losses;
    
    public Team(String hname, String vname, int hpoints, int vpoints) {
        this.home = hname;
        this.visitor = vname;
        this.hpoints = hpoints;
        this.vpoints = vpoints;        
    }
    
    public String getHomeTeam() {
        return this.home;
    }
    
    public String getVisitorTeam() {
        return this.visitor;
    }
    
    public int getHomeScore() {
        return this.hpoints;
    }
    
    public int getVisitorScore() {
        return this.vpoints;
    }
    
    public int getWins() {
        return this.wins;
    }
    
    public int getLosses() {
        return this.losses;
    }
    
    public int setWins() {
        return this.wins++;
    }
    
    public int setLosses() {
        return this.losses++;
    }
    
    public int playGame() {
        return this.games++;
    }
    
    
}
