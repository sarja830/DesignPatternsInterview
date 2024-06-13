package main.java.org.example;

import lombok.Setter;
import main.java.org.example.Strategy.PaypalStrategy;


@Setter
public class PaymentService {

    private PaypalStrategy paymentStrategy;
    private int cost;

    void processPayment(int cost)
    {
        this.cost = cost;
        paymentStrategy.addPaymentMethod();
        if(paymentStrategy.verifyCredentials())
            paymentStrategy.pay();

    }
    private int getCost()
    {
        return cost;
    }
}
