package dalila.u5w1d4.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class AppConfiguration {
    //TOPPING BEANS:
    @Bean
    public Topping toppingTomatoBean() {
        return new Topping("Tomato", 0, 0);
    }

    @Bean
    public Topping toppingCheeseBean() {
        return new Topping("Cheese", 92, 0.69);
    }

    @Bean
    public Topping toppingHamBean() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean
    public Topping toppingOnionsBean() {
        return new Topping("Onions", 22, 0.69);
    }

    @Bean
    public Topping toppingPineappleBean() {
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean
    public Topping toppingSalamiBean() {
        return new Topping("Salami", 86, 0.99);
    }
    //PIZZA BEANS:
    @Bean(name = "pizza_margherita")
    public Pizza pizzaMargheritaBean (){
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(toppingTomatoBean());
        toppingList.add(toppingCheeseBean());
        return new Pizza("Pizza Margherita", toppingList);
    }

    @Bean(name = "hawaiian_pizza")
    public Pizza HawaiianPizzaBean (){
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(toppingTomatoBean());
        toppingList.add(toppingCheeseBean());
        toppingList.add(toppingHamBean());
        toppingList.add(toppingPineappleBean());
        return new Pizza("Hawaiian Pizza", toppingList);
    }

    @Bean(name = "salami_pizza")
    public Pizza SalamiPizzaBean (){
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(toppingTomatoBean());
        toppingList.add(toppingCheeseBean());
        toppingList.add(toppingSalamiBean());
        return new Pizza("Salami Pizza", toppingList);
    }

    //DRINK BEANS:
    @Bean(name = "lemonade")
    public Drink lemonadeBean() {
        return new Drink("Lemonade", 128, 1.29);
    }

    @Bean(name = "water")
    public Drink waterBean() {
        return new Drink("Water", 0, 1.29);
    }

    @Bean(name = "wine")
    public Drink wineBean() {
        return new Drink("Wine", 607, 7.49);
    }

    //MENU BEAN:
    @Bean
    public Menu menuBean() {
        List<Pizza> pizzaList = new ArrayList<>();
        List<Topping> toppingList = new ArrayList<>();
        List<Drink> drinkList = new ArrayList<>();

        pizzaList.add(pizzaMargheritaBean());
        pizzaList.add(HawaiianPizzaBean());
        pizzaList.add(SalamiPizzaBean());

        toppingList.add(toppingTomatoBean());
        toppingList.add(toppingCheeseBean());
        toppingList.add(toppingOnionsBean());
        toppingList.add(toppingHamBean());
        toppingList.add(toppingSalamiBean());
        toppingList.add(toppingPineappleBean());

        drinkList.add(lemonadeBean());
        drinkList.add(waterBean());
        drinkList.add(wineBean());

        return new Menu(pizzaList, drinkList, toppingList);
    }

    @Bean("pizzas")
    List<Pizza> pizzaList() {
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(pizzaMargheritaBean());
        pizzas.add(HawaiianPizzaBean());
        pizzas.add(SalamiPizzaBean());
        return pizzas;
    }

    @Bean("drinks")
    List<Drink> drinksList() {
        List<Drink> drinks = new ArrayList<>();
        drinks.add(lemonadeBean());
        drinks.add(waterBean());
        drinks.add(wineBean());
        return drinks;
    }

    @Bean("toppings")
    List<Topping> toppingsList() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(toppingTomatoBean());
        toppings.add(toppingCheeseBean());
        toppings.add(toppingSalamiBean());
        toppings.add(toppingHamBean());
        toppings.add(toppingPineappleBean());
        return toppings;
    }

    @Bean("Table1")
    @Primary
    Table getTable1(@Value("${seat.price}") double seatPrice) {
        return new Table(1, 5, true, seatPrice);
    }

    @Bean("Table2")
    Table getTable2(@Value("${seat.price}") double seatPrice) {
        return new Table(2, 4, true, seatPrice);
    }

    @Bean("Table3")
    Table getTable3(@Value("${seat.price}") double seatPrice) {
        return new Table(3, 8, true, seatPrice);
    }

}
