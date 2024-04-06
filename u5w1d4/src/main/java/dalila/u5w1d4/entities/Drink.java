package dalila.u5w1d4.entities;

import lombok.ToString;

public class Drink extends Product{
    //ATTRIBUTES LIST:
    private String name;

    //CONSTRUCTOR:
    public Drink(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
