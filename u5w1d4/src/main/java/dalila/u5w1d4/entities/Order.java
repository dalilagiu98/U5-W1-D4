package dalila.u5w1d4.entities;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    //ATTRIBUTES LIST:
    private int orderNumber;
    private Table table;
    private State state;
    private int numberSeats;
    private LocalTime acquisitionTime;
    private List<Product> orderedProducts;

    //CONSTRUCTOR:
    public Order(int numberSeats, Table table) {
        Random random = new Random();
        if(table.getMaxNumberSeats() <= numberSeats) {
            throw new RuntimeException("Number of seats greater than the capacity of the table!")
        }
        this.orderNumber = random.nextInt(1,100000);
        this.state = State.IN_PROGRESS;
        this.numberSeats = numberSeats;
        this.acquisitionTime = LocalTime.now();
        this.orderedProducts = new ArrayList<>();
        this.table = table;
    }

    //METHODS:
    //Method to add products in ordered products list:
    public void addProduct(Product product) {
         this.orderedProducts.add(product);
    }

    //Method to get total cost:
    public double getTotal() {
        return this.orderedProducts.stream().mapToDouble(Product::getPrice).sum() + (this.table.getCostPlace() * this.numberSeats);
    }

    //Method to print the order:
    public void print(){
        System.out.println("------------ORDER n." + this.orderNumber + " ------------");
        System.out.println("State: " + this.state);
        System.out.println("Number of seats: " + this.numberSeats);
        System.out.println("Acquisition time: " + this.acquisitionTime);
        System.out.println("Table number: " + this.table.getTableNumber());
        System.out.println("Ordered product: ");
        this.orderedProducts.forEach(System.out::println);
        System.out.println("TOTAL COST: " + this.getTotal());
    }

}
