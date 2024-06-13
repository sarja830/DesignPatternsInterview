package PizzaStore;

public class MushroomToppingPizzaDecorator extends PizzaDecorator{

    public MushroomToppingPizzaDecorator(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getCost() {
        return super.getCost()+100;
    }
}
