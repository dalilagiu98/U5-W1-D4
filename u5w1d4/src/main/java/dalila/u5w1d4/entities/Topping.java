package dalila.u5w1d4.entities;

public class Topping extends Product{

    //ATTRIBUTES LIST:
    private String name;

    //CONSTRUCTOR:
    public Topping(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }
}
