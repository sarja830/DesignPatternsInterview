package main.java.org.example.Strategy;

public interface PaymentStrategy {
    void addPaymentMethod();
    boolean verifyCredentials();
    int pay();
}
