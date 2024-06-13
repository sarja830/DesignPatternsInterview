package PizzaStore;

public class Store {
    public static void main(String[] args) {
        BasePizza veggiePizza = new VeggiePizza();
        CheeseToppingPizzaDecorator cheeseToppingPizzaDecorator = new CheeseToppingPizzaDecorator(veggiePizza);
        System.out.println(cheeseToppingPizzaDecorator.getCost());
        CheeseToppingPizzaDecorator cheeseToppingPizzaDecorator1 = new CheeseToppingPizzaDecorator(cheeseToppingPizzaDecorator);
        System.out.println(cheeseToppingPizzaDecorator.getCost());
    }
}