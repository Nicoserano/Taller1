import logic.BankAccount;
import logic.Fruit;
public class Main {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit();
        System.out.println("your fruit is:"+ fruit1.getName() );
        System.out.println("the weight of its fruit is:"+fruit1.getAverageWeight());
        System.out.println("the color of its fruit is:"+fruit1.getColors().get(0));
        BankAccount account = new BankAccount();
        System.out.println("your number of account is:"+ account.getAccountNumber());
    }
}