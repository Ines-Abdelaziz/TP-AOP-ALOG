package aspects;

public abstract class AddO {
    private String name;
    private double price;

    public AddO(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void apply(CoffeeOrder order);
}
