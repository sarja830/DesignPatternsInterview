package main.java.org.example.Strategy;

import lombok.AllArgsConstructor;
import lombok.Setter;


public class PaypalStrategy implements PaymentStrategy {
    private int userName;
    private  String password;

    public PaypalStrategy(int userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    @Override
    public void addPaymentMethod() {
        System.out.println("adding payment method as paypal" );
    }

    @Override
    public boolean verifyCredentials() {
        System.out.println("verifying paypal creds from the server ");
        return true;
    }

    @Override
    public int pay() {
        System.out.println("paying from the third party paypal");
        return 0;
    }
}
