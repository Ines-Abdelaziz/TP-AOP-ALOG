package exo2;


public class MilkDecorator extends Addon {

    public MilkDecorator(CoffeeOrder order) {
        super("Milk", 10);
        apply(order);
    }

    @Override
    public void apply(CoffeeOrder order) {
        order.addAddon(this);
    }

}
