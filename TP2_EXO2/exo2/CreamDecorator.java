package exo2;
public class CreamDecorator extends Addon {

    public CreamDecorator(CoffeeOrder order) {
        super("Cream", 15);
        apply(order);
    }

    @Override
    public void apply(CoffeeOrder order) {
        order.addAddon(this);
    }

}