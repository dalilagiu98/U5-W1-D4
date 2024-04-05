package dalila.u5w1d4.entities;

import lombok.Getter;

//LOMBOK:
@Getter
public abstract class Product {
    //ATTRIBUTES LIST:
    protected int calories;
    protected double price;

    //CONSTRUCTOR:
    public Product(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }
}
