package dalila.u5w1d4.entities;

import java.util.List;

public class Menu {
    //ATTRIBUTES LIST:
    private List<Pizza> pizzaList;
    private List<Drink> drinkList;
    private List<Topping> toppingList;

    //CONSTRUCTORS:
    public Menu(List<Pizza> pizzaList, List<Drink> drinkList, List<Topping> toppingList) {
        this.pizzaList = pizzaList;
        this.drinkList = drinkList;
        this.toppingList = toppingList;
    }

    //METHODS:
    public void printMenu() {
        System.out.println("---------------MENU'---------------");
        System.out.println("---------------PIZZAS---------------");
        this.pizzaList.forEach(System.out::println);
        System.out.println("---------------TOPPINGS---------------");
        this.toppingList.forEach(System.out::println);
        System.out.println("---------------DRINKS---------------");
        this.drinkList.forEach(System.out::println);
    }
}
