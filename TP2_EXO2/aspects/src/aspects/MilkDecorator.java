package aspects;

public class MilkDecorator extends AddO {

    public MilkDecorator(CoffeeOrder order) {
        super("Milk", 10);
        apply(order);
    }

    @Override
    public void apply(CoffeeOrder order) {
        order.addAddon(this);
    }

}
