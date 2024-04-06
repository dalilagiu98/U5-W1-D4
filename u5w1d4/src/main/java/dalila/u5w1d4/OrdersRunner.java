package dalila.u5w1d4;

import dalila.u5w1d4.entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class OrdersRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5w1d4Application.class);
        try {
            Menu menu = ctx.getBean(Menu.class);
            menu.printMenu();

            Table table1 = ctx.getBean(Table.class);

            Order order1= new Order(4, table1);

            order1.addProduct(ctx.getBean("pizza_margherita", Pizza.class));
            order1.addProduct(ctx.getBean("pizza_margherita", Pizza.class));
            order1.addProduct(ctx.getBean("hawaiian_pizza", Pizza.class));
            order1.addProduct(ctx.getBean("lemonade", Drink.class));
            order1.addProduct(ctx.getBean("water", Drink.class));
            order1.addProduct(ctx.getBean("water", Drink.class));

            System.out.println("TABLE DETAILS:");
            order1.print();

            System.out.println("THE BILL FOR THE TABLE IS: ");
            System.out.println(order1.getTotal());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            ctx.close();
        }
    }
}
