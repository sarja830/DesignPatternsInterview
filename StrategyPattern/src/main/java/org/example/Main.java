package main.java.org.example;


import main.java.org.example.Strategy.CreditCardStrategy;
import main.java.org.example.Strategy.PaypalStrategy;

public class Main {
    public static void main(String[] args) {
        CreditCardStrategy creditCardStrategy = new CreditCardStrategy();
        creditCardStrategy.setCard(new CreditCard(12124432,123,"12 Jan", "Sarthak Jain"));
        PaymentService paymentService = new PaymentService();
//        paymentService.setPaymentStrategy(creditCardStrategy);
        paymentService.processPayment(100);

        PaypalStrategy paypalStrategy = new PaypalStrategy(1234, "test!2343");
        PaymentService paymentService1 = new PaymentService();
        paymentService1.setPaymentStrategy(paypalStrategy);
        paymentService1.processPayment(2000);


    }
}