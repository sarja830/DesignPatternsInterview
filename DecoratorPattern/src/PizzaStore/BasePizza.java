package PizzaStore;

public abstract class BasePizza {
    private int cost;
    private String description;
    public int getCost()
    {
        return cost;
    }
    public void setCost(int cost)
    {
        this.cost = cost;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public  String  getDescription()
    {
        return description;
    }


}
