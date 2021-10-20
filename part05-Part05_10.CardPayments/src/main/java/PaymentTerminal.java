
public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000.0;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum > 0) { 
            this.money += sum;
            card.addMoney(sum);
        }
    }

    public double eatAffordably(double payment) {
        if(payment >= 2.50) {
            this.money += 2.50;
            this.affordableMeals++;
            return payment -= 2.50;
            
        }
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return payment;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        if(card.takeMoney(2.50)) {
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public double eatHeartily(double payment) {
        if(payment >= 4.30) {
            this.money += 4.30;
            this.heartyMeals++;
            return payment -= 4.30;
        }

        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return payment;
    }
    
    public boolean eatHeartily(PaymentCard card) {
        if(card.takeMoney(4.30)) {
            this.heartyMeals++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
