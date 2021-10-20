
public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }
    
    public int priceDifference(Apartment compared) {
        int price = this.squares * this.pricePerSquare;
        int comprice = compared.squares * compared.pricePerSquare;
        
        price -= comprice;
        if(price < 0) {
            return price * -1;
        }
        return price;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int price = this.squares * this.pricePerSquare;
        int comprice = compared.squares * compared.pricePerSquare;
        
        return price > comprice;
    }
    
}
