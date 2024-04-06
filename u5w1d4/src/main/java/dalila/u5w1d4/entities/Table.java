package dalila.u5w1d4.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

//LOMBOK:
@AllArgsConstructor
@Getter
public class Table {
    //ATTRIBUTES LIST:
    private int tableNumber;
    private int maxNumberSeats; //=coperto
    private boolean isFree;
    private double costPlace;

    //METHODS:
    public void print() {
        System.out.println("Number of table: " + tableNumber);
        System.out.println("max number of places: " + maxNumberSeats);
        System.out.println("free/busy? " + (this.isFree? "Free" : "Busy"));
    }
}
