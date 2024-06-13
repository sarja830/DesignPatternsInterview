package burgerStore;

public class BurgerKing {
    public static void main(String[] args) {
        // Order: Chicken Burger with Cheese, Veggies and burgerStore.Chips
        Meal burgerMeal = new VegBurger();
        burgerMeal = new Chips(burgerMeal);
        burgerMeal = new Chips(burgerMeal);
        burgerMeal = new Chips(burgerMeal);
        System.out.println("Order placed: " + burgerMeal.getDescription());
        System.out.println("Price: " + burgerMeal.getPrice());
    }

}
