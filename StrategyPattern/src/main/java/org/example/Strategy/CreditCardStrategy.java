package main.java.org.example.Strategy;

import lombok.Setter;
import main.java.org.example.CreditCard;
import main.java.org.example.Strategy.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {
    @Setter
    private CreditCard card;
    @Override
    public void addPaymentMethod() {
        System.out.println("adding payment method as Credit Card" );
    }

    @Override
    public boolean verifyCredentials() {
        System.out.println("verifying credit card creds from the server ");
        return true;
    }

    @Override
    public int pay() {
        System.out.println("paying from the third party");
        return 0;
    }
}
