package burgerStore;

public abstract class Meal {
    String description;
    double price;
    public String getDescription() {
        return description;
    }
    public abstract double getPrice();
}