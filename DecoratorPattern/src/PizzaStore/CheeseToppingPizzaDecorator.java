package PizzaStore;

public class CheeseToppingPizzaDecorator extends PizzaDecorator{
    public CheeseToppingPizzaDecorator(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getCost()
    {
        return super.getCost()+50;
    }
}
