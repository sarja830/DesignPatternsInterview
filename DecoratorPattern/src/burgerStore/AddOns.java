package burgerStore;

public abstract class AddOns extends Meal {
    public abstract String getDescription();
}
 class Chips extends AddOns {
    private double PRICE = 10.0;
    private Meal meal;
    public Chips(Meal meal) {
        this.meal = meal;
    }
    public String getDescription() {
        return meal.getDescription() + ", burgerStore.Chips";
    }
    public double getPrice() {
        return PRICE + meal.getPrice();
    } }