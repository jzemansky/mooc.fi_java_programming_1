
public class Timer {
    private ClockHand hun;
    private ClockHand sec;
    
    public Timer() {
        this.hun = new ClockHand(100);
        this.sec = new ClockHand(60);
              
    }
    
    public void advance() {
       this.hun.advance();
        
        if(this.hun.value() == 0) {
            this.sec.advance();
        }
    }
    
    public String toString() {
        return this.sec + ":" + this.hun;
    }
}
