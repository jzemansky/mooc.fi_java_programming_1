
public class YourFirstAccount {

    public static void main(String[] args) {
        Account jakesAccount = new Account ("Jake's Account", 100.0);
        jakesAccount.deposit(20.0);
        System.out.println(jakesAccount);
    }
}
