package exo2;

public class SugarDecorator extends Addon {

    public SugarDecorator(CoffeeOrder order) {
        super("Sugar", 5);
        apply(order);
    }

    @Override
    public void apply(CoffeeOrder order) {
        order.addAddon(this);
    }

}
