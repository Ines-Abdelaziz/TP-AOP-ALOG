package aspects;

public class SugarDecorator extends AddO {

    public SugarDecorator(CoffeeOrder order) {
        super("Sugar", 5);
        apply(order);
    }

    @Override
    public void apply(CoffeeOrder order) {
        order.addAddon(this);
    }

}
