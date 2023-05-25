package aspects;

public class CreamDecorator extends AddO {

    public CreamDecorator(CoffeeOrder order) {
        super("Cream", 15);
        apply(order);
    }

    @Override
    public void apply(CoffeeOrder order) {
        order.addAddon(this);
    }

}