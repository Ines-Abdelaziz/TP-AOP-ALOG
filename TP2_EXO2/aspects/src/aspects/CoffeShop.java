package aspects;

public class CoffeShop {

    public static void main(String[] args) {

        // Create a new coffee order
        CoffeeOrder order = new CoffeeOrder("Espresso", 30);
        // Add cream and sugar to the order
       new CreamDecorator(order);
       new SugarDecorator(order);

        // Print the order details
        order.printOrderDetails();
        // Remove sugar from the order
        order.removeAddon("Sugar");

        // Print the order details again
        order.printOrderDetails();
    }

}