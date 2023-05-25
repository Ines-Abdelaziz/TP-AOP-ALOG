package exo2;

public abstract class Addon {

    private String name;
    private double price;

    public Addon(String name, double price) {
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