package burgerStore;

public class VegBurger extends Meal {

    VegBurger() {
        description = "Veg Burger";
        price = 60.0;
    }

    @Override
    public double getPrice() {
        return 60;
    }
}