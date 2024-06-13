package PizzaStore;

public class PizzaDecorator extends BasePizza {
    BasePizza basePizza;
    public PizzaDecorator(BasePizza basePizza)
    {
        this.basePizza = basePizza;
    }

}
