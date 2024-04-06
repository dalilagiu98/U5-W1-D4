package dalila.u5w1d4.entities;

public class Drink extends Product{
    //ATTRIBUTES LIST:
    private String name;

    //CONSTRUCTOR:
    public Drink(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

}
