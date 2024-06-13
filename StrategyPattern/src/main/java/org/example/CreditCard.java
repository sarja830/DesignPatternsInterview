package main.java.org.example;

import lombok.Data;

@Data
public class CreditCard {
    private int cardNo;
    private int cvv;
    private String expiry;
    private String name;

    public CreditCard(int cardNo, int cvv, String expiry, String name) {
        setCardNo(cardNo);
        setCvv(cvv);
        setName(name);
        setExpiry(expiry);
    }
}
