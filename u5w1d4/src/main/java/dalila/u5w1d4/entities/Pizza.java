package dalila.u5w1d4.entities;

import lombok.ToString;

import java.util.List;


public class Pizza extends Product{

    //ATTRIBUTES LIST:
    private String name;
    private List<Topping> toppingList;

    //CONSTRUCTOR:
    public Pizza(String name, List<Topping> toppingList) {
        super(700, 4.50);
        this.name = name;
        this.toppingList = toppingList;
        this.calories = setCalories(toppingList);
        this.price = setPrice(toppingList);
    }

    //METHODS:
    //Method for setting calories based on pizza toppings
    public int setCalories (List<Topping> toppingList) {
        int totCalories = 700;
        if(toppingList != null) {
            for (int i = 0; i < toppingList.size(); i++) {
                totCalories += toppingList.get(i).getCalories();
            }
        }
        return totCalories;
    }

    //Method for setting price based on the type and quantity of topping:
    public double setPrice (List<Topping> toppingList) {
        double totPrice = 4.50;
        if (toppingList != null) {
            for(int i=0; i < toppingList.size(); i++) {
                totPrice += toppingList.get(i).getPrice();
            }
        }
        return totPrice;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", toppingList=" + toppingList +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
